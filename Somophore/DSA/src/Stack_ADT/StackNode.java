package Stack_ADT;

public class StackNode {
	private char data;
	private StackNode next;
	public StackNode(char data) {
		this.data = data;
		this.next = null;
	}
	public void setNext(StackNode next) {
		this.next=next;
	}
	public StackNode getNext() {
		return this.next;
	}
	public void setData(char data) {
		this.data=data;
	}
	public char data() {
		return this.data;
	}

}
