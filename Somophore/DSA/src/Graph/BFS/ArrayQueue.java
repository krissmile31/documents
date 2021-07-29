package Graph.BFS;

public class ArrayQueue {
	private int [] items;
	private static final int maxSize=10000;
	private int front;
	private int rear;
	
	public ArrayQueue() {
		items = new int[maxSize];
		front = 0;
		rear = 0;
	}
	
	public boolean isEmpty() {
		if(front==rear)
			return true;
		return false;
	}
	
	public boolean isFull() {
		if(front==(rear+1)%maxSize)
			return true;
		return false;
	}
	public void enqueue(int newItem) {
		if(!isFull()) {
			items[rear] = newItem;
			rear=(rear+1)%maxSize;
		}
	}
	public int dequeue() {
		if(!isEmpty()) {
			int pos = front;
			front = (front+1)%maxSize;
			return items[pos];
		}
		return -1;
	}
	public int peak() {
		if(!isEmpty())
			return items[front];
		return -1;
	}
	

}
