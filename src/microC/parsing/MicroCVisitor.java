// Generated from .\src\MicroC_language\parsing\MicroC.g4 by ANTLR 4.7
package microC.parsing;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MicroCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MicroCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MicroCParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexpr(MicroCParser.AexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#aexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexpr1(MicroCParser.Aexpr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#aexpr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexpr2(MicroCParser.Aexpr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#aexpr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexpr3(MicroCParser.Aexpr3Context ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexpr(MicroCParser.BexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#bexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexpr1(MicroCParser.Bexpr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#bexpr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexpr2(MicroCParser.Bexpr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#opr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpr(MicroCParser.OprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#basicDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicDecl(MicroCParser.BasicDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(MicroCParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#basicStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicStmt(MicroCParser.BasicStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(MicroCParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(MicroCParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#continueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(MicroCParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#readStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStmt(MicroCParser.ReadStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#breakStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(MicroCParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#writeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStmt(MicroCParser.WriteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#ifelseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelseStmt(MicroCParser.IfelseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(MicroCParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#blockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(MicroCParser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MicroCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MicroCParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(MicroCParser.IntegerContext ctx);
}