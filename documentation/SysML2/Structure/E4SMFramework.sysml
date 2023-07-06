package E4SMFramework {
	import Framework::*;
	
	part def E4SMFramework :> Framework, EclipseIDE {
		/* The main application framework */
	   // Only 2 editors are available, redefining to change the multiplicity
	   part redefines editors : Editor[2];
	   
	   part graphicalEditor : E4SMGraphicalEditor[1] subsets editors;
	   part textualEditor : E4SMTextualEditor[1] subsets editors;
	}
	
	part def SiriusEditor :> GraphicalEditor {
		doc /* A graphical model editor defined with Eclipse Sirius */
	}
	
	part def EclipseIDE {
		
	}
	
	part def E4SMGraphicalEditor :> SiriusEditor {
		doc /* A modeling tool which allows to draw diagrams */
	}
	
	part def E4SMTextualEditor :> TextualEditor {
		doc /* A modeling tool which allows to define models with text */
	}
}