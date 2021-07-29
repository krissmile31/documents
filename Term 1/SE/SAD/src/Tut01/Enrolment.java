package Tut01;

public class Enrolment {
	private int attendanceMark;
	private float midtermMark;
	private float finalMark;
	private Course course;
	private Student student;
	
	public Enrolment(Student student, int atM, float mtM, float fnM) {
		this.student = student;
		
		this.attendanceMark = atM;
		this.midtermMark = mtM;
		this.finalMark = fnM;
	}
	
	public float overall() {
		return (this.attendanceMark * 1 + this.midtermMark *3 + this.finalMark * 6)/10;
	}
	
	
	
	@Override
	public String toString() {
		return student + " got attendance mark = " + attendanceMark + ", midterm = " + midtermMark + " and final = " + finalMark + ". Overall is " + overall();
				}

	public static void main(String[] args) {
		Student student = new Student("56", "anh");
		Student students = new Student("mei", "666");
		Student studentss = new Student("rain", "5555");
		
		Course course = new Course("Wpr", "cong");
		Course courses = new Course("SE", "duc");
		Course coursea = new Course("DBS", "cam");
		
		Enrolment en = new Enrolment(student, 6, 5, 6);
		System.out.println(en);
		
	}

}
