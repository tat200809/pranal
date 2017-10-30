package flowgraph;

import core.Statement;

public class Converter {
	
	public Converter(){
		
	}
	
	public void Convert(Statement statement){
		
		//Following contains pseudo code 
		String pseudoCode = "";
		
	      switch(statement.getClass().toString()) {
	      	      
	      
	      case "Assignment" :
	    	  pseudoCode = "Flow = 0";
	            break;
	            
	         case "Break" :
		    	  pseudoCode = "Flow = 0";
		    	  break;
		    	  
	         case "Continue" :
	        	 pseudoCode = "Flow = 0";
	            break;
	            
	         case "ifElse" :
	        	 pseudoCode = "Flow(S1) U Flow(S2) U {(l, init(S1)),(l, init(S2))}";
	            break;
	            
	         case "ifS" :
	        	 pseudoCode = "f low(S1) U {(l, init(S1))}";
	            break;
	            
	         case "While" :
	        	 pseudoCode = "Flow(S) U {(l, init(S))} U {(l′, l) | l′∈ final(S)}";
		            break;
		            
	         case "Sequence" :
	        	 pseudoCode = "Flow = Flow(S1) U Flow(S2)";
		            break;
		            
	         case "Read" :
	        	 pseudoCode = "Flow = 0";
		            break;
		            
	         case "Write" :
	        	 pseudoCode = "Flow = 0";
		            break;
	            
	         default :
	            System.out.println("Invalid type");
	      }
	}

}
