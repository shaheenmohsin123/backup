package collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Application3 {

	public static void main(String[] args) {
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(12);
		hashSet.add(43);
		hashSet.add(15);
		hashSet.add(67);
		
		ArrayList<Integer> myList = new ArrayList<Integer>(hashSet);
		
		Collections.sort(myList);
		System.out.println(myList);
		
		
	}

}
