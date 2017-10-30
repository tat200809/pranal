package statements;

import core.Expr;
import core.Statement;

public class Assignment extends Statement{

	Expr left;
	Expr right;
	
	public Assignment(Expr left, Expr right){
		this.left = left;
		this.right = right;
	}
}
