package tut1;


public class Ex2_2 {
	public static void main(String[] args) {
		int die1 = (int) (Math.random()*6) + 1;
		int die2 = (int) (Math.random()*6) + 1;
		int total = die1 + die2;
		System.out.println("The fisrt dice comes up " + die1);
		System.out.println("The second dice comes up " + die2);
		System.out.println("your total roll is "+ total);
		

	}

}
