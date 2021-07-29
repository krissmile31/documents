package Stack_ADT;

public class SLLStack {
	private StackNode top;
	public SLLStack() {
		top = null;
	}
	public boolean isEmpty() {
		if (top == null)
			return true;
		else
			return false;
	}
	public void push(StackNode newNode) {
		newNode.setNext(top);
		top = newNode;
	}
	public StackNode pop() {
		if(!isEmpty()) {
			StackNode tmp = top;
			top = top.getNext();
			return tmp;
		}
		else
			return null;
	}
	public StackNode peek() {
		if(!isEmpty())
			return top;
		else
			return null;
	}
	

}
