package java_basics;

public class Zoo {

	public static void main(String[] args) {
		Animal sparrow1=new Sparrow("tiny",2,"female",5);
		//sparrow1.move();
		//sparrow1.sleep();
		//sparrow1.eat();
	//	sparrow1.fly();
		
		
	//	Animal sparrow2=new Sparrow("tiny",2,"female",5);
	//	sparrow2.move();
		
	Animal fish1=new Fish("small",1,"Male",3);
		//fish1.move();
		moveAnimal(sparrow1);
		moveAnimal(fish1);
		
		
	}
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
