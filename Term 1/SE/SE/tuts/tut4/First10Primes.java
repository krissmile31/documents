package tut4;

import java.util.ArrayList;
import java.util.Iterator;


public class First10Primes {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Creates a list containing the first 10 prime numbers");
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(11);
		list.add(13);
		list.add(17);
		list.add(19);
		list.add(23);
		list.add(29);
		
		Iterator<Integer> prime = list.iterator();
		while(prime.hasNext()) {
			int s = prime.next();
			System.out.print(s + " ");
		}
	}

}
