package e4sm.de.metamodel.design.analysis;
import e4sm.de.timenet.runner.TimenetSimRunner;
import e4sm.de.metamodel.e4sm.Package;

public class ImportTimenetRunner {
	public int runner(Package p) {
		int res = TimenetSimRunner.simRunner(p);
		return res;
	}
}
