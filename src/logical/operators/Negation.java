package logical.operators;

import core.Expr;

public class Negation extends Expr{
	
	boolean value;
	
	public Negation(boolean value){
		this.value = value;
	}

}