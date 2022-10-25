package client;

import java.util.ArrayList;
import java.util.List;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee());
		
		ArrayList<Accountant> accountants = new ArrayList<Accountant>();
		accountants.add(new Accountant());
		makeEmployeeWork(accountants);
	}

	
	public static void makeEmployeeWork(List<? extends Employee> employees) {
		for(Employee emp : employees) {
			emp.work();
		}
	}
}
