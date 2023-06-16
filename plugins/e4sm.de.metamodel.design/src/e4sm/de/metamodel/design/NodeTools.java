/**
 * 
 */
package e4sm.de.metamodel.design;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.URI;

final public class NodeTools {
	private NodeTools() {
		
	}
	/**
	 * Checks if the npm command is available
	 * @return true if available, false otherwise
	 */
	public static boolean checkNpm() {
		try{
			var rt = Runtime.getRuntime();
			Process pr;
			if(System.getProperty("os.name").toLowerCase().startsWith("windows")) {
				pr = rt.exec(new String[] {"cmd.exe", "/c", "npm -version"});
			}
			else{
				pr = rt.exec(new String[] {" /bin/sh", "-c", "npm -version"});
			}
			int exitVal = pr.waitFor();
			if(exitVal == 0) {
				Utils.debug("npm found");
				return true;
			}
		}
		catch(IOException e){
			System.err.println("Execution error during npm version check");
			System.out.println(e.toString());
			e.printStackTrace();
		}
		catch(InterruptedException e) {
			System.err.println(e.toString());
			e.printStackTrace();
		}
		System.err.println("npm not found, please check installation");
		return false;
	}
	
	/**
	 * Checks if the tn-fix-xml command is available
	 * @return true if available, false otherwise
	 */
	public static boolean checkTnFix() {
		try{
			var rt = Runtime.getRuntime();
			Process pr;
			if(System.getProperty("os.name").toLowerCase().startsWith("windows")) {
				pr = rt.exec(new String[] {"cmd.exe", "/c", "tn-fix-xml"});
			}
			else {
				pr = rt.exec(new String[] {"/bin/sh", "-c", "tn-fix-xml"});
			}
			int exitVal = pr.waitFor();
			if(exitVal == 0) {
				Utils.debug("tn-fix-xml found");
				return true;
			}
		}
		catch(IOException e){
			System.err.println("Execution error during tn-fix-xml check");
			System.out.println(e.toString());
			e.printStackTrace();
		}
		catch(InterruptedException e) {
			System.err.println(e.toString());
			e.printStackTrace();
		}
		System.err.println("tn-fix-xml not found, please check installation");
		return false;
	}
	
	/**
	 * uses the tn-fix-xml to optimize an already existing scpn
	 * @return optimized scpn files
	 */
	public static boolean optimizePN(String path, String pName) {
		
		try {
			var rt = Runtime.getRuntime();
			var name = pName.replaceAll(" ", "_") + ".xml"; //#name_of_package.xml
			var npmCommand = "tn-fix-xml \""+ name + "\" -a -o"; //tn-fix-xml #name_of_package.xml -a -o
			
			System.out.println("npmCommand: " + npmCommand);
			
			
			if(System.getProperty("os.name").toLowerCase().startsWith("windows")) {
				var commandWin = "cmd.exe /C \"cd \"" + path + "\" && " + npmCommand+"\""; //cmd.exe cd #path_to_package && npmCommand
				Utils.debug("\nRunning command: " + commandWin);
			}
			else {
				var commandUnix = "/bin/sh -c \"cd \"" + path + "\" && " + npmCommand+"\"";
				Utils.debug("\nRunning command: " + commandUnix);
			}
			
			System.out.println("Path: " + path);
			
			String changeDir = "cd " + path;

			System.out.println("changeDir: " + changeDir);
			
			String usedCommand = changeDir + " && " + npmCommand;
			
			System.out.println("usedCommand: " + usedCommand);
			
			Process pr;
			if(System.getProperty("os.name").toLowerCase().startsWith("windows")) {
				pr = rt.exec(new String[] {"cmd.exe", "/c", usedCommand});
			}
			else {
				pr = rt.exec(new String[] {"/bin/sh", "-c", usedCommand});
			}
			
			var in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			String line = null;

			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
			
			int exitVal = pr.waitFor();
			System.out.println("Exited with exit code " + exitVal);
			if(exitVal == 0) { //check exit code == 0 for success
				System.out.println("Success");
				return true;
			}	
		} catch (IOException e) {
			System.err.println("Execution error during tn-fix-xml");
			System.out.println(e.toString());
			e.printStackTrace();
			return false;
		} catch (InterruptedException e) {
			System.err.println(e.toString());
			e.printStackTrace();
			return false;
		}
		return false;
	}
}
