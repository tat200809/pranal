package statements;

import core.Expr;
import core.Statement;

public class Read extends Statement{

	Expr expr;
	public Read(Expr expr){
		this.expr = expr;
	}
}
