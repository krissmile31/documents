package BinaryTree;
/**
 * @effects 
 * create an empty tree
 * build Tree -> value
 * make null 
 * leaf
 * getter+setter
 * count leaf
 * count node
 * depth
 * internal path length
 * @author ADMIN
 *
 */
public class BinaryTree {
	BTNode root;
	BinaryTree leftSubTree;
	BinaryTree rightSubTree;
	//create an empty 
	public BinaryTree() {
		root=null;
		leftSubTree=rightSubTree=null;
	}
	public void buildTree(String rootValue, BinaryTree left, BinaryTree right) {
		if(rootValue==null) {
			root=null;
			leftSubTree=rightSubTree=null;
		}
		else {
			root=new BTNode(rootValue);
			leftSubTree=left;
			rightSubTree=right;
		}
	}
	public void buildTreeByValue(String rootValue, String leftValue, String rightValue) {
		if(rootValue==null) {
			root=null;
			leftSubTree=rightSubTree=null;
		}
		else
			root=new BTNode(rootValue);
		if(leftValue==null)
			leftSubTree=null;
		else {
			leftSubTree=new BinaryTree();
			leftSubTree.buildTree(leftValue, null, null);
		}
		if(rightValue==null)
			rightSubTree=null;
		else {
			rightSubTree=new BinaryTree();
			rightSubTree.buildTree(rightValue, null, null);
		}
	}
	public boolean isEmpty() {
		return (root==null)&&(leftSubTree==null)&&(rightSubTree==null);
	}
	public void makeEmpty() {
		root=null;
		leftSubTree=rightSubTree=null;
	}
	public boolean isLeaf() {
		return (leftSubTree==null)&&(rightSubTree==null);
	}
	public String getTreeValue() {
		return root.getLabel();
	}
	public void setTreeValue(String label) {
		if(!isEmpty())
			root.setLabel(label);
	}
	public BinaryTree getLeftSubTree() {
		return leftSubTree;
	}
	public void setLeftSubTree(BinaryTree left) {
		leftSubTree=left;
	}
	public BinaryTree getRightSubTree() {
		return rightSubTree;
	}
	public void setRightSubTree(BinaryTree right) {
		rightSubTree=right;
	}
	public int countLeaves(BinaryTree t) {
		if(t==null)
			return 0;
		if(t.isLeaf())
			return 1;
		return countLeaves(t.getLeftSubTree())+countLeaves(t.getRightSubTree());
	}
	public int countNodes(BinaryTree t) {
		if(t==null)
			return 0;
		return 1 + countNodes(t.getLeftSubTree())+countNodes(t.getRightSubTree());
	}
	public int iPathLength(BinaryTree t, int height) {
		if(t==null)
			return 0;
		return height + iPathLength(t.getLeftSubTree(),height+1)+iPathLength(t.getRightSubTree(), height+1);
	}
	public int getDepth(BinaryTree t) {
		if(t==null)
			return 0 ;
		if(t.isLeaf())
			return 0;
		int leftSubTreeDepth=0;
		leftSubTreeDepth=getDepth(t.getLeftSubTree());
		int rightSubTreeDepth=0;
		rightSubTreeDepth=getDepth(t.getRightSubTree());
		if(leftSubTreeDepth> rightSubTreeDepth)
			return 1+leftSubTreeDepth;
		else
			return 1+rightSubTreeDepth;
	}
}
