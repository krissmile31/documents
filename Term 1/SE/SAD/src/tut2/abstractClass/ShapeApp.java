package tut2.abstractClass;

public class ShapeApp {
	public static void main(String[] args) {
		Circle c = new Circle(3.5, "pink", false);
		System.out.println(c);
		System.out.println(c.getArea());
		System.out.println(c.getPerimeter());
		
		Rectangle re = new Rectangle(5, 6, "black", true);
		System.out.println(re);
		Square s = new Square(8, "brown", true);
		s.setWidth(9);
		System.out.println(s);
		System.out.println(s.getArea());
		System.out.println(s.getPerimeter());
	
	
	}

}