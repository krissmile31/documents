package A3;

/**
 * @overview Displays a text-based tabular report on some {@link PC} objects.
 */
public class PCReport {
	/**
   * @effects
   *  generate and return a tabular report about PC objects in this.
   *  
   *  <p>The report title is displayed in the middle of the first line.
   *  All but the first column correspond to the PC attributes, 
   *  the rows are data about the PC objects. The first column sequentially
   *  displays the row numbers. 
   *  
   *  <p>The column widths are calculated based on the attribute lengths
   *  such that the cell values are properly aligned with the columns and are displayed 
   *  right-justified. Further, cells on same row are at least one space apart 
   *  from each other.
   *  
   *  <p>e.g.<br>
   *  --------------------------------------------------------------------------------
   *                                 PCPROG REPORT
   *  --------------------------------------------------------------------------------
   *  1  Vostro 3650MT      2016    DELL      [Intel-Core-i3-6100 CPU,4GB-DDR3L RAM, ...]
   *  2  ...
   *  3  ...
   *  --------------------------------------------------------------------------------
   */
	public String displayReport(PC[] objs) {
		if (objs == null || objs.length ==0)
			return null;
		else {
		    String report = "";
		    int col1 = 3, col2 = 20, col3 = 6, col4 = 20, col5 = 50;
		
		    // space character
		    String sp = " ";
		
		    // ordinal number
		    int ordinal = 1;
		
		    for (int i=0; i<100; i++)
			    report += "-";
		    // putln()
		    report += "\n";
		
		    // header
		    report += String.format("%57s", "PCPROG REPORT");
		    report += "\n";
		
		    for (int i=0; i<100; i++)
			    report += "-";
		    report += "\n";
		
		    // content
		    for(PC pc : objs) {
			    report += String.format("%" + col1 + "s" + "%" + col2 + "s" + "%" + col3 + "s" + "%" + col4 + "s"
					+ "%" + col5 + "s", ordinal + sp, pc.getModel() + sp, pc.getYear() + sp, pc.getManufacturer() + sp,
					pc.getComps().toString() + "\n");
			
			    ordinal++;
		}
		
		    report += "\n";
		
		    for (int i=0; i<100; i++)
			    report += "-";
		    return report;
  } 
}
}