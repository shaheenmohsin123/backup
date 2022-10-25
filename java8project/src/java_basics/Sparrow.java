package java_basics;

public class Sparrow extends Bird implements Flyable{

	public Sparrow(String name, int age, String gender, int pounds) {
		super(name, age, gender, pounds);
		
	}

	//@Override
	public void fly() {
		System.out.println("Sparrow flying high....");
		
	}

}
