package e4sm.de.antlr4.petri.model;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

import e4sm.de.antlr4.petri.grammar.SCPNLexer;
import e4sm.de.antlr4.petri.grammar.SCPNParser;

public final class Validators {
	// static class, should not be instantiated
	private Validators() {
	}

	public static boolean isValidTimeFunction(String timeFunction) {
		boolean validationFailed = timeFunction == null || timeFunction.length() < 1 ? true : false;
		if (!validationFailed) {
			// Try to parse the given string
			final CodePointCharStream charStream = CharStreams.fromString(timeFunction);
			final SCPNLexer scpnLexer = new SCPNLexer(charStream);
			CommonTokenStream commonTokenStream = new CommonTokenStream(scpnLexer);
			SCPNParser p = new SCPNParser(commonTokenStream);
			try {
				var tf = p.timeFunction();
				// Check if what it was parsed is the entire input, without spaces at the
				// beginning or the end.
				// If not, the user has inserted some extra text after the time function, such
				// as: "EXP(1.0) asd"
				if (!tf.getText().equals(timeFunction.replaceAll(" ", ""))) {
					System.err.println(timeFunction + " contains other text other than " + tf.getText());
					validationFailed = true;
				}
			} catch (RecognitionException ex) {
				System.err.println(timeFunction + " " + ex.getMessage());
				validationFailed = true;
			}
			// Additionally check if there were syntax errors
			if (p.getNumberOfSyntaxErrors() > 0) {
				System.err.println(p.getNumberOfSyntaxErrors() + " syntax error(s) found.");
				validationFailed = true;
			}
		}
		return !validationFailed;
	}

	public static boolean isValidInputInscription(String inputInscription) {
		boolean validationFailed = inputInscription == null || inputInscription.length() < 1 ? true : false;
		if (!validationFailed) {
			// Try to parse the given string
			final CodePointCharStream charStream = CharStreams.fromString(inputInscription);
			final SCPNLexer scpnLexer = new SCPNLexer(charStream);
			CommonTokenStream commonTokenStream = new CommonTokenStream(scpnLexer);
			SCPNParser p = new SCPNParser(commonTokenStream);
			try {
				var tf = p.inputInscription();
				// Check if what it was parsed is the entire input, without spaces at the
				// beginning or the end.
				// If not, the user has inserted some extra text after the time function, such
				// as: "EXP(1.0) asd"
				if (!tf.getText().equals(inputInscription.replaceAll(" ", ""))) {
					System.err.println(inputInscription + " contains other text other than " + tf.getText());
					validationFailed = true;
				}
			} catch (RecognitionException ex) {
				System.err.println(inputInscription + " " + ex.getMessage());
				validationFailed = true;
			}
			// Additionally check if there were syntax errors
			if (p.getNumberOfSyntaxErrors() > 0) {
				System.err.println(p.getNumberOfSyntaxErrors() + " syntax error(s) found.");
				validationFailed = true;
			}
		}
		return !validationFailed;
	}

	public static boolean isValidOutputInscription(String outputInscription) {
		boolean validationFailed = outputInscription == null || outputInscription.length() < 1 ? true : false;
		if (!validationFailed) {
			// Try to parse the given string
			final CodePointCharStream charStream = CharStreams.fromString(outputInscription);
			final SCPNLexer scpnLexer = new SCPNLexer(charStream);
			CommonTokenStream commonTokenStream = new CommonTokenStream(scpnLexer);
			SCPNParser p = new SCPNParser(commonTokenStream);
			try {
				var tf = p.outputInscription();
				// Check if what it was parsed is the entire input, without spaces at the
				// beginning or the end.
				// If not, the user has inserted some extra text after the time function, such
				// as: "EXP(1.0) asd"
				if (!tf.getText().equals(outputInscription.replaceAll(" ", ""))) {
					System.err.println(outputInscription + " contains other text other than " + tf.getText());
					validationFailed = true;
				}
			} catch (RecognitionException ex) {
				System.err.println(outputInscription + " " + ex.getMessage());
				validationFailed = true;
			}
			// Additionally check if there were syntax errors
			if (p.getNumberOfSyntaxErrors() > 0) {
				System.err.println(p.getNumberOfSyntaxErrors() + " syntax error(s) found.");
				validationFailed = true;
			}
		}
		return !validationFailed;
	}
}
