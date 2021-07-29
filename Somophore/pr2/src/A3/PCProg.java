package A3;

import static utils.TextIO.getln;
import static utils.TextIO.getlnInt;
import static utils.TextIO.getlnChar;
import static utils.TextIO.putln;
import static utils.TextIO.writeFile;
import static utils.TextIO.writeStandardOutput;

import utils.DomainConstraint;

/**
 * @overview PCProg is a program that captures data about PC objects 
 *         and displays a report about them on the console.
 * 
 * @attributes 
 * objs   Set
 * 
 * @object A typical PCProg is {c1,...,cn} where c1,...,cn are pcs
 * 
 * @abstract_properties 
 * mutable(objs) = true /\ optional(objs) = false
 * 
 * @author NgocAnh
 */
public class PCProg {
	@DomainConstraint(type = "Set", mutable = true, optional = false)
	private Set objs;

	/**
	 * @effects 
	 * initialise this to have an empty set of PCs
	 */
	public PCProg() {
		objs = new Set();
	}

	/**
	 * @effects 
	 * if this has objects 
	 *    display a text-based tabular report and return this report 
	 * else 
	 *    display nothing and return null
	 */
	public String displayReport() {
		if (objs.size() > 0) {
			Object[] objsArr = objs.getObjects();
			PC[] pcs = new PC[objsArr.length];
			int i = 0;
			for (Object o : objsArr) {
				pcs[i++] = (PC) o;
			}

			PCReport reportObj = new PCReport();
			return reportObj.displayReport(pcs);
		} else {
			return null;
		}
	}

	/**
	 * @effects 
	 * save report to a file pcs.txt in the same directory 
	 * as the program's
	 */
	public void saveReport(String report) {
		String fileName = "pcs.txt";
		writeFile(fileName);
		putln(report);
		writeStandardOutput();
	}

	/**
	 * The run method
	 * 
	 * @effects 
	 * initialise an instance of PCProg 
	 * create objects from data entered by the user 
	 * display a report on the objects 
	 * prompt user to save report to file 
	 * if user answers "Y" 
	 *    save report 
	 * else 
	 *    end
	 */
	public static void main(String[] args) {
		//
		PCProg prog = new PCProg();

		// create objects
		prog.createObjects();

		// display report
		String report = prog.displayReport();

		if (report != null) {
			// prompt user to save report
			putln("Save report to file? [Y/N]");
			String toSave = getln();
			if (toSave.equals("Y")) {
				prog.saveReport(report);
				putln("report saved");
			}
		}

		putln("~END~");
	}

	/**
	 * @effects create a new PC object
	 * Set records the PC objects
	 */
	public void createObjects() {
		Set comps = new Set();
		putln("Welcome!");
		putln("Input the following attributes ");
		while (true) {
			putln("model: ");
			String model = getln();

			putln("year: ");
			int year = getlnInt();

			putln("manufacturer: ");
			String manufacturer = getln();

			putln("components: ");
			String components = getln();
			comps.add(components);

			PC pc = new PC(model, year, manufacturer, comps);
            objs.add(pc);
			putln(pc);
			
            char inputMore;
			do {
				putln("Input again? [Y/N]");
			    inputMore = getlnChar();
			} while (inputMore != 'Y' && inputMore !='N');
			if (inputMore == 'N')
				break;
		}
	}
}
