package statements;

import core.Expr;
import core.Statement;

public class While extends Statement{

	Expr condition;
	Statement statement;
	
	public While(Expr b, Statement statement){
		this.statement = statement;
		this.condition = b;
	}
}
