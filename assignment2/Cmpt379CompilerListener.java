// Generated from Cmpt379Compiler.g4 by ANTLR 4.5.3


import java.io.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Cmpt379CompilerParser}.
 */
public interface Cmpt379CompilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Cmpt379CompilerParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Cmpt379CompilerParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#field_decls}.
	 * @param ctx the parse tree
	 */
	void enterField_decls(Cmpt379CompilerParser.Field_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#field_decls}.
	 * @param ctx the parse tree
	 */
	void exitField_decls(Cmpt379CompilerParser.Field_declsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void enterField_decl(Cmpt379CompilerParser.Field_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void exitField_decl(Cmpt379CompilerParser.Field_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#inited_field_decl}.
	 * @param ctx the parse tree
	 */
	void enterInited_field_decl(Cmpt379CompilerParser.Inited_field_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#inited_field_decl}.
	 * @param ctx the parse tree
	 */
	void exitInited_field_decl(Cmpt379CompilerParser.Inited_field_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#method_decls}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decls(Cmpt379CompilerParser.Method_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#method_decls}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decls(Cmpt379CompilerParser.Method_declsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decl(Cmpt379CompilerParser.Method_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decl(Cmpt379CompilerParser.Method_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(Cmpt379CompilerParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(Cmpt379CompilerParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#nextParams}.
	 * @param ctx the parse tree
	 */
	void enterNextParams(Cmpt379CompilerParser.NextParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#nextParams}.
	 * @param ctx the parse tree
	 */
	void exitNextParams(Cmpt379CompilerParser.NextParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Cmpt379CompilerParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Cmpt379CompilerParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#var_decls}.
	 * @param ctx the parse tree
	 */
	void enterVar_decls(Cmpt379CompilerParser.Var_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#var_decls}.
	 * @param ctx the parse tree
	 */
	void exitVar_decls(Cmpt379CompilerParser.Var_declsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(Cmpt379CompilerParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(Cmpt379CompilerParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(Cmpt379CompilerParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(Cmpt379CompilerParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Cmpt379CompilerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Cmpt379CompilerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(Cmpt379CompilerParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(Cmpt379CompilerParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#nextCalloutArgs}.
	 * @param ctx the parse tree
	 */
	void enterNextCalloutArgs(Cmpt379CompilerParser.NextCalloutArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#nextCalloutArgs}.
	 * @param ctx the parse tree
	 */
	void exitNextCalloutArgs(Cmpt379CompilerParser.NextCalloutArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#calloutArg}.
	 * @param ctx the parse tree
	 */
	void enterCalloutArg(Cmpt379CompilerParser.CalloutArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#calloutArg}.
	 * @param ctx the parse tree
	 */
	void exitCalloutArg(Cmpt379CompilerParser.CalloutArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(Cmpt379CompilerParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(Cmpt379CompilerParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#nextArgs}.
	 * @param ctx the parse tree
	 */
	void enterNextArgs(Cmpt379CompilerParser.NextArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#nextArgs}.
	 * @param ctx the parse tree
	 */
	void exitNextArgs(Cmpt379CompilerParser.NextArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#cases}.
	 * @param ctx the parse tree
	 */
	void enterCases(Cmpt379CompilerParser.CasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#cases}.
	 * @param ctx the parse tree
	 */
	void exitCases(Cmpt379CompilerParser.CasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#nextCase}.
	 * @param ctx the parse tree
	 */
	void enterNextCase(Cmpt379CompilerParser.NextCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#nextCase}.
	 * @param ctx the parse tree
	 */
	void exitNextCase(Cmpt379CompilerParser.NextCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Cmpt379CompilerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Cmpt379CompilerParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(Cmpt379CompilerParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(Cmpt379CompilerParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#intLit}.
	 * @param ctx the parse tree
	 */
	void enterIntLit(Cmpt379CompilerParser.IntLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#intLit}.
	 * @param ctx the parse tree
	 */
	void exitIntLit(Cmpt379CompilerParser.IntLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Cmpt379CompilerParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Cmpt379CompilerParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#binOp}.
	 * @param ctx the parse tree
	 */
	void enterBinOp(Cmpt379CompilerParser.BinOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#binOp}.
	 * @param ctx the parse tree
	 */
	void exitBinOp(Cmpt379CompilerParser.BinOpContext ctx);
}