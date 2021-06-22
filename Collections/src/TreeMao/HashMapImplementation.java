package TreeMao;

//Java program to illustrate
//Java.util.HashMap

import java.util.HashMap;

public class HashMapImplementation {
	
	public static void main(String[] args)
	{
		// Create an empty hash map
		HashMap<Integer, String> map = new HashMap<>();

		// Add elements to the map
		map.put( null,null);
		map.put(10,"vishal");
		map.put(null,null);
		map.put( 0,"not null");

		// Print size and content
		System.out.println("Size of map is:- "
						+ map.size());
		System.out.println(map);

		// Check if a key is present and if
		// present, print value
		if (map.containsKey(null)) {
			String a = map.get(null);
			System.out.println("value for null"
							+ "  is:- " + a);
		}
		else {
			System.out.println("Nope");
		}
	}
}
