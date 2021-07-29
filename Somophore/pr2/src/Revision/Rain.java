package Revision;

import utils.TextIO;

/** @overview represents persons with a name attribute
 * 
 * @author Rain
 */
public class Rain {
	private String name;
	
	/**
	 * @effects  initialise this as an object whose name is name1
	 */
	
	public Rain (String name1) {
		name = name1;
	}
	
	/**
	 * @effects updates name with new name called name2
	 */
	public void setName(String name2) {
		name = name2;
	}
	
	/**
	 * @effects prints a greeting message containing name to the standard console
	 */
	public void greet() {
	TextIO.putln("Hello, my name is " + name);
}
}
	