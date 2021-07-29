package Tree;
import java.util.Arrays;

public class ArrayTree {
	/**
	 * @effects
	 * create an empty tree
	 * check empty
	 * check full
	 * add
	 * getParent
	 * getter
	 * setter
	 * leftMostChild: Find the first node i that i's parent is node (p[i]==node).
	 * rightSibling: Find the first node i that i's parent is node's parent
	 */
	private int n;
	private static final int maxSize=200;
	private String[] l;
	private int[] p;
	public ArrayTree() {
		n=0;
		l=new String[maxSize];
		p=new int[maxSize];
		Arrays.fill(p,  -2);;
	}
	public boolean isEmpty() {
		return n==0;
	}
	public boolean isFull() {
		return n==maxSize-1;
	}
	public void addNode(String label, int parent) {
		if(!isFull()) {
			if(parent==-1) {
				l[0] = label;
				p[0]=-1;
			}
			else {
				int pos=parent+1;
				while(pos<n && getParent(pos)<= parent)
					pos++;
				for(int i=n; i>pos; i--) {
					l[i] =l[i-1];
					p[i] =p[i-1];
				}
				l[pos] =label;
				p[pos]=parent;
		}
	}
}
	public int getParent(int node) {
		return p[node];
	}
	public String getNodeLabel(int node) {
		if(node!=-1)
			return l[node];
		else
			return null;
	}
	public void setNodeLabel(String label, int node) {
		l[node]=label;
	}
	public int leftMostChild(int node) {
		int i=node+1;
		while(i<n && getParent(i)!=node)
			i++;
		if(getParent(i)==node)
			return i;
		else
			return -1;
	}
	public int rightSibling(int node) {
		int i=node+1;
		while(i<n && getParent(i) != getParent(node))
			i++;
		if(getParent(i)==getParent(node))
			return i;
		else
			return -1;
	}
}	