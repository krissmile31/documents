package Stack_ADT;

public class ArrayStack {
	/**
	 * @effects 
	 * create an empty Stack
	 * check empty
	 * check full
	 * Push
	 * Pop
	 * Peak
	 */
	private String[] items;
	private static final int maxSize = 100;
	private int top;
	
	public ArrayStack() {
		items = new String[maxSize];
		top = -1;
	}
	public boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	public boolean isFull() {
		if (top== maxSize-1) 
			return true;
		else
			return false;
	}
	public void push(String newItem) {
		if (!isFull()) {
			top++;
			items[top] = newItem;
		}
	}
	public String pop() {
		if(!isEmpty()) {
			String tmp = items[top];
			top--;
			return tmp;
		}
		else
			return null;
	}
	public String peek() {
		if(!isEmpty()) 
			return items[top];
		else
			return null;
	}
}
