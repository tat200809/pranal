package comparison;
import core.Expr;

public class Bigger extends Expr{

	 Expr left;
	 Expr right;
	 
	 public Bigger(Expr left, Expr right){
		 this.left = left;
		 this.right = right;				 
	 }
}