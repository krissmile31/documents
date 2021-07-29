package tut4;

import java.util.ArrayList;
import java.util.Iterator;

public class OddAlphabetList {
	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<Character>();
		
		for (char i='a'; i<='z'; i++) {
			int code = i;
			if (code%2 == 1)
				list.add(i);
		}
		
		Iterator<Character> oddList = list.iterator();
		while (oddList.hasNext()) {
			System.out.print(oddList.next() + " ");
		}
	}

}
