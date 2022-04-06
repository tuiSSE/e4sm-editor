package e4sm.de.antlr4.petri.grammar.tests;

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
	
	@Test
	void testIsValidInputInscription() {
		assertTrue(Validators.isValidInputInscription(" EXP(1.0) "));
		assertTrue(Validators.isValidInputInscription("DET(463)"));
		assertTrue(Validators.isValidInputInscription("DET(463)"));
		assertTrue(Validators.isValidInputInscription("UNI(1)"));
		assertTrue(Validators.isValidInputInscription("TRIANG(1 + 1)"));
		assertTrue(Validators.isValidInputInscription("NORM(1)"));
		assertTrue(Validators.isValidInputInscription("NORM(43.23 + 1)"));
		assertTrue(Validators.isValidInputInscription("LONGNORM(1)"));
		assertTrue(Validators.isValidInputInscription("WEI(1)"));
		assertTrue(Validators.isValidInputInscription("Det(4.3535)"));
		
		assertFalse(Validators.isValidInputInscription("exp(1.0)"));
		assertFalse(Validators.isValidInputInscription("EXP(1.0) asd"));
		assertFalse(Validators.isValidInputInscription(""));
		assertFalse(Validators.isValidInputInscription(" "));
		assertFalse(Validators.isValidInputInscription("asd"));
		assertFalse(Validators.isValidInputInscription("$asd"));
		assertFalse(Validators.isValidInputInscription("EXP)1.0("));
		assertFalse(Validators.isValidInputInscription("EXP(1.)"));
		assertFalse(Validators.isValidInputInscription("EXP()"));
	}
	
	@Test
	void testIsValidOutputInscription() {
		assertTrue(Validators.isValidOutputInscription("new(1)"));
		assertTrue(Validators.isValidOutputInscription("new({})"));
		
		assertTrue(Validators.isValidOutputInscription("DET(463)"));
		assertTrue(Validators.isValidOutputInscription("UNI(1)"));
		assertTrue(Validators.isValidOutputInscription("TRIANG(1 + 1)"));
		assertTrue(Validators.isValidOutputInscription("NORM(1)"));
		assertTrue(Validators.isValidOutputInscription("NORM(43.23 + 1)"));
		assertTrue(Validators.isValidOutputInscription("LONGNORM(1)"));
		assertTrue(Validators.isValidOutputInscription("WEI(1)"));
		assertTrue(Validators.isValidOutputInscription("Det(4.3535)"));
		
		assertFalse(Validators.isValidOutputInscription("exp(1.0)"));
		assertFalse(Validators.isValidOutputInscription("EXP(1.0) asd"));
		assertFalse(Validators.isValidOutputInscription(""));
		assertFalse(Validators.isValidOutputInscription(" "));
		assertFalse(Validators.isValidOutputInscription("asd"));
		assertFalse(Validators.isValidOutputInscription("$asd"));
		assertFalse(Validators.isValidOutputInscription("EXP)1.0("));
		assertFalse(Validators.isValidOutputInscription("EXP(1.)"));
		assertFalse(Validators.isValidOutputInscription("EXP()"));
	}
}