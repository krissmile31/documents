package tut9;

import java.util.Vector;

public class IntSetTest {
	public static void main(String[] args) {
		Vector els = new Vector();
		els.add(1);
		els.add(0);
		els.add(2);
		
		IntSet rain= new IntSet(els);
		System.out.println(rain);
		
	}
}
