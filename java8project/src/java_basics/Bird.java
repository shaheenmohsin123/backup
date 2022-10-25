package java_basics;

public  class Bird extends Animal{

	public Bird(String name, int age, String gender, int pounds) {
		super(name, age, gender, pounds);
	
	}

	@Override
	public void move() {
		System.out.println("Flapping wings....");
		
	}

}
