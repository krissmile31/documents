package Graph.DFS;

public class GraphDFS {
	private static int n=7;
	private static GALVertex[] v;
	
	public GraphDFS() {
		// do nothing
	}
	public static void DFS(int u) {
		v[u].setColor('Y');
		System.out.println(v[u].getLabel() + " ");
		SLList adjListU= v[u].getAdjList();
		for(int i=0; i<= adjListU.getLength(); i++) {
			int w= adjListU.get(i).getData();
			if (v[w].getColor()=='B')
				DFS(w);
		}
	}
	public static void DFS_Initialize() {
		for(int i=0; i<n; i++)
			v[i].setColor('B');
	}

}
