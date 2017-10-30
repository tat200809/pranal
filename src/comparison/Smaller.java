package comparison;
import core.Expr;

public class Smaller extends Expr{

	 Expr left;
	 Expr right;
	 
	 public Smaller(Expr left, Expr right){
		 this.left = left;
		 this.right = right;				 
	 }
}