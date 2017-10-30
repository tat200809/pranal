package comparison;
import core.Expr;

public class BiggerEqual extends Expr{

	 Expr left;
	 Expr right;
	 
	 public BiggerEqual(Expr left, Expr right){
		 this.left = left;
		 this.right = right;				 
	 }
}