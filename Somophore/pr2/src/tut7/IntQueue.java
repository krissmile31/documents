package tut7;

import utils.TextIO;
import utils.DomainConstraint;

public class IntQueue {
	@DomainConstraint(type = "int", mutable = true)
	private int[] queue;
	private int n;
    public int front;
    private int end;
	/**
     * Constructor for objects of class IntQueue.
     * This constructor creates an empty queue.
     */
	 public IntQueue(int n){
	        queue = new int[n];
	        front=0;
	        end=0;
	    }

	    /**
	     * This operation returns true if the queue is empty, otherwise it returns false
	     */    
	    public boolean isEmpty(){
	        if (front==end)
	            return true;
	        else
	            return false;
	    }
	    
	    /**
	     * This operation returns true if the queue is full, otherwise it returns false
	     */    
	    public boolean isFull(){
	        TextIO.putln("front"+front);
	        TextIO.putln("end"+end);
	        //Edit if condition "end=front-1" to "front = (end+1)%n"
	        if (front == (end+1)%n)
	            return true;
	        else
	            return false;
	    }
	    
	    /**
	     * This operation adds a newItem(x) to the queue.
	     */        
	    public void enq(int x){
	        if (!isFull())
	        {
	            queue[end]=x;
	            end=(end+1) % n;
	        }
	    }

	    /**
	     * This operation returns the item at the front position of the queue and deletes this item.
	     */    
	    public int deq(){
	        if (!isEmpty()) {
	            int pos=front;
	            front=(front+1) % n;
	            return queue[pos];
	        }
	        else
	            return -1;
	    }

}
