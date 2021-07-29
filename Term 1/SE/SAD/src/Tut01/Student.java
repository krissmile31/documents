package Tut01;

public class Student {
	private String studentId;
	private String studentName;
	
	public Student(String id, String name) {
	this.studentId=id;
	this.studentName=name;
	}

	@Override
	public String toString() {
		return studentName + " whose id is " + studentId;
				}
	
	
}
