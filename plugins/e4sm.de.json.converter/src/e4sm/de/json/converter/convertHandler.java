package e4sm.de.json.converter;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

//import org.eclipse.core.commands.IHandler;
//import org.eclipse.core.commands.IHandlerListener;
//import org.eclipse.ui.handlers.HandlerUtil;

public class convertHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		
		//check if the needed command is available
		var rt = Runtime.getRuntime();
		try{
			Process pr;
			if(System.getProperty("os.name").toLowerCase().startsWith("windows")) {
				pr = rt.exec(new String[] {"cmd.exe", "/c", "npm list --global @tuiilm/intermediate-language-model-to-e4sm"});
			}
			else {
				pr = rt.exec(new String[] {"/bin/sh", "-c", "npm list --global @tuiilm/intermediate-language-model-to-e4sm"});
			}
			int exitVal = pr.waitFor();
			if(exitVal != 0) {
				MessageDialog.openError(null, "Check Installation!", "ILMtoE4SM not installed! Please use: npm install --global @tuiilm/intermediate-language-model-to-e4sm");
				return null;
			}
			pr.destroy();
		}
		catch(IOException e){
			MessageDialog.openError(null, "Error!", "A generic execution error occured!");
			System.out.println(e.toString());
			e.printStackTrace();
		}
		catch(InterruptedException e) {
			System.err.println(e.toString());
			e.printStackTrace();
		}
		
		//get filepath, get filename, create target filename, run command: 
		//ILMtoE4SM -s input.json -t output.e4smcode
		
		String fName = null;
		String oName = null;
		IFile file = null;
		IPath fPath = null;
		
		
		//gets selected element -> extracts filename and filepath from it
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        if (window != null)
        {
            IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
            Object firstElement = selection.getFirstElement();
            if (firstElement instanceof IAdaptable)

            {   
                file = (IFile)Platform.getAdapterManager().getAdapter(firstElement, IFile.class);
                fPath = file.getLocation().makeAbsolute(); //gets the absolute path
                fName = file.getLocation().lastSegment(); //gets the file name
            }
        }
		
        
        //creates target filename by changing the ending from .json to .e4smcode 
        if(fName != null && fName.contains(".json")){
        	String temp = fName.substring(0, fName.lastIndexOf("."));
        	oName = temp.concat(".e4smcode"); 
        }
        
        
        String ilmCommand = "ILMtoE4SM -s " + fName + " -t " + oName;
        
        IPath dirPath = fPath.removeLastSegments(1); 
        
        String commands = "cd " + dirPath + " && " + ilmCommand;
        StringBuffer output = new StringBuffer(600);
        
        
        //starts the process which runs our command, also reads the InputStream, which if left alone will block the process
		try {
        	Process pr;
        	if(System.getProperty("os.name").toLowerCase().startsWith("windows")) {
				//pr = rt.exec(new String[] {"cmd.exe", "/c", commands});
        		ProcessBuilder prB = new ProcessBuilder("cmd.exe", "/c", commands);
        		prB.redirectErrorStream(true);
        		pr = prB.start();
				BufferedReader br = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			    String line;
			    while((line=br.readLine())!=null){
			    	output.append(line + System.lineSeparator());
	        	}        
        	}
        	else {
        		//pr = rt.exec(new String[] {"/bin/sh", "-c", commands});;
        		ProcessBuilder prB = new ProcessBuilder("/bin/sh", "-c" ,commands);
        		prB.redirectErrorStream(true);
        		pr = prB.start();
        		BufferedReader br = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			    String line;
			    while((line=br.readLine())!=null){
			    	output.append(line +System.lineSeparator());
			    }
			   
			}
        	
        	//outputs the error messages if the ILMtoE4SM command fails
        	int exitVal2 = pr.waitFor();
        	String cmpltOutput = "Execution of ILMtoE4SM failed: " + System.lineSeparator() + output.toString();
			if(exitVal2 != 0) {MessageDialog.openError(null, "Error!", cmpltOutput);}
			else {
				MessageDialog.openInformation(null, "Success", "Please refresh your source folder to check if the conversion was successfull!");
			}
        }
        catch(Exception e){
        	e.printStackTrace();
        }
        
        return null;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
