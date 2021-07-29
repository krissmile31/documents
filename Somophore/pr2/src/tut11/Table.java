package tut11;

import utils.TextIO; 
public class Table{
    public static void main(String[] args) {
		TextIO.putln("Input the number of rows: ");
		int row = TextIO.getInt();
		TextIO.putln("Input the number of columns: ");
		int col = TextIO.getInt();
		
		String [][] table = new String[row][col];
		for(int i = 0; i < table.length; i++){
			for(int j = 0; j < table[i].length; j++){
				table[i][j] = "table";
			}
		}
		for(int d = 0; d <= (table[0].length *6); d++)
		    TextIO.put("-");
		TextIO.putln();
		for(int i = 0; i < table.length; i++){
			TextIO.put("|");
			for(int j = 0; j < table[i].length;j++){
				TextIO.put("table");
				TextIO.put("|");
			}
			TextIO.putln();
			for(int d = 0; d <= (table[0].length *6); d++)
				TextIO.put("-");
			TextIO.putln();
		}
    }
}
