package java_basics;

public abstract  class Animal {
String name;
int age;
String gender;
int pounds;
public Animal(String name, int age, String gender, int pounds) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.pounds = pounds;
}
public void eat() {
	System.out.println("It eats "+pounds +"lbs food");
}
public void sleep() {
	System.out.println("The "+ name + " at the " +age + " years gets old");
}
public abstract void move();

}
