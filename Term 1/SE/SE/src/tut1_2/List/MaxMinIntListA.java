package tut1_2.List;

import java.util.ArrayList;
import utils.DomainConstraint;
import utils.DOpt;
import utils.OptType;


/**
 * @overview MaxMinIntList stores integers + determine the smallest and largest elements of the list. 
 * @attributes
 * min		Integer
 * max 		Integer
 * @objects A typical MinMaxIntList object is c = <a, b>, where min(a), max(b)
 * @abstract_properties
 * mutable(min) = true /\ optional(min) = false 
 * mutable(max) = true /\ optional(max) = false
 * @author NgocAnh
 *
 */
public class MaxMinIntListA extends ArrayList<Integer> {
	
	@DomainConstraint(type = "Integer", mutable=true, optional=false)
	private Integer min;
	
	@DomainConstraint(type = "Integer", mutable=true, optional=false)
	private Integer max;
	
	public MaxMinIntListA() {
		super();
	}
	
	/**
	 * @requires (matches the supertype's method)
	 * 
	 * @effects 
	 *  appends e to the end of this list
	 *  update min and max with e
	 *  if succeeds
	 *  	return true
	 *  else
	 *  	return false
	 */
	@Override
	@DOpt(type=OptType.MutatorAdd)
	public boolean add(Integer e) {
		if(e == null) 
			return false;
		else {	
			if(e < min) 
				min = e;	
			if(e > max) 
				max = e;
			super.add(e);
			return true;
		}
	}
	
	/**
	 * @effects
	 * if e is present
	 * 		removes the first occurence of e from this
	 * 		update min and max with e
	 * 		return true
	 * else
	 * 		return false
	 * 
	 */
	@Override
	@DOpt(type = OptType.MutatorRemove)
	public boolean remove(Object e) {
		if(e == null || !(super.contains(e))) 
			return false;
		else {
			for(Integer x : this) {
				if(min == null || x < min) 
					min = x;
				if(max == null || x > max) 
					max = x;
			}
			super.remove(e);
		return true;
		}
	}
	
	@DOpt(type=OptType.Observer)
	public Integer getMin() {
		return min;
		
	}
	
	@DOpt(type=OptType.Observer)
	public Integer getMax() {
		return max;
	}
}

			//override add, remove -> find / update min, max. then get min, get max
