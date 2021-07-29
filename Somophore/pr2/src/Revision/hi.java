package Revision;

import utils.TextIO;

/** @overview: Write a program that displays the greeting messages from two persons
 * 
 * @author Rain
 */
public class hi {
	/**
	 * The run method
	 * @effect ask user input two names from 2 persons -> display two greeting
	 * message of the form "Hello, my name is X", where X is a person name.
	 */
	public static void main (String [] args ) {
		TextIO.putln("Hello, my name is: ");
		String a = TextIO.getln();
		TextIO.putln("Hello, my name is: ");
		String b = TextIO.getln();
		
		Greeting(a);
		Greeting(b);
		
	}
	
	/** display the greeting message "Hello, my name is" + name
	 * 
	 */
	public static void Greeting(String name) {
		TextIO.putln("Hello, my name is " + name);
	}

}
