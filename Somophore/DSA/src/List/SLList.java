package List;

public class SLList {
	private SLNode head;

	public SLList() {
		head = null;
	}

	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

	public void add(SLNode newNode) {
		newNode.setNext(head);
		head = newNode;
	}

	public SLNode traversing(int pos) {
		int count = 1;
		SLNode current = this.head;
		while (count < pos) {
			count++;
			current = current.getNext();
		}
		return current;
	}

	public void addAt(int pos, SLNode newNode) {
		SLNode posNode = traversing(pos);
		newNode.setNext(posNode.getNext());
		posNode.setNext(newNode);
	}

	public void remove(int pos) {
		if (!isEmpty()) {
			if (pos == 1)
				head = head.getNext();
			else {
				SLNode prevNode = traversing(pos - 1);
				SLNode posNode = prevNode.getNext();
				prevNode.setNext(posNode.getNext());
			}
		}
	}

	public void removeAll() {
		head = null;
	}

	public SLNode get(int pos) {
		if (!isEmpty())
			return traversing(pos);
		else
			return null;
	}

	public int getLength() {
		int count = 0;
		SLNode current = this.head;
		while (current != null) {
			count++;
			current = current.getNext();
		}
		return count;
	}

	public int search(String data) {
		int count = 1;
		SLNode current = this.head;
		while ((current != null) && (current.getData() != data)) {
			count++;
			current = current.getNext();
		}
		if (current == null)
			return -1;
		else
			return count;

	}
	public int search(int data)
	{
	int l=getLength();
	for (int i=1; i<l; i++)
	{
	SLNode2 aNode= aNode.get(i);
	if (aNode.getData()==data)
	return i;
	}
	return
	 0
	;
	}

}