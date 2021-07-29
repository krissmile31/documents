package tut2.Interface;

public class MyClass {
	public static void main(String[] args) {
		Measurable[] m = new Measurable[3];
		m[0] = new Employee("anh", 0);
		m[1] = new Employee("mei", 1000);
		m[2] = new Employee("Rain", 5666555);
		
		System.out.println("Average is " + MeasureCalculation.average(m));
		System.out.println("Max is " + ((Employee) MeasureCalculation.largest(m)).getName());
	
	/**
	 * The reason why we need a cast is because return type of method largest()is
	 *  an interface, which doesn’t cast to specific class, so we need a cast to convert from
	 * Interface -> class
	 *
	 */

		Measurable[] n = new Measurable[3];
		n[0] = new Employee("anh", 0);
		n[1] = new Employee("mei", 1000);
		n[2] = new Employee("Rain", 5666555);
		System.out.println("Average is " + MeasureCalculation.average(n));
		System.out.println("Max is " + ((BankAccount) MeasureCalculation.largest(n)).getAccountName());
	}
}
