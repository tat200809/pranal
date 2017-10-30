package statements;

import core.Expr;
import core.Statement;

public class ifS extends Statement{

	Expr condition;
	Statement statement;
	
	public ifS(Expr b, Statement statement){
		this.condition = b;
		this.statement = statement;
	}
}
