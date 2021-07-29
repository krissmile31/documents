package Tree;

import java.util.Arrays;

public class ArrayBinaryTree {
	/**
	 * @effects
	 * constructor: root null
	 * addRoot l[0]
	 * getter + setter
	 * add left+right
	 */
	private static final int maxSize=100;
	private String[] l;
	public ArrayBinaryTree() {
		l = new String[maxSize];
		Arrays.fill(l, null);
	}
	public boolean isEmpty() {
		return l[0] == null;
	}
	public void addRoot(String label) {
		if(l[0]!=null)
			l[0]=label;
	}
	public int getLeftChild(int node) {
		return 2*node +1;
	}
	public int getRightChild(int node) {
		return 2*node +2;
	}
	public int getParent(int node) {
		return (int) Math.floor((node-1)/2);
	}
	public String getNodeLabel(int node) {
		return l[node];
	}
	public void setNodeLabel(String label, int node) {
		l[node]= label;
	}
	public void addLeftChild(String label, int node) {
		setNodeLabel(label, getLeftChild(node));
	}
	public void addRightChild(String label, int node) {
		setNodeLabel(label, getRightChild(node));
	}
	public void preOrderTravel(int node) {
		preOrderTravel(getLeftChild(node));
		preOrderTravel(getRightChild(node));
	}
}
