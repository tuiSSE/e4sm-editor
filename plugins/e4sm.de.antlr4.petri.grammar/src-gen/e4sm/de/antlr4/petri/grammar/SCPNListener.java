// Generated from SCPN.g4 by ANTLR 4.9.3
package e4sm.de.antlr4.petri.grammar;

//Package is set in the build.gradle file
/*import gpal.*;
import gpal.parsers.ast.*;
import gpal.parsers.expr.*;
import java.util.*;*/

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SCPNParser}.
 */
public interface SCPNListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SCPNParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(SCPNParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPNParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(SCPNParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPNParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SCPNParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPNParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SCPNParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPNParser#placeRef}.
	 * @param ctx the parse tree
	 */
	void enterPlaceRef(SCPNParser.PlaceRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPNParser#placeRef}.
	 * @param ctx the parse tree
	 */
	void exitPlaceRef(SCPNParser.PlaceRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPNParser#subTransName}.
	 * @param ctx the parse tree
	 */
	void enterSubTransName(SCPNParser.SubTransNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPNParser#subTransName}.
	 * @param ctx the parse tree
	 */
	void exitSubTransName(SCPNParser.SubTransNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPNParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void enterModuleName(SCPNParser.ModuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPNParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void exitModuleName(SCPNParser.ModuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPNParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(SCPNParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPNParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(SCPNParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPNParser#numericalConstant}.
	 * @param ctx the parse tree
	 */
	void enterNumericalConstant(SCPNParser.NumericalConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPNParser#numericalConstant}.
	 * @param ctx the parse tree
	 */
	void exitNumericalConstant(SCPNParser.NumericalConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPNParser#mathematicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterMathematicalExpression(SCPNParser.MathematicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPNParser#mathematicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitMathematicalExpression(SCPNParser.MathematicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPNParser#inputInscription}.
	 * @param ctx the parse tree
	 */
	void enterInputInscription(SCPNParser.InputInscriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPNParser#inputInscription}.
	 * @param ctx the parse tree
	 */
	void exitInputInscription(SCPNParser.InputInscriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPNParser#outputInscription}.
	 * @param ctx the parse tree
	 */
	void enterOutputInscription(SCPNParser.OutputInscriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPNParser#outputInscription}.
	 * @param ctx the parse tree
	 */
	void exitOutputInscription(SCPNParser.OutputInscriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPNParser#tokenTransfer}.
	 * @param ctx the parse tree
	 */
	void enterTokenTransfer(SCPNParser.TokenTransferContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPNParser#tokenTransfer}.
	 * @param ctx the parse tree
	 */
	void exitTokenTransfer(SCPNParser.TokenTransferContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPNParser#attributeAssignList}.
	 * @param ctx the parse tree
	 */
	void enterAttributeAssignList(SCPNParser.AttributeAssignListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPNParser#attributeAssignList}.
	 * @param ctx the parse tree
	 */
	void exitAttributeAssignList(SCPNParser.AttributeAssignListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPNParser#attributeAssignment}.
	 * @param ctx the parse tree
	 */
	void enterAttributeAssignment(SCPNParser.AttributeAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPNParser#attributeAssignment}.
	 * @param ctx the parse tree
	 */
	void exitAttributeAssignment(SCPNParser.AttributeAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPNParser#tokenDescription}.
	 * @param ctx the parse tree
	 */
	void enterTokenDescription(SCPNParser.TokenDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPNParser#tokenDescription}.
	 * @param ctx the parse tree
	 */
	void exitTokenDescription(SCPNParser.TokenDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPNParser#timeFunction}.
	 * @param ctx the parse tree
	 */
	void enterTimeFunction(SCPNParser.TimeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPNParser#timeFunction}.
	 * @param ctx the parse tree
	 */
	void exitTimeFunction(SCPNParser.TimeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPNParser#tokenCopy}.
	 * @param ctx the parse tree
	 */
	void enterTokenCopy(SCPNParser.TokenCopyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPNParser#tokenCopy}.
	 * @param ctx the parse tree
	 */
	void exitTokenCopy(SCPNParser.TokenCopyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPNParser#tokenNew}.
	 * @param ctx the parse tree
	 */
	void enterTokenNew(SCPNParser.TokenNewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPNParser#tokenNew}.
	 * @param ctx the parse tree
	 */
	void exitTokenNew(SCPNParser.TokenNewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPNParser#tokenExtract}.
	 * @param ctx the parse tree
	 */
	void enterTokenExtract(SCPNParser.TokenExtractContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPNParser#tokenExtract}.
	 * @param ctx the parse tree
	 */
	void exitTokenExtract(SCPNParser.TokenExtractContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPNParser#tokenReference}.
	 * @param ctx the parse tree
	 */
	void enterTokenReference(SCPNParser.TokenReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPNParser#tokenReference}.
	 * @param ctx the parse tree
	 */
	void exitTokenReference(SCPNParser.TokenReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SCPNParser#tokenAttributeReference}.
	 * @param ctx the parse tree
	 */
	void enterTokenAttributeReference(SCPNParser.TokenAttributeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SCPNParser#tokenAttributeReference}.
	 * @param ctx the parse tree
	 */
	void exitTokenAttributeReference(SCPNParser.TokenAttributeReferenceContext ctx);
}