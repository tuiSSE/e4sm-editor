package e4sm.de.timenet.runner;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.ecore.util.EcoreUtil;

import client.Client;
import client.SimulationParameters;
//import communication.ProtocolException;
import e4sm.de.metamodel.e4sm.Model;
import e4sm.de.metamodel.e4sm.Package;
//import gpal.codegen.CodeGen;
import gpsc.simulation.ServerThread;
//import server.Server;



public class TimenetSimRunner {
	public static int simRunner(Package p) {
		System.out.println("DEBUG: Preparing simulation process");
		
		var pName = p.getName();	
		if(pName == null || pName.isEmpty()){
			System.err.println("DEBUG: Package name is empty, process canceled");
			return 1;
		}
		
		System.out.println("DEBUG: Getting Path");
		// Get the path of the input model
		Model m = getModel(p);
		var inputURI = EcoreUtil.getURI(m);
		
		var parts = inputURI.toString().split("/");
		var projectPath = "";
		var modelFileName = "";
		for (int i = 0; i < parts.length; i++) {
			if (parts[i].contains("#")) {
				// example: "model.e4sm#"
				modelFileName = parts[i].substring(0, parts[i].indexOf("."));
				break;
			} else {
				projectPath += (parts[i] + "/");
			}
		}
		
		var absoluteInputPath = "";
		var inputPath = projectPath + "SCPN/" ;
		try {
			absoluteInputPath = FileLocator.resolve(new URL(inputPath.toString())).getPath();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		var path = absoluteInputPath + "/" + p.getName() + "_optimized.xml";
		System.out.println("DEBUG: Path is " + path);
		var outPath = absoluteInputPath + "/Codegen";
		String outputDir = projectPath + "SCPN/";
		var inputFile = p.getName() + "_optimized.xml";
		String netname = p.getName();
		boolean verbose = true;
		boolean cluster = false;
		
		/*System.out.println("DEBUG: Creating CodeGen");
		CodeGen cg = null;
		try  {
		cg = new CodeGen(outPath, inputFile, netname, verbose, cluster, System.out, System.err);
		}
		catch(Exception ex) {
			System.err.println(ex.getMessage());
			return 20;
		}
		
		System.out.println("DEBUG: Running CodeGen....");
		cg.run();
		System.out.println("DEBUG: Run complete!");*/
		
		//setup and start the server which will await a client and then start the codegen, make and simulation process
		var serverPort = 4445;   					//designated port
		File modelDirectory = new File(absoluteInputPath); 	//path to the model as a file
		
		/*Runnable serverCode = new Runnable() {
			 @Override
	          public void run() {

				 Server server = null;
					try {
						server = new Server(serverPort, modelDirectory, System.out, System.err);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						server.activate(); 			
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (ProtocolException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					/*try {
						server.deactivate();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 
	          }
	      };
	      
	      Thread serverThread = new Thread(serverCode);
	      serverThread.start();*/
	      
		
		//already given ServerThread structure from the TimeNet project
		ServerThread serverThread = null;
		try {
			serverThread = new ServerThread(serverPort, modelDirectory, System.out, System.err);
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		serverThread.start();
		
		
		
		//setup and start the client
		File netFile = new File(inputFile); 		//the File containing the Net which gets send to the server
        InetAddress addr = null;
		try {
			addr = InetAddress.getLocalHost();
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		}
		System.out.println("Local HostAddress:  " + addr.getHostAddress());
		// Gets the host name for this IP address.
		System.out.println("Local host name: " + addr.getHostName());
		var serverHost = addr.getHostAddress();
		var startTime = "0";
		var endTime = "10000";
		SimulationParameters params = new SimulationParameters();
		params.setMode(SimulationParameters.TSIMULATION); // ssimulation | tsimulation | tokengame
		params.setServerIP(serverHost); 			//Server IP
		params.setServerPort(serverPort); 			//Server Port
		params.setResultIP(null);					//Result Server IP - only set if 
													//there is a Result Server
		
		//params.setResultPort();					//Result Server Port - only set
													//if Result Server IP is set
		
		params.setStartTime(startTime);				//set the Start Time of the simulation
		params.setEndTime(endTime);					//set the End Time of the simulation
		params.setLogging(true);					//de- or activate logging
		
		//setting up thread structure to run the client
		//without blocking the active use of the whole eclipse product
		class ClientParallel extends Thread{
			
			File netFile;
			SimulationParameters parameters;
			ServerThread serverThread;
			
			ClientParallel(File netFile, SimulationParameters parameters, ServerThread serverThread){
				this.netFile = netFile;
				this.parameters = parameters;
				this.serverThread = serverThread;
			}
			
			@Override
			public void run() {
				Client client = new Client(this.netFile, this.parameters, System.out, System.err);
				try {
					System.out.println("Client start:");
					client.run();
					System.out.println("Client done!");
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				client = null;
				System.out.println("Killing server!");
				serverThread.end();
				System.out.println("Done");
			}
			
		}
		
		/*Client client = new Client(netFile, params, System.out, System.err);
		try {
			client.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		client=null;*/
		
		ClientParallel client = new ClientParallel(netFile, params, serverThread);
		client.start();
		
		
		return 0;
	}
	public static Model getModel(Package p) {
		if (p == null) {
			return null;
		}
		if (! (p.eContainer() instanceof Model)) {
			return getModel((Package)p.eContainer());
		}
		return (Model) p.eContainer();
	}
}