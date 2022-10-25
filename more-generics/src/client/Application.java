package client;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		
		Container<Integer,String> container = new Container<>(12,"Hello");
		int val1 = container.getItem1();
		String val2 = container.getItem2();
		
		Set<String> mySet1 = new HashSet<String>();
		mySet1.add("first");
		mySet1.add("second");
		mySet1.add("Whatever");
		
		Set<String> mySet2 = new HashSet<String>();
		mySet2.add("first");
		mySet2.add("second");
		mySet2.add("computer");
		
		Set<String> resultSet = union(mySet1, mySet2);
		Iterator<String> itr = resultSet.iterator();
		while(itr.hasNext()){
			String var = itr.next();
			System.out.println(var);
			
		}
				
		
		
		
		
		
	}

	public static <E> Set<E> union (Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
		
	}
	
	
	
	
}
