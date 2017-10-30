package ast;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import flowgraph.Node;
import microC.parsing.*;
import microC.parsing.MicroCParser.Aexpr1Context;
import microC.parsing.MicroCParser.Aexpr2Context;
import microC.parsing.MicroCParser.Aexpr3Context;
import microC.parsing.MicroCParser.AexprContext;
import microC.parsing.MicroCParser.AssignStmtContext;
import microC.parsing.MicroCParser.BasicDeclContext;
import microC.parsing.MicroCParser.BasicStmtContext;
import microC.parsing.MicroCParser.Bexpr1Context;
import microC.parsing.MicroCParser.Bexpr2Context;
import microC.parsing.MicroCParser.BexprContext;
import microC.parsing.MicroCParser.BlockStmtContext;
import microC.parsing.MicroCParser.BreakStmtContext;
import microC.parsing.MicroCParser.ContinueStmtContext;
import microC.parsing.MicroCParser.DeclContext;
import microC.parsing.MicroCParser.IdentifierContext;
import microC.parsing.MicroCParser.IfelseStmtContext;
import microC.parsing.MicroCParser.IntegerContext;
import microC.parsing.MicroCParser.OprContext;
import microC.parsing.MicroCParser.ProgramContext;
import microC.parsing.MicroCParser.ReadStmtContext;
import microC.parsing.MicroCParser.StmtContext;
import microC.parsing.MicroCParser.WhileStmtContext;
import microC.parsing.MicroCParser.WriteStmtContext;

public class AstGenerator implements MicroCVisitor{

	@Override
	public Object visit(ParseTree arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitChildren(RuleNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitAexpr(AexprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitAexpr1(Aexpr1Context ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitAexpr2(Aexpr2Context ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitAexpr3(Aexpr3Context ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBexpr(BexprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBexpr1(Bexpr1Context ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBexpr2(Bexpr2Context ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitOpr(OprContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBasicDecl(BasicDeclContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitDecl(DeclContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBasicStmt(BasicStmtContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitStmt(StmtContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitAssignStmt(AssignStmtContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitContinueStmt(ContinueStmtContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitReadStmt(ReadStmtContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBreakStmt(BreakStmtContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitWriteStmt(WriteStmtContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitIfelseStmt(IfelseStmtContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitWhileStmt(WhileStmtContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBlockStmt(BlockStmtContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitProgram(ProgramContext ctx) {
		
		List<Node> nodes = new ArrayList<>();
		
        MicroCParser.DeclContext decl = ctx.decl();
        for(ParseTree x : decl.children){
        	x.getClass();
        	
        	
        	if(x instanceof microC.parsing.MicroCParser.BasicDeclContext){
        		System.out.println(x.getText());
        	}else{
        		for (int i = 0; i < x.getChildCount(); i++) {
            		System.out.println(x.getChild(i).getText());
            	}
        	}
        	
        	
        	//System.out.println(x.getText());
        }

        MicroCParser.StmtContext stmt = ctx.stmt();
		for(ParseTree x : stmt.children){
		        	
		        	System.out.println(x.getText());
		        }
		return null;
	}

	@Override
	public Object visitIdentifier(IdentifierContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitInteger(IntegerContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

}
