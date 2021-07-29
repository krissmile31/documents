package tut4;

import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;

public class RandomNums {
	public static void main(String[] args) {
		Random rand = new Random();
		int min = 1;
		int max = 100;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i=0; i< 10; i++) {
			list.add(rand.nextInt(max-min+1) + min);
		}
		
		Iterator<Integer> randomNum = list.iterator();
		while(randomNum.hasNext())
			System.out.print(randomNum.next() + " ");	
	}

}
