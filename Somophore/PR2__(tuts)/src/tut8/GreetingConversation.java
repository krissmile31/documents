package tut8;

import utils.TextIO;

public class GreetingConversation {
	public static void main(String args[]) {
	   MobilePhone a = new MobilePhone("Thinkpad", "corei5", 'Y', 2010);
	   Person p = new Person(15, "PC");
	   boolean s = p.setMobilePhone(a);
	   TextIO.putln(p);
	   TextIO.putln(p.repOK());
	   
	   TextIO.putln();
	   p = new Person(0, "PC");
	   TextIO.putln(p);
	   TextIO.putln(p.repOK());
	   
	}
}
