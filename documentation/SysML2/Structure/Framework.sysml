package Framework {
	import ScalarValues::*;
	part def Framework {
		part editors : Editor[*];
		part persistanceManagers : Persistance[*];
		part generators : Generator[*];
	}
	
	abstract part def Editor {
		doc /* Allows users to specify a model */
	}
	
	abstract part def GraphicalEditor :> Editor{
		doc /* Allows users to graphically specify a model */
	}
	
	abstract part def TextualEditor :> Editor{
		doc /* Allows users to textually specify a model */
	}
	
	abstract part def Persistance {
		doc /* Takes care of storing the current model in a specific format */
		attribute extension : String;
		perform action store;
		perform action parse;
	}
	
	abstract part def Generator {
		doc /* Generates an artifact from the given model */
	}
	
	abstract part def <M2TGenerator> ModelToTextGenerator :> Generator {
		doc /* Generates text from the given model */
	}

	abstract part def <MMTGenerator> ModelToModelGenerator :> Generator {
		doc /* Generates models from the given model */
	}
}