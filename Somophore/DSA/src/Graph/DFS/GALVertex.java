package Graph.DFS;

public class GALVertex {
	private char label;
	private char color;
	private SLList adjList;
	
	public GALVertex(char label) {
		this.label=label;
		color='B';
		adjList = new SLList();
	}
	public char getLabel() {
		return label;
	}
	public void setLabel(char label) {
		this.label=label;
	}
	public char getColor() {
		return color;
	}
	public void setColor(char color) {
		this.color=color;
	}
	public SLList getAdjList() {
		return adjList;
	}
	public void addToAdjList(int vertex) {
		SLNode newAdjVertex = new SLNode(vertex);
		adjList.add(newAdjVertex);
	}

}
