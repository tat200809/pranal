package arithmetic.operators;
import core.Expr;

public class Multiply extends Expr{

	 Expr left;
	 Expr right;
	 
	 public Multiply(Expr left, Expr right){
		 this.left = left;
		 this.right = right;				 
	 }
}