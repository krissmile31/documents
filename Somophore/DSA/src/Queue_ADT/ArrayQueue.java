package Queue_ADT;

public class ArrayQueue {
	/**
	 * @effects
	 * create an empty queue
	 * check empty
	 * check full
	 * enqueue
	 * dequeue
	 * retrieve   (FIFO)
	 */
	private char[] items;
	private static final int maxSize=3;
	private int front;
	private int rear;
	public ArrayQueue() {
		items = new char[maxSize];
		front = 0;
		rear = 0;
	}
	public boolean isEmpty() {
		if(front == rear)
			return true;
		else
			return false;
	}
	public boolean isFull() {
		if (front == (rear+1) % maxSize)
			return true;
		else
			return false;
	}
	public void enqueue(char newItem) {
		if(!isFull()) {
			items[rear] = newItem;
			rear = (rear+1) % maxSize;
		}
	}
	public char dequeue() {
		if(!isEmpty()) {
			int pos = front;
			front = (front+1) % maxSize;
			return items[pos];
		}
		else
			return 'a';
	}
	public char peek() {
		if(!isEmpty()) 
			return items[front];
		else
			return '\u0000';
	}

}
