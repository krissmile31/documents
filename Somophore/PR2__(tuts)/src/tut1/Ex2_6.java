package tut1;

import utils.TextIO;

public class Ex2_6 {
   public static void main(String[] args) {
	   TextIO.putln("Please enter your first name and last name, separated by a space: ");
	   
	   String name = TextIO.getln();
	   int space = name.indexOf(' ');
	   
	   String first = name.substring(0, space);
	   int a = first.length();
	   
	   String last = name.substring(space+1, name.length());
	   int b = last.length();
	   
	   TextIO.putln("Your first name is " + first + ", which has " + a + " characters");
	   TextIO.putln("Your last name is " + last + ", which has " + b + " characters");
	   
	   char c = first.charAt(0);
	   char d = last.charAt(0);
	   TextIO.putf("Your initials are %C%C", c, d);
			
			

		}

	}
