package Graph.BFS;

public class GraphBFS {
	private static int n = 7;
	private static int [][] a= {{0,1,0,0,1,0,0},
                                {1,0,1,0,0,0,1},
                                {0,1,0,0,0,1,0},
                                {0,0,0,0,1,1,0},
                                {1,0,0,1,0,1,0},
                                {0,0,1,1,1,0,0},
                                {0,1,0,0,0,0,0}};
	private static GVertex[] v; 
	public GraphBFS() {
		//do nothing
	}
	public static void BFS(int s) {
		for(int u=0; u<n; u++)
			v[u].setColor('B');
		v[s].setColor('Y');
		System.out.println(v[s].getLabel() + " ");
		ArrayQueue  q = new ArrayQueue();
		q.enqueue(s);
		while(!q.isEmpty()) {
			int u = q.dequeue();
			for(int w=0; w<n; w++) {
				if(a[u][w]==1 && v[w].getColor()== 'B') {
					v[w].setColor('Y');
					System.out.println(v[w].getLabel() + " ");
					q.enqueue(w);
				}
			}
		}
		System.out.println("");
	}
	public static void main (String[] args) {
		//Create an empty list of n vertices
		v = new GVertex[n];
		v[0] = new GVertex('A');
		v[1] = new GVertex('B');
		v[2] = new GVertex('C');
		v[3] = new GVertex('D');
		v[4] = new GVertex('E');
		v[5] = new GVertex('F');
		v[6] = new GVertex('G');
		
		BFS(0);
		System.out.println("BFS traversal from vertex v[0]: ");
		
		BFS(6);
		System.out.println("BFS traversal from vertex v[6]: ");
		
	}
}
