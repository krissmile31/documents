package tut1;

import utils.TextIO;

public class Ex3_5 {
	public static void main(String[] args) {
		try {
			TextIO.readFile("sales.dat");
			} catch(Exception ex) {
				System.out.println("You can't open the file!");
			}
			Double sales, total = 0.00;
			int count = 0;
			String datasales = "";	
			char city;
			while(TextIO.eof() == false) {
				do {
				   city = TextIO.getChar();			
				} while (city != ':');
					datasales = TextIO.getln();					
					try {
					sales = Double.parseDouble(datasales);
					total = total + sales;
					} catch(NumberFormatException e) {
						count++;
					}
				}
			TextIO.putln("Total sales recorded from all cities: " + total);
			
			TextIO.putln("The number of cities for which data was not available: " + count);

		}
}
	


