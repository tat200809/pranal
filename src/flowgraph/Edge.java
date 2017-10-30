package flowgraph;

public class Edge {

	Node in;
	Node out;
	
	public Edge(Node in, Node out){
	
		this.in = in;
		this.out = out;
	}
}
