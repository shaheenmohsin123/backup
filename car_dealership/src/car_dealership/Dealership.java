package car_dealership;

public class Dealership {

	public static void main(String[] args) {
	
		Customer cust1=new Customer();
		cust1.setName("Tom");
		cust1.setAddress("9th street first avenue");
		cust1.setCashOnHand(25000);
		
		Vehicle vehicle= new Vehicle("Honda","Accord",15000);
		Vehicle car=new Vehicle("Honda","Accord",15000);
		 boolean value = car.equals(vehicle);
		 System.out.println(value);
		
		Employee emp=new Employee();
		
		cust1.purchaseCar(vehicle, emp, false);
	}

}
