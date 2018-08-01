// Generated from Syntax_Parser.g4 by ANTLR 4.5.3


import java.io.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Syntax_ParserParser}.
 */
public interface Syntax_ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Syntax_ParserParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Syntax_ParserParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntax_ParserParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Syntax_ParserParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntax_ParserParser#field_decls}.
	 * @param ctx the parse tree
	 */
	void enterField_decls(Syntax_ParserParser.Field_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntax_ParserParser#field_decls}.
	 * @param ctx the parse tree
	 */
	void exitField_decls(Syntax_ParserParser.Field_declsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntax_ParserParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void enterField_decl(Syntax_ParserParser.Field_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntax_ParserParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void exitField_decl(Syntax_ParserParser.Field_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntax_ParserParser#inited_field_decl}.
	 * @param ctx the parse tree
	 */
	void enterInited_field_decl(Syntax_ParserParser.Inited_field_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntax_ParserParser#inited_field_decl}.
	 * @param ctx the parse tree
	 */
	void exitInited_field_decl(Syntax_ParserParser.Inited_field_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntax_ParserParser#method_decls}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decls(Syntax_ParserParser.Method_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntax_ParserParser#method_decls}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decls(Syntax_ParserParser.Method_declsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntax_ParserParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decl(Syntax_ParserParser.Method_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntax_ParserParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decl(Syntax_ParserParser.Method_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntax_ParserParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(Syntax_ParserParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntax_ParserParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(Syntax_ParserParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntax_ParserParser#nextParams}.
	 * @param ctx the parse tree
	 */
	void enterNextParams(Syntax_ParserParser.NextParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntax_ParserParser#nextParams}.
	 * @param ctx the parse tree
	 */
	void exitNextParams(Syntax_ParserParser.NextParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntax_ParserParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Syntax_ParserParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntax_ParserParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Syntax_ParserParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntax_ParserParser#var_decls}.
	 * @param ctx the parse tree
	 */
	void enterVar_decls(Syntax_ParserParser.Var_declsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntax_ParserParser#var_decls}.
	 * @param ctx the parse tree
	 */
	void exitVar_decls(Syntax_ParserParser.Var_declsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntax_ParserParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(Syntax_ParserParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntax_ParserParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(Syntax_ParserParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntax_ParserParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(Syntax_ParserParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntax_ParserParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(Syntax_ParserParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntax_ParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Syntax_ParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntax_ParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Syntax_ParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntax_ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Syntax_ParserParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntax_ParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Syntax_ParserParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntax_ParserParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(Syntax_ParserParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntax_ParserParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(Syntax_ParserParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntax_ParserParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(Syntax_ParserParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntax_ParserParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(Syntax_ParserParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntax_ParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Syntax_ParserParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntax_ParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Syntax_ParserParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntax_ParserParser#eqOp}.
	 * @param ctx the parse tree
	 */
	void enterEqOp(Syntax_ParserParser.EqOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntax_ParserParser#eqOp}.
	 * @param ctx the parse tree
	 */
	void exitEqOp(Syntax_ParserParser.EqOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntax_ParserParser#binOp}.
	 * @param ctx the parse tree
	 */
	void enterBinOp(Syntax_ParserParser.BinOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntax_ParserParser#binOp}.
	 * @param ctx the parse tree
	 */
	void exitBinOp(Syntax_ParserParser.BinOpContext ctx);
}