package lesson1Hashmap;

import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {
		TreeMap<String,String> dictionary = new TreeMap<String,String>();
		  
		  dictionary.put("Brave", "Showing Courage");
		  dictionary.put("Brilliant", "Clever or talented");
		  dictionary.put("Joy", "feeling great");
		  dictionary.put("Confidence", "Ready to face danger");
		  
	//	  for(String word : dictionary.keySet()) {
	//		  System.out.println(dictionary.get(word));
	//	  }
		  
		  for(Map.Entry<String, String> entry : dictionary.entrySet()) {
			  System.out.println(entry.getKey());
			  System.out.println(entry.getValue());
		  }

	}

}
