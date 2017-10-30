package flowgraph;

import java.util.ArrayList;

import core.Statement;

public class Node{

	Statement statement;
	ArrayList<Edge> outEdges;
	ArrayList<Edge>inEdges;
	
	public Node(Statement statement, ArrayList<Edge> inEdges, ArrayList<Edge> outEdges) {
		
		this.statement = statement;
		this.outEdges = outEdges;
		this.inEdges = inEdges;
	}
}
