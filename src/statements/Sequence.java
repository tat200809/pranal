package statements;

import core.Expr;
import core.Statement;

public class Sequence extends Statement{

	 Expr first;
	 Expr second;
	 
	 public Sequence(Expr first, Expr second){
		 this.first = first;
		 this.second = second;				 
	 }
}