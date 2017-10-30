package comparison;
import core.Expr;

public class SmallerEqual extends Expr{

	 Expr left;
	 Expr right;
	 
	 public SmallerEqual(Expr left, Expr right){
		 this.left = left;
		 this.right = right;				 
	 }
}