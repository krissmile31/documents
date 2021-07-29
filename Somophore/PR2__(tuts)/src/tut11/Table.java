package tut11;

import static utils.TextIO.getInt;
import static utils.TextIO.putln;
import utils.AttrRef;
import utils.DOpt;
import utils.DomainConstraint;
import utils.OptType;

/**
 * @overiew represents a 2 dimensional table
 * @attributes 
 * row  Integer  int 
 * col  Integer  int
 * @object a typical Table object is a = <r, c>, where row(r), col(c)
 * @abstract_properties 
 * mutable(row)=true  /\  optional(row)=false /\
 * mutable(col)=true  /\  optional(col)=false
 * 
 * @author ADMIN
 */
public class Table {
	@DomainConstraint(type = "Integer", mutable = true, optional = false)
	private int row;
	@DomainConstraint(type = "Integer", mutable = true, optional = false)
	private int col;

	/**
	 * @effects <pre>
	 * if row, col are valid
	 *       initialise this as <row, col>
	 *    else
	 *       initialise this as <> and print error
	 *  </pre>
	 * 
	 */
	public Table(@AttrRef("row") int row, @AttrRef("col") int col) {
		if (!validateRow(row)) {
			System.err.print(" Validate row:" + row);
			return;
		}
		if (!validateColumn(col)) {
			System.err.print(" Validate col:" + col);
			return;
		}
		
		this.col = col;
		this.row = row;
	}
	
	/**
	 * @effects <pre>
	 *  if row is valid
	 *     set this.row = row
	 *     return true
	 *  else
	 *     return false
	 *  </pre>
	 */
	@DOpt(type = OptType.Mutator) @AttrRef("row") 
	public boolean setRow(int row) {
		if (validateRow(row))	{
			this.row = row;
			return true;
		}
		return false;
	}
	
	/**
	 * @effects <pre>
	 *  if col is valid
	 *     set this.col = col
	 *     return true
	 *  else
	 *     return false
	 *  </pre>
	 */
	@DOpt(type = OptType.Mutator) @AttrRef("col") 
	public boolean setColumne(int col) {
		if (validateColumn(col))	{
			this.col = col;
			return true;
		}
		return false;
	}


	@Override
	public String toString() {
		String s = "";
		for (int m = 0; m < col; m++)
			s += ".______";
		s += ".";
		s += "\n";
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) 
				s += "|______";
			s += "|";
			s +="\n";
		}
		return s;
	}
	
	/**
	 * @effects return this.row
	 */
	@DOpt(type = OptType.Observer) @AttrRef("row")
	public int getRow() {
		return this.row;
	}
	
	/**
	 * @effects return this.col
	 */
	@DOpt(type = OptType.Observer) @AttrRef("col")
	public int getColumn() {
		return this.col;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Table))
			return false;
		int thisCol = ((Table) obj).col;
		int thisRow = ((Table) obj).row;
		return thisCol == col && thisRow == row;
	}

	/**
     * @effects <pre>
     *   if row is valid
     *      return true
     *   else
     *      return false
     */
    private boolean validateRow(int row) {
    	if (row < 0)
    		return false;
    	return true;
    }
    
    /**
     * @effects <pre>
     *   if column is valid
     *      return true
     *   else
     *      return false
     */
    private boolean validateColumn(int col) {
    	if (col < 0)
    		return false;
    	return true;
    }

    /** 
	 * @effects <pre>
	 *   if this satisfies abstract properties
	 *      return true
	 *   else
	 *      return false
	 * </pre>
	 */
	public boolean repOk() {
		return validateRow(row) && validateColumn(col);
	}
    
	
	//the main procedure
	public static void main(String[] args) {
		putln("Input the number of rows: ");
		int row = getInt();
		
	    putln("Input the number of columns: ");
        int col = getInt();
        
		Table table = new Table(row, col);
		putln(table.repOk());
		putln(table);
	}
}
