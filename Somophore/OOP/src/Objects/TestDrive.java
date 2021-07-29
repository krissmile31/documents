package Objects;

public class TestDrive {
	public static void main(String[] args) {
		Robot r5 = new Robot("a", "jh", 56);
		Robot r6 = new Robot("jkh", "hj", 65);
		
		r5.introduceSelf();
		
		Person p5 = new Person("as", "yuhf", false);
		Person p6 = new Person("sa", "uig", true);
		
		p5.standUp();
		p5.sitDown();
		
		
		p5.robotOwned = r5;
		
		p5.robotOwned.introduceSelf();
		
		r5.isFriend = r6;
		
		p6.sitDown();
		p6.robotOwned = r6;
		p6.robotOwned.introduceSelf();
		
	}

}
