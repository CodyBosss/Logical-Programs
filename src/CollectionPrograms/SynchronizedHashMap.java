
package CollectionPrograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedHashMap {

	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<>();
		hm.put("1","Rahul");
		hm.put("4", "Kiran");
		hm.put("3", "Mohan");
		
		Map<String, String> map = Collections.synchronizedMap(hm);
		hm.remove("4", "Kiran");
		System.out.println("Synchronized map is : "+map);
	}

}
