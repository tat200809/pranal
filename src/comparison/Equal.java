package comparison;
import core.Expr;

public class Equal extends Expr{

	 Expr left;
	 Expr right;
	 
	 public Equal(Expr left, Expr right){
		 this.left = left;
		 this.right = right;				 
	 }
}