package tut2.Interface;

public class MeasureCalculation extends Employee {

	public MeasureCalculation(String name, double salary) {
		super(name, salary);
	}
	
	
	/**
	 * @effects compute the average salary of an array of employees.
	 */
	public static double average(Measurable[] objects) {
		double sum=0;
		for (Measurable x: objects) 
			sum += x.getMeasure();
		double average = sum/objects.length;
		return average;
			
		}
	
	/**
	 * @effects to find employee name with highest salary among employees
	 */
	public static Measurable largest(Measurable[] objects) {
		double max = 0;
		Measurable temp = null;
		for (Measurable x: objects) {
			if(x.getMeasure() > max) {
				max = x.getMeasure();
				temp = x;
			}
		}
		return temp;
	}
	
}
