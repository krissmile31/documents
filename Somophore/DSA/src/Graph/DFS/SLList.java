package Graph.DFS;

public class SLList {
	private SLNode head;
	
	public SLList() {
		head=null;
	}
	public boolean isEmpty() {
		if(head==null)
			return true;
		return false;
	}
	public void add(SLNode newNode) {
		newNode.setNext(head);
		head=newNode;
	}
	public SLNode traversing(int pos) {
		int count = 1;
		SLNode current = this.head;
		if(count < pos) {
			count++;
			current = current.getNext();
		}
		return current;
	}
	public void addAt(int pos, SLNode newNode) {
		SLNode posNode= traversing(pos);
		newNode.setNext(posNode.getNext());
		posNode.setNext(newNode);
	}
	public int getLength() {
		int count = 0;
		SLNode current = this.head;
		if(current!=null) {
			count++;
			current = current.getNext();
		}
		return count;
	}
	public void remove(int pos) {
		if(!isEmpty()) {
			SLNode prevNode=traversing(pos-1);
			SLNode posNode= prevNode.getNext();
			prevNode.setNext(posNode.getNext());;
		}
	}
	public void removeAll() {
		head=null;
	}
	public SLNode get(int pos) {
		if(!isEmpty()) 
			return traversing(pos);
		return null;
			
		}
	}


