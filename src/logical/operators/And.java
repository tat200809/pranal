package logical.operators;
import core.Expr;

public class And extends Expr{

	 Expr left;
	 Expr right;
	 
	 public And(Expr left, Expr right){
		 this.left = left;
		 this.right = right;				 
	 }
}