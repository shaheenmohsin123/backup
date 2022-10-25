package java_basics;

public class Fish extends Animal {

	public Fish(String name, int age, String gender, int pounds) {
		super(name, age, gender, pounds);
		
	}
	
	public void swim() {
		System.out.println("swimming....");
	}

	//@Override
	public void move() {
	    System.out.println("Fish is swimming");
		
		
	}

}
