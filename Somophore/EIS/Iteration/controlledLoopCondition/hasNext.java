package controlledLoopCondition;

import java.util.Iterator;

public static void hasNext() {
	// create an even number list 
	LinkedList<Integer> list = new LinkedList<>();
	
	for (int i = 0; i< 100; i++)
		if (i % 2 == 0) 
			list.add(i);
	
	Iterator<Integer> g = list.iterator();
	
	// loop controlled by hasNext
	while(g.hasNext())
		Integer x = g.next();
	    
		//use x .....
	

}
