package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class ByusingHashMapToCheckValueofParticularKey {
	
	public static void main(String [] args) {
		Map<String, Integer> hs = new HashMap<>();
		hs.put("Sudhir", 1);
		hs.put("Rahul", 2);
		hs.put("Akshay", 3);
		
		System.out.println(hs);
		
		System.out.println("Size of map is : "+hs.size());
		
		hs.containsKey("Sudhir");
		Integer s = hs.get("Sudhir");		
		System.out.println("Value for Sudhir is "+s);
		
 	}

}
