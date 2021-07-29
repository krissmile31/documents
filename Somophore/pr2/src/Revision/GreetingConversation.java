package Revision;

import utils.TextIO;

/** @overview: presents greeting conversation between 2 persons
 * 
 * @author Rain
 */
public class GreetingConversation {
	
	/**
	 * @effects create 2 persons and make them greet to each other
	 */
	public void greet() {
		Rain a = new Rain ("anh");
		a.setName("ngoc anh");
		Rain b = new Rain ("rain");
		
		// object say hello to each other
		a.greet();
		b.greet();
	}
	
	/**
	 * The main method
	 * @effects create greeting conversation between 2 persons 
	 */
	
	public static void main (String[] args) {
		// create a greeting conversation
		GreetingConversation rain = new GreetingConversation();
		rain.greet();
	}
	// end GreetingConversation
	

}
