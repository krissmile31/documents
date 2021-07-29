package a1;

import a1_1801040015.Customer;
import a1_1801040015.HighEarner;

public class TestDrive {
	public static void main(String[] args) {
		Customer c = new Customer(1000000000, "s", "hks", "kh");
		HighEarner h = new HighEarner(1000000, "s", "hks", "kh", 1000000);
		System.out.println(h);
		
		System.out.println(c);
	}

}
