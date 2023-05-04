// Requirements: constraints that a valid design must satisfy

package FunctionalRequirements{
	requirement <'F1'> Modeling {
		requirement GraphicalModeling {
			doc /* Users shall be able to define a model in a graphical way */
		}
		requirement TextualModeling {
			doc /* Users shall be able to define a model in a textual way */
		}
	}
	
	requirement <'F2'> Analyses {
		requirement <'F2.1'> AnalysisStart{
			doc /* Users shall be able to start an analysis on a given model */
		}
		requirement <'F2.2'> AnalysisDefinition{
			doc  /* Users shall be able to specify an analysis algorithm */
		}
	}
	
	requirement <'F3'> ArtifactsGeneration {
		requirement DocumentationGeneration{
			doc /* Users shall be able to generate a document describing their modeled system */
		}
		requirement AnalysisDefinition{
			doc  /* Users shall be able to specify an analysis algorithm */
		}
	}
}

// Requirements, Analysis, Verification, Structure, Behavior | View & Viewpoint gffTqaAMaXo#2m24