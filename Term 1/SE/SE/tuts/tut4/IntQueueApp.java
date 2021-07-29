package tut4;

import java.util.Arrays;

public class IntQueueApp {
  public static void main(String[] args) {
    // prepare test data
    int maxSize = 3;
    int[] elements = {1,2,3
        //4 // error
        };
    
    IntQueue queue = new IntQueue(maxSize);

    // enqueue
    for (int e : elements) {
      queue.enq(e);
    }
    
    System.out.println(queue);
    
    // test validity
    boolean ok = queue.repOK();
    
    if (!ok) {
      System.err.println("Queue is not valid");
    } else {
      // dequeue and test the result
      int sz = queue.size();
      int[] queueEls = new int[sz];
      int idx = 0;
      while (!queue.isEmpty()) {
        queueEls[idx] = queue.deq();
        idx++;
      }
      
      if (Arrays.equals(queueEls, elements)) {
        System.out.println("Queue elements: " + Arrays.toString(queueEls));
      } else {
        System.err.println("Internal error: elements were not added correctly");
      }
    }
  }
}
