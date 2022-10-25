package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Application4 {

	public static void main(String[] args) {
		
		HashSet<Employee> hashSet = new HashSet<Employee>();
		hashSet.add(new Employee("Mike",3500,"Accounting"));
		hashSet.add(new Employee("Paul",3000,"Admin"));
		hashSet.add(new Employee("Peter",4000,"It"));
		hashSet.add(new Employee("Angel",2000,"Maint"));
		
		ArrayList<Employee> myList = new ArrayList<Employee>(hashSet);
		Collections.sort(myList);
		System.out.println(myList);
		

	}

}
