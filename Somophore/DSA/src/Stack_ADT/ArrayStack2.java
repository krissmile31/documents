package Stack_ADT;

public class ArrayStack2 {
	/**
	 * @effects
	 * create an empty stack
	 * check empty
	 * check full
	 * push
	 * pop
	 * peak
	 */
	private int[] items;
	private static final int maxSize=100;
	private int top;
	public ArrayStack2() {
		items = new int[maxSize];
		top = -1;
	}
	public boolean isEmpty() {
		if (top==-1)
			return true;
		else
			return false;
	}
	public boolean isFull() {
		if (top == maxSize - 1)
			return true;
		else
			return false;
	}
	public void push(int newItem) {
		if(!isFull()) {
			top++;
			newItem = items[top];
		}
	}
	public int pop() {
		if(!isEmpty()) {
			int tmp = items[top];
			top--;
			return tmp;
		}
		else
			return -1;
	}
	public int peak() {
		if(!isEmpty())
			return items[top];
		else
			return -1;
	}

}
