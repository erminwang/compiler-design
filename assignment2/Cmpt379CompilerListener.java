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