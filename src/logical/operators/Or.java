package logical.operators;
import core.Expr;

public class Or extends Expr{

	 Expr left;
	 Expr right;
	 
	 public Or(Expr left, Expr right){
		 this.left = left;
		 this.right = right;				 
	 }
}