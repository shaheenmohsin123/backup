package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application1 {

	public static void main(String[] args) {
		
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("cat");
		animals.add("Dog");
		animals.add("Bird");
		
	/*	for(int i=0; i<animals.size(); i++) {
			System.out.println(animals.get(i));
			
		for(String value : animals) {
			System.out.println(value);
		}
			
			
		}  */
		
		
		LinkedList<Vehicle> vehicles = new LinkedList<Vehicle>();
		Vehicle vehicle2 = new Vehicle("Toyota", "Camry",12000,false);
		
		vehicles.add(new Vehicle("Honda","Accord",1200,false));
		vehicles.add(vehicle2);
		vehicles.add(new Vehicle("Jeep","Wrangler",2500,true));
		
	/*	for(Vehicle car : vehicles) {
			System.out.println(car);
			System.out.println(car.getMake());
			System.out.println(car.getModle());
			System.out.println(car.getPrice()); 
		}   */

	 printElements(animals);
	 printElements(vehicles);
	
	}
	
    public static void printElements(List someList) {
    	for(int i=0; i<someList.size(); i++) {
    		System.out.println(someList.get(i));
    	}
    }
    	
	
	

}
