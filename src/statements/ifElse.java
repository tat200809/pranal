package statements;

import core.Expr;
import core.Statement;

public class ifElse extends Statement{

	Expr condition;
	Statement trueStatement;
	Statement notTrueStatement;
	
	public ifElse(Expr b, Statement trueStatemen, Statement notTrueStatement) {
	
		this.condition = b;
		this.notTrueStatement = trueStatemen;
		this.notTrueStatement = notTrueStatement;
	}
}
