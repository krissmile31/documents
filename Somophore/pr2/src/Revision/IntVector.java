package Revision;

import java.util.Vector;

import utils.TextIO;
public class IntVector {
	public static void main (String[] args) {
		// create a new empty vector
		Vector v = new Vector();
		Vector<Integer> v1 = new Vector<>();
		
		// adds integers to the vector
		v.add(3); // the first element at index 0
		v.add(10);
		v.add(-5);
		v.add(-9);
		v.add(1);
		
		// print
		TextIO.putln("Vector: " + v);
		TextIO.putln(v.size());
		TextIO.putln(v.get(4));
		
		// retrieve an element at a given index
		int i = (Integer) v.get(0);   // casting is required
		TextIO.putln("element 0: " + i);
		
		// change a particular element
		v.set(0, 6);
		TextIO.putln("after set(0, 6): " + v);
		
		// delete an element at a given index
		v.remove(1);
		TextIO.putln("after remove(1): " + v);
		
		
	}

}
