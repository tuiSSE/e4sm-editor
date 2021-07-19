package e4sm.de.metamodel.design.analysis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.common.graph.MutableNetwork;
import com.google.common.graph.NetworkBuilder;

import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.Connector;
import e4sm.de.metamodel.e4sm.Model;
import e4sm.de.metamodel.e4sm.Package;

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
		System.out.println("Computing dependency graph for the package " + aPackage.getName());
		MutableNetwork<Component, Connector> network = initializeGraph();
		// Add all components to the network
		computePackageDependencyGraphInNetwork(aPackage, network);
		return network;
	}

	private static MutableNetwork<Component, Connector> computePackageDependencyGraphInNetwork(Package aPackage,
			MutableNetwork<Component, Connector> network) {
		System.out.println("Computing dependency graph for the package " + aPackage.getName());
		// Add all components to the graph
		aPackage.getAllComponents().forEach(c -> {
			computeComponentDependencyGraphInNetwork(c, network);
		});
		aPackage.getConnectors().forEach(c -> {
			if (c != null && c.getSource() != null && c.getTarget() != null) {
				System.out.println("Connector: " + c.getName());
				network.addEdge((Component) c.getSource().eContainer(), (Component) c.getTarget().eContainer(), c);
			}
		});
		return network;
	}

	private static MutableNetwork<Component, Connector> computeComponentDependencyGraphInNetwork(Component c,
			MutableNetwork<Component, Connector> network) {
		System.out.println("Computing dependency graph for the component " + c.getName());
		// initializeGraph(false); Uncomment if this method is made "public"
		System.out.println(" added to graph:" + network.addNode(c));
		Package specifiedIn = c.getSpecifiedInPackage();
		if (specifiedIn != null) {
			// This component is specified in a package
			System.out.println("Adding sub-specified component" + specifiedIn.getName());
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
		System.out.println("Computing dependency graph for the model " + aModel.getName());
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
		System.out.println("Generating the Dot String...");
		final StringBuilder builder = new StringBuilder();
		builder.append("digraph graphname {\r\n");
		network.nodes().forEach(n -> {

			builder.append("\"" + n.eResource().getURIFragment(n) + "\"[label=\"" + n.getName() + "\"];\r\n");
		});
		network.edges().forEach(edge -> {
			builder.append("\"" + edge.getSource().eResource().getURIFragment(edge.getSource()) + "\" -> \""
					+ edge.getTarget().eResource().getURIFragment(edge.getTarget()) + "\"\r\n");
		});
		builder.append("}");
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
