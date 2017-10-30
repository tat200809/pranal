package arithmetic.operators;
import core.Expr;

public class Divide extends Expr{

	 Expr left;
	 Expr right;
	 
	 public Divide(Expr left, Expr right){
		 this.left = left;
		 this.right = right;				 
	 }
}