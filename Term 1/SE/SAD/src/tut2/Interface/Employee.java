package tut2.Interface;

public class Employee implements Measurable {
	private String name;
	private double salary;
	
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	
	public String getName() {
		return this.name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getMeasure() {
		return this.salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}



}
