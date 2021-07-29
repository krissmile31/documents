package tut4;

import java.util.ArrayList;
import java.util.Iterator;

public class OddAlphabet {
	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<Character>();

		for (char i = 'a'; i <= 'z'; i++) {
			list.add(i);
		}

		Iterator<Character> l1 = list.iterator();
		Iterator<Character> l2 = list.iterator();

		System.out.print("l1: ");
		
		while (l1.hasNext()) {
			char s = l1.next();	
			System.out.print(s + " ");
		}
		
		System.out.println();
		System.out.print("l2: ");
		while (l2.hasNext()) {
			char r = l2.next();
			int i = r;
			if (i % 2 == 1)
				System.out.print(r + " ");
		}
	}
}
