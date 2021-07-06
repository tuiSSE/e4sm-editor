package e4sm.de.metamodel.design.analysis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.common.graph.GraphBuilder;
import com.google.common.graph.MutableGraph;

import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.Model;
import e4sm.de.metamodel.e4sm.Package;

public class DependencyGraph {

	private MutableGraph<Component> graph;

	/**
	 * Initializes the graph attribute.
	 * 
	 * @param override when true, a new graph is always created.
	 */
	private void initializeGraph(boolean override) {
		if (graph == null || override) {
			graph = GraphBuilder.directed().build();
		}
	}

	/**
	 * Computes the dependency graph of a given package.
	 * 
	 * @param aPackage
	 */
	public void computePackageDependencyGraph(Package aPackage) {
		System.out.println("Computing dependency graph for the package " + aPackage.getName());
		initializeGraph(false);
		// Add all components to the graph
		aPackage.getAllComponents().forEach(c -> {
			computeComponentDependencyGraph(c);
		});
		aPackage.getConnectors().forEach(c -> {
			if (c != null && c.getSource() != null && c.getTarget() != null) {
				System.out.println("Connector: " + c.getName());
				graph.putEdge((Component) c.getSource().eContainer(), (Component) c.getTarget().eContainer());
			}
		});
	}

	private void computeComponentDependencyGraph(Component c) {
		System.out.println("Computing dependency graph for the component " + c.getName());
		// initializeGraph(false); Uncomment if this method is made "public"
		System.out.println(" added to graph:" + graph.addNode(c));
		Package specifiedIn = c.getSpecifiedInPackage();
		if (specifiedIn != null) {
			// This component is specified in a package
			System.out.println("Adding sub-specified component" + specifiedIn.getName());
			computePackageDependencyGraph(specifiedIn);
		} else {
			// This component may contain other components
			c.getComponents().forEach(sc -> {
				computeComponentDependencyGraph(sc);
			});
		}
	}

	/**
	 * Computes the dependency graph of a given model.
	 * 
	 * @param aModel
	 */
	public void computeModelDependencyGraph(Model aModel) {
		System.out.println("Computing dependency graph for the model " + aModel.getName());
		initializeGraph(true);
		// System.out.println(URI.createPlatformResourceURI("test.gv", false));
		aModel.getPackages().forEach(p -> computePackageDependencyGraph(p));
		String fileName = "graph.gv";
		try {
			exportToDOTFile(graph, fileName);
			generatePDF(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Converts a given graph to the dot format
	 * 
	 * @param graph
	 * @return a String with containing the dot model
	 */
	public String exportToDOT(MutableGraph<Component> graph) {
		System.out.println("Generating the Dot String...");
		final StringBuilder builder = new StringBuilder();
		builder.append("digraph graphname {\r\n");
		graph.nodes().forEach(n -> {

			builder.append("\"" + n.eResource().getURIFragment(n) + "\"[label=\"" + n.getName() + "\"];\r\n");
		});
		graph.edges().forEach(edge -> {
			builder.append("\"" + edge.source().eResource().getURIFragment(edge.source()) + "\" -> \"" 
					+ edge.target().eResource().getURIFragment(edge.target()) + "\"\r\n");
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
	 * @param graph
	 * @param fileName
	 * @throws IOException
	 */
	public void exportToDOTFile(MutableGraph<Component> graph, String fileName) throws IOException {
		final String dot = exportToDOT(graph);
		final File f = new File(fileName);
		// TODO: find a better place, see
		// https://www.eclipse.org/forums/index.php/t/1084236/
		System.out.println("Writing graph to " + f.getAbsolutePath());
		final FileWriter fw = new FileWriter(f);
		BufferedWriter writer = new BufferedWriter(fw);
		writer.write(dot);
		writer.close();
	}
}
