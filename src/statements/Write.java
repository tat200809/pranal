package statements;

import core.Expr;
import core.Statement;

public class Write extends Statement{
	
	Expr expr;
	
	public Write(Expr expr){
		this.expr = expr;
	}
}
