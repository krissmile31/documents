package Objects;

class Robot {
	String name;
	String color;
	int weight;
	Robot isFriend;
	
	Robot(String name, String color, int weight){
		this.name = name;
		this.color = color;
		this.weight = weight;
	}
	void introduceSelf() {
		System.out.println("My name is " + name);
	}

}
