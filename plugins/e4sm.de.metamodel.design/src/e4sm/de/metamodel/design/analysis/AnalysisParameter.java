package e4sm.de.metamodel.design.analysis;

import java.util.Random;

import e4sm.de.metamodel.e4sm.types.ValueSpecification;

public class AnalysisParameter {
	private ValueSpecification value;

	public AnalysisParameter(ValueSpecification value) {
		this.value = value;
	}

	public int getValue() {
		// TODO
		Random rn = new Random();
		int maximum = 10;
		int minimum = 1;
		int n = maximum - minimum + 1;
		int i = rn.nextInt() % n;
		int randomNum = minimum + i;
		return randomNum;
	}
}
