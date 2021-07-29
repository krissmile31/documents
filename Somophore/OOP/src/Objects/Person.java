package Objects;

class Person {
	String name;
	String personality;
	boolean isSitting;
	Robot robotOwned;
	
	Person(String name, String per, boolean isS){
		this.name=name;
		this.personality=per;
		this.isSitting=isS;
	}
	
	void sitDown() {
		this.isSitting = true;
	}
	
	void standUp() {
		this.isSitting = false;
	}

}
