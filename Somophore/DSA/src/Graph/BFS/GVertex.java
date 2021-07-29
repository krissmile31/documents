package Graph.BFS;

public class GVertex {
	private char label;
	private char color;
	
	public GVertex(char label) {
		this.label=label;
		color='B';
	}
	public char getLabel() {
		return label;
	}
	public char getColor() {
		return color;
	}
	public void setLabel(char label) {
		this.label=label;
	}
	public void setColor(char color) {
		this.color=color;
	}

}
