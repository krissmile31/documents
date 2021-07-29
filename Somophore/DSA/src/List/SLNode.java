package List;

public class SLNode {
	private String data;
	private SLNode next;
	
	public SLNode(String data) {
		this.data=data;
	}
	public void setNext(SLNode next) {
		this.next = next;
	}
	public SLNode getNext() {
		return this.next;
	}
	public void setData(String data) {
		this.data=data;
	}
	public String getData() {
		return this.data;
	}
}
	