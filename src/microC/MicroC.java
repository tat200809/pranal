package microC;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import ast.AstGenerator;
import ast.AstWalker;
import core.Expr;
import microC.parsing.*;
import microC.parsing.MicroCParser.ProgramContext;


public class MicroC {

	public static void main(String args[]) throws Exception {
		if (args.length == 0) {
			System.out.println("Error: No program specified.");
			return;
		}
        MicroCLexer lex = new MicroCLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        MicroCParser parser = new MicroCParser(tokens);
        
		
		AstWalker walker = new AstWalker();
		walker.visitAexpr(parser.aexpr());
		
		
	}
}
