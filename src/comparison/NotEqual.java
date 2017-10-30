package comparison;
import core.Expr;

public class NotEqual extends Expr{

	 Expr left;
	 Expr right;
	 
	 public NotEqual(Expr left, Expr right){
		 this.left = left;
		 this.right = right;				 
	 }
}