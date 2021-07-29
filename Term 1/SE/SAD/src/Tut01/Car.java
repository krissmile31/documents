package Tut01;

public class Car {
	
	private int speed;
	private double regularPrice;
	private String color;
	private String carName;
	
	
	public Car(int speed, double regularPrice, String color) {
		this.speed=speed;
		this.regularPrice=regularPrice;
		this.color=color;
	}
	
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getSalePrice() {
		if (color.equals("Black"))
			return this.regularPrice * 1.5;
			
		else
			return this.regularPrice * 1.2;
	}


	public String toString() {
		return carName + " car whose speed is " + speed + ", color " + color +  " with regular price= " + regularPrice + " and sale price= " + getSalePrice();
	}
	
	
	public static void main(String[] args) {
		Car FordMondeo = new Car(80, 5000, "Red");
		FordMondeo.carName="Ford";
		System.out.println(FordMondeo);
		
		Car ToyotaCamry = new Car(90, 6000, "Black");
		
		System.out.println(ToyotaCamry.getSalePrice());
		System.out.println(ToyotaCamry);
		
		ToyotaCamry.setCarName(FordMondeo.carName);
		ToyotaCamry.setSpeed(FordMondeo.speed);
		ToyotaCamry.setColor(FordMondeo.color);
		
		System.out.println(ToyotaCamry);
		System.out.println(ToyotaCamry.getSalePrice());
		
	}
	
}
