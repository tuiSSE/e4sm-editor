/**
 * 
 */
package e4sm.de.metamodel.design.analysis;

import java.util.Collection;

/**
 * @author Francesco Bedini
 *
 */
public class AnalysisManager {
	public boolean start(Analysis analysis) {
		if (analysis != null) {
			return true;
		}
		return false;
	}
	
	public boolean start(Analysis analysis, Collection<AnalysisParameter> parameters) {
		if (analysis != null) {
			return true;
		}
		return false;
	}

}
