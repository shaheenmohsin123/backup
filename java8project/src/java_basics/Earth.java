package java_basics;

public class Earth {

	public static void main(String[] args) {
	
		Human human1=new Human("Tom", 25, 76, "Blue");
		Human human2=new Human("Jerry", 35, 87, "Red");
		Human human3=new Human("Harry", 45, 97, "Pink");
 
		human1.speak();
		human2.speak();
		human3.speak();
	}

}
