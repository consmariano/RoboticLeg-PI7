// Generated from GCode.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GCodeParser}.
 */
public interface GCodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GCodeParser#gcode}.
	 * @param ctx the parse tree
	 */
	void enterGcode(GCodeParser.GcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#gcode}.
	 * @param ctx the parse tree
	 */
	void exitGcode(GCodeParser.GcodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GCodeParser#fimprograma}.
	 * @param ctx the parse tree
	 */
	void enterFimprograma(GCodeParser.FimprogramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#fimprograma}.
	 * @param ctx the parse tree
	 */
	void exitFimprograma(GCodeParser.FimprogramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GCodeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GCodeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GCodeParser#numerolinha}.
	 * @param ctx the parse tree
	 */
	void enterNumerolinha(GCodeParser.NumerolinhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#numerolinha}.
	 * @param ctx the parse tree
	 */
	void exitNumerolinha(GCodeParser.NumerolinhaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GCodeParser#mfim}.
	 * @param ctx the parse tree
	 */
	void enterMfim(GCodeParser.MfimContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#mfim}.
	 * @param ctx the parse tree
	 */
	void exitMfim(GCodeParser.MfimContext ctx);
	/**
	 * Enter a parse tree produced by {@link GCodeParser#mfunc}.
	 * @param ctx the parse tree
	 */
	void enterMfunc(GCodeParser.MfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#mfunc}.
	 * @param ctx the parse tree
	 */
	void exitMfunc(GCodeParser.MfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GCodeParser#codfunc}.
	 * @param ctx the parse tree
	 */
	void enterCodfunc(GCodeParser.CodfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#codfunc}.
	 * @param ctx the parse tree
	 */
	void exitCodfunc(GCodeParser.CodfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GCodeParser#coordx}.
	 * @param ctx the parse tree
	 */
	void enterCoordx(GCodeParser.CoordxContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#coordx}.
	 * @param ctx the parse tree
	 */
	void exitCoordx(GCodeParser.CoordxContext ctx);
	/**
	 * Enter a parse tree produced by {@link GCodeParser#coordy}.
	 * @param ctx the parse tree
	 */
	void enterCoordy(GCodeParser.CoordyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#coordy}.
	 * @param ctx the parse tree
	 */
	void exitCoordy(GCodeParser.CoordyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GCodeParser#coord}.
	 * @param ctx the parse tree
	 */
	void enterCoord(GCodeParser.CoordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#coord}.
	 * @param ctx the parse tree
	 */
	void exitCoord(GCodeParser.CoordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GCodeParser#fimdelinha}.
	 * @param ctx the parse tree
	 */
	void enterFimdelinha(GCodeParser.FimdelinhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GCodeParser#fimdelinha}.
	 * @param ctx the parse tree
	 */
	void exitFimdelinha(GCodeParser.FimdelinhaContext ctx);
}