package arithmetic.operators;
import core.Expr;

public class Add extends Expr{

	 Expr left;
	 Expr right;
	 
	 public Add(Expr left, Expr right){
		 this.left = left;
		 this.right = right;				 
	 }
}
