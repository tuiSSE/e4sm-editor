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


/* 
 * This class provides the necessary method for running a Timenet Simulation via 
 * the sirius based graphical editor for the models
*/ 
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
		//var modelFileName = "";
		for (int i = 0; i < parts.length; i++) {
			if (parts[i].contains("#")) {
				// example: "model.e4sm#"
				//	modelFileName = parts[i].substring(0, parts[i].indexOf("."));
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
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		var path = absoluteInputPath + "/" + p.getName() + "_optimized.xml";
		System.out.println("DEBUG: Path is " + path);
		var inputFile = p.getName() + "_optimized.xml";
	
		//setup and start the server which will await a client and then start the codegen, make and simulation process
		
		var serverPort = 4445;   					//designated port
		File modelDirectory = new File(absoluteInputPath); 	//path to the model as a file
		System.out.println("DEBUG: Server prepared");
		
		//already given ServerThread structure from the TimeNet project
		ServerThread serverThread = null;
		
		try {
			System.out.println("DEBUG: inside try");
			serverThread = new ServerThread(serverPort, modelDirectory, System.out, System.err);
			System.out.println("DEBUG: help");
			
		} catch (Exception e2) {
			System.out.println("DEBUG: inside catch");
			e2.printStackTrace();
		}
		System.out.println("DEBUG: try start server");
		serverThread.start();
		System.out.println("DEBUG: server started");
		
		
		//setup and start the client
		File netFile = new File(path); 		//path to the File containing the Net which gets send to the server
		if(!netFile.isFile()) {
			System.err.println("netFile does not exist! " + netFile.getAbsolutePath());
			return 2;
		}
        InetAddress addr = null;
		try {
			addr = InetAddress.getLocalHost();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		System.out.println("Local HostAddress:  " + addr.getHostAddress());
		// Gets the host name for this IP address.
		System.out.println("Local host name: " + addr.getHostName());
		String serverHost = addr.getHostAddress();
		String startTime = "0";
		int simDuration = p.getSimulationDuration();
		String endTime =  "10000"; // Default value
		if(simDuration > 0) {
			// simDuration is in ms, convert it to microseconds
			endTime = Integer.toString(simDuration * 1000);
		}

		SimulationParameters params = new SimulationParameters();
		params.setMode(SimulationParameters.TSIMULATION); // ssimulation | tsimulation | tokengame
		params.setServerIP(serverHost); 			//Server IP
		params.setServerPort(serverPort); 			//Server Port
		params.setResultIP(null);					//Result Server IP - only set if 
													//there is a Result Server
		
		//params.setResultPort();					//Result Server Port - only set
													//if Result Server IP is set
		params.setSecMax("120");					//set max sim time in seconds
		params.setStartTime(startTime);				//set the Start Time of the simulation
		params.setEndTime(endTime);					//set the End Time of the simulation
		params.setLogging(true);					//de- or activate logging
		params.setSecMax("10");					//run for at most 2 minutes
		
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
