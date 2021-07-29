package tut1_2.List;

import java.util.ArrayList;
import utils.DOpt;
import utils.OptType;

/**
 * @overview MaxMinIntListB find min and max
 * 
 * @author Rain
 *
 */
public class MaxMinIntListB extends ArrayList<Integer> {
	
	/**
	 * @effects
	 * if this is not empty
	 * 		find and return the min
	 * else
	 * 		return null
	 */
	@DOpt(type = OptType.Observer)
	public Integer getMin() {
		Integer min=null;
		if(super.size() == 0) 
			return min;
		else {
			for(Integer x : this) {
				if(min == null || x < min) 
					min = x;
			}
			return min;
		}
		
	}
	
	/**
	 * @effects
	 * if this is not empty
	 * 		find and return the max
	 * else
	 * 		return null
	 */
	@DOpt(type=OptType.Observer)
	public Integer getMax() {
		Integer max = null;
		if(super.size() == 0) 
			return max;
		else {
			for(Integer x : this) {
				if(max == null || x > max) 
					max = x;
			}
			return max;
		}	
	}
}

		// get min, get max -> determine/ update min, max + return them  
