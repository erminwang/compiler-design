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
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#m}.
	 * @param ctx the parse tree
	 */
	void enterM(Cmpt379CompilerParser.MContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#m}.
	 * @param ctx the parse tree
	 */
	void exitM(Cmpt379CompilerParser.MContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#n}.
	 * @param ctx the parse tree
	 */
	void enterN(Cmpt379CompilerParser.NContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#n}.
	 * @param ctx the parse tree
	 */
	void exitN(Cmpt379CompilerParser.NContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(Cmpt379CompilerParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(Cmpt379CompilerParser.Bool_exprContext ctx);
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
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#eqOp}.
	 * @param ctx the parse tree
	 */
	void enterEqOp(Cmpt379CompilerParser.EqOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#eqOp}.
	 * @param ctx the parse tree
	 */
	void exitEqOp(Cmpt379CompilerParser.EqOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#mathOp}.
	 * @param ctx the parse tree
	 */
	void enterMathOp(Cmpt379CompilerParser.MathOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#mathOp}.
	 * @param ctx the parse tree
	 */
	void exitMathOp(Cmpt379CompilerParser.MathOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cmpt379CompilerParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void enterBoolOp(Cmpt379CompilerParser.BoolOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cmpt379CompilerParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void exitBoolOp(Cmpt379CompilerParser.BoolOpContext ctx);
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