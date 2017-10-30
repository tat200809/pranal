package arithmetic.operators;
import core.Expr;

public class Subtract extends Expr{

	 Expr left;
	 Expr right;
	 
	 public Subtract(Expr left, Expr right){
		 this.left = left;
		 this.right = right;				 
	 }
}