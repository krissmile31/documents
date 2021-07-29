package tut1_2.List;

import java.util.ArrayList;
/**
 * @overview ProgListB is to test MaxMinListB
 * 
 * @author NgocAnh
 */
public class ProgListB extends ArrayList<Integer> {
	public static void main(String[] args) {
		MaxMinIntListB list = new MaxMinIntListB();
		list.add(5);
		list.add(20);
		list.add(-3);
		list.add(0);
		list.add(310);
		
		System.out.println(list.getMin());
		System.out.println(list.getMax());
	}

}
