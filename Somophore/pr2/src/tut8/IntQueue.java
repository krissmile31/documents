package tut8;

import utils.TextIO;
import utils.DomainConstraint;

public class IntQueue {
	@DomainConstraint(type = "int", mutable = true)
	private int[] queue;
	private int n;
	public int front;
	private int end;

	/**
	 * Constructor for objects of class IntQueue
	 * Create a new queue with maximum size n
	 */
	public IntQueue(int n) {
		queue = new int[n];
		front = 0;
		end = 0;
	}

	/**
	 * @effects <pre>
	 * if the queue is empty
	 *   return true
	 * else
	 *   return false
	 * </pre>
	 */
	public boolean isEmpty() {
		if (front == end)
			return true;
		else
			return false;
	}

	/**
	 * @effects <pre>
	 * if the queue is full
	 *   return true
	 * else
	 *   return false
	 * </pre>
	 */
	public boolean isFull() {
		if (end == front-1)
			return true;
		else
			return false;
	}

	/**
	 * @effects adds a new element x to the front of the queue
	 * 
	 */
	public void enq(int x) {
		if (!isFull()) {
			queue[front] = x;
			front = (front + 1) % n;
		}
	}

	/**
	 * @effects removes the element from the end of the queue
	 */
	public int deq() {
		if (!isEmpty()) {
			int pos = end;
			end = (end + 1) % n;
			return queue[pos];
		} else
			return -1;
	}

}
