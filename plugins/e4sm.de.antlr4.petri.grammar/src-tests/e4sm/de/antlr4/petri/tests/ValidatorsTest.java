package e4sm.de.antlr4.petri.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import e4sm.de.antlr4.petri.model.Validators;

class ValidatorsTest {

	@Test
	void testIsValidTimeFunction() {
		assertTrue(Validators.isValidTimeFunction(" EXP(1.0) "));
		assertTrue(Validators.isValidTimeFunction("DET(463)"));
		assertTrue(Validators.isValidTimeFunction("DET(463)"));
		assertTrue(Validators.isValidTimeFunction("UNI(1)"));
		assertTrue(Validators.isValidTimeFunction("TRIANG(1 + 1)"));
		assertTrue(Validators.isValidTimeFunction("NORM(1)"));
		assertTrue(Validators.isValidTimeFunction("NORM(43.23 + 1)"));
		assertTrue(Validators.isValidTimeFunction("LONGNORM(1)"));
		assertTrue(Validators.isValidTimeFunction("WEI(1)"));
		assertTrue(Validators.isValidTimeFunction("Det(4.3535)"));
		
		assertFalse(Validators.isValidTimeFunction("exp(1.0)"));
		assertFalse(Validators.isValidTimeFunction("EXP(1.0) asd"));
		assertFalse(Validators.isValidTimeFunction(""));
		assertFalse(Validators.isValidTimeFunction(" "));
		assertFalse(Validators.isValidTimeFunction("asd"));
		assertFalse(Validators.isValidTimeFunction("$asd"));
		assertFalse(Validators.isValidTimeFunction("EXP)1.0("));
		assertFalse(Validators.isValidTimeFunction("EXP(1.)"));
		assertFalse(Validators.isValidTimeFunction("EXP()"));
	}
}