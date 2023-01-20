package abcd.xy.metamodel.design;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.util.EcoreUtil;

import abcd.xy.metamodel.abcd.Model;

import abcd.xy.metamodel.acceleo.documentation.main.Generate;

// Currently unused (did not work)
// right click on the model file, and select:
// "Acceleo Model to Text" > "Generate Documentation"
public class Documentation {
	private Generate g;

	public Boolean generateDocumentation(Model m) {
		
		Utils.debug("\n\n====================\nGenerate documentation\n====================\n");
		var inputURI = EcoreUtil.getURI(m);
		Utils.debug(inputURI.toString());

		var parts = inputURI.toString().split("/");
		var projectPath = "";
		var modelFileName = "";
		for (int i = 0; i < parts.length; i++) {
			if (parts[i].contains("#")) {
				// example: "model.abcd#"
				modelFileName = parts[i].substring(0, parts[i].indexOf("."));
				break;
			} else {
				projectPath += (parts[i] + "/");
			}
		}
		Utils.debug("\nProject path: " + projectPath);
		Utils.debug("\nModel file name: " + modelFileName);

			
	    // Using the default output SCPN/model_name.xml"
		//var outputPath = projectPath + "ABCD_Scenario1/doc/";
		var outputPath =  "ABCD_Scenario1/doc/";
		
		File targetDir = new File(outputPath);
		try {
			Utils.debug("\nGenerating the documentation at the path: " + targetDir);
			g = new Generate(m, targetDir, Collections.emptyList());
			Utils.debug("\nobject created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			Utils.debug("\nException: the module cannot be found, or it cannot be loaded");
			e.printStackTrace();
			return false;
		}
		var monitor = new BasicMonitor();
		try {
			Utils.debug("\nStart generation");
			g.doGenerate(monitor);
			Utils.debug("\nGeneration completed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
