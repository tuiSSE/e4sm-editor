package e4sm.de.metamodel.design.analysis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Optional;
import java.util.Random;

import com.google.common.graph.MutableNetwork;
import com.google.common.graph.NetworkBuilder;
import com.google.common.graph.SuccessorsFunction;
import com.google.common.graph.Traverser;

import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.Connector;
import e4sm.de.metamodel.e4sm.InputPin;
import e4sm.de.metamodel.e4sm.Model;
import e4sm.de.metamodel.e4sm.OutputPin;
import e4sm.de.metamodel.e4sm.Package;
import e4sm.de.metamodel.e4sm.Pin;
import e4sm.de.metamodel.e4sm.Sensor;
import e4sm.de.metamodel.design.Utils;

public class NetworkUtils {

	/**
	 * Initializes an E4SM Network (MutableNetwork<Component, Connector>).
	 * 
	 */
	private static MutableNetwork<Component, Connector> initializeGraph() {
		return NetworkBuilder.directed().allowsParallelEdges(true).build();
	}

	/**
	 * Initializes and returns the network of a given package.
	 * 
	 * @param {Package} aPackage
	 */
	public static MutableNetwork<Component, Connector> generateNetwork(Package aPackage) {
		Utils.debug("Computing dependency graph for the package " + aPackage.getName());
		MutableNetwork<Component, Connector> network = initializeGraph();
		// Add all components to the network
		computePackageDependencyGraphInNetwork(aPackage, network);
		return network;
	}

	private static MutableNetwork<Component, Connector> computePackageDependencyGraphInNetwork(Package aPackage,
			MutableNetwork<Component, Connector> network) {
		Utils.debug("Computing dependency graph for the package " + aPackage.getName());
		// Add all components to the graph
		aPackage.getAllComponents().forEach(c -> {
			computeComponentDependencyGraphInNetwork(c, network);
		});
		aPackage.getConnectors().forEach(c -> {
			// Check if the source or target pin are "gateway pins"
			if (c != null && c.getSource() != null && c.getTarget() != null) {
				Utils.debug("Connector: " + c.getName());
				// If the edge leads to an output pin of this package
				Component realSource = (Component) c.getSource().eContainer();
				Component realTarget = (Component) c.getTarget().eContainer();
				if (c.getSource() instanceof OutputPin && c.getSource().isGatewayPin()) {
					realSource = (Component) c.getSource().getIncomingConnectors().get(0).getSource().eContainer();
					if (c.getTarget().isGatewayPin()) {
						return;
					}
				}
				//Compute the actual target pin
				Pin realTargetPin = c.getTarget();
				while (realTargetPin instanceof OutputPin && realTargetPin.isGatewayPin() /*&& ((Component)c.getTarget().eContainer()).getComponents().size()==0*/) {
					realTargetPin = realTargetPin.getOutgoingConnectors().get(0).getTarget();
				}
				realTarget = (Component) realTargetPin.eContainer();
//				if(c.getTarget().eContainer().equals(c.getSource().eContainer().eContainer())) {
//					Utils.debug("EDGE TO PACKAGE PIN", true);
//				}else {
				Utils.debug(realSource.toString() + realTarget.toString());
				network.addEdge(realSource, realTarget, c);
//				}
			}
		});
		return network;
	}

	public static Iterable<Component> depthFirst(SuccessorsFunction<Component> sf, Component startNode) {
		return Traverser.forGraph(sf).depthFirstPreOrder(startNode);
	}

	private static MutableNetwork<Component, Connector> computeComponentDependencyGraphInNetwork(Component c,
			MutableNetwork<Component, Connector> network) {
		Utils.debug("Computing dependency graph for the component " + c.getName());
		// initializeGraph(false); Uncomment if this method is made "public"
		Utils.debug(" added to graph:" + network.addNode(c));
		Package specifiedIn = c.getSpecifiedInPackage();
		if (specifiedIn != null) {
			// This component is specified in a package
			Utils.debug("Adding sub-specified component" + specifiedIn.getName());
			computePackageDependencyGraphInNetwork(specifiedIn, network);
		} else {
			// This component may contain other components
			c.getComponents().forEach(sc -> {
				computeComponentDependencyGraphInNetwork(sc, network);
			});
		}
		return network;
	}

	/**
	 * Computes the dependency graph of a given model.
	 * 
	 * @param aModel
	 */
	public static MutableNetwork<Component, Connector> generateNetwork(Model aModel) {
		Utils.debug("Computing dependency graph for the model " + aModel.getName());
		MutableNetwork<Component, Connector> network = initializeGraph();
		// System.out.println(URI.createPlatformResourceURI("test.gv", false));
		aModel.getPackages().forEach(p -> computePackageDependencyGraphInNetwork(p, network));
		return network;
	}

	/**
	 * Converts a given graph to the dot format
	 * 
	 * @param network
	 * @return a String with containing the dot model
	 */
	public String exportToDOT(MutableNetwork<Component, Connector> network) {
		Utils.debug("Generating the Dot String...");
		final StringBuilder builder = new StringBuilder();
		builder.append("digraph graphname {\r\n");
		Utils.debug("NODES: " + network.nodes().toString());
		Optional<Component> startNode = network.nodes().stream().filter(n -> n instanceof Sensor && new Random().nextBoolean())
				.peek(e -> Utils.debug("FILTERED: " + e.getName())).findFirst();

		network.nodes().forEach(n -> {
			builder.append("\"" + n.eResource().getURIFragment(n) + "\"[label=\"" + n.getName() + "\"];\r\n");
		});
		network.edges().forEach(edge -> {
			builder.append(
					"\"" + edge.getSource().eResource().getURIFragment(edge.getSource().eContainer()) + "\" -> \""
							+ edge.getTarget().eResource().getURIFragment(edge.getTarget().eContainer()) + "\"\r\n");
		});

		if (startNode.isPresent()) {
			Utils.debug(startNode.get().getName() + " is the starting component");
			Iterable<Component> dbf = depthFirst(network, startNode.get());
			Utils.debug("depthFirst completed");
			int i = 0;
			Iterator<Component> it = dbf.iterator();
			while (it.hasNext() && i < 500) {
				Component c = it.next();
				if (i == 0) {
					Utils.debug("Start: " + c.getName());
					builder.append("\"" + c.eResource().getURIFragment(c) + "\"[color=\"blue\", label=\"" + c.getName()
							+ "\"];\r\n");
				} else {
					Utils.debug("Path: " + c.getName());
					builder.append("\"" + c.eResource().getURIFragment(c) + "\"[color=\"red\", label=\"" + c.getName()
							+ "\"];\r\n");
				}
				i++;
			}
			if (i >= 500) {
				System.err.println("Warning: max iteration limit reached.");
			}
		} else {
			System.err.println("Component not found");
		}
		builder.append("}");
		Utils.debug("exportToDot completed.");
		return builder.toString();
	}

	/**
	 * Asks the system to generate the PDF file from the dot file.
	 * 
	 * @param fileName
	 * @throws IOException
	 */
	public void generatePDF(String fileName) throws IOException {
		System.out.println("Generating the PDF...");
		// Generate to graph.pdf with: dot -O -Tpdf graph.gv
		String cmd = "dot -O -Tpdf " + fileName;
		Runtime run = Runtime.getRuntime();
		run.exec(cmd);
	}

	/**
	 * 
	 * @param network
	 * @param fileName
	 * @throws IOException
	 */
	public void exportToDOTFile(MutableNetwork<Component, Connector> network, String fileName) throws IOException {
		final String dot = exportToDOT(network);
		final File f = new File(fileName);
		// TODO: find a better place, see
		// https://www.eclipse.org/forums/index.php/t/1084236/
		System.out.println("Writing network to " + f.getAbsolutePath());
		final FileWriter fw = new FileWriter(f);
		BufferedWriter writer = new BufferedWriter(fw);
		writer.write(dot);
		writer.close();
		generatePDF(fileName);
	}
}
