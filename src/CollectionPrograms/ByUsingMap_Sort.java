package CollectionPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ByUsingMap_Sort {
	
	public static void main(String [] args) {
		
		Map<Integer, String> hm = new HashMap<>();
		hm.put(12, "Sudhir");
		hm.put(34, "Ronny");
		hm.put(43, "Chinti");
		hm.put(1, "Chiki");
		hm.put(2, "Bitti");
		
		Iterator<Integer> it = hm.keySet().iterator();
		System.out.println("Before Shorting...");
		
		while(it.hasNext()) {
			int key = (int)it.next();
			System.out.println("ID : "+key+" name : "+hm.get(key));
		}
		
		Map<Integer, String> tm = new TreeMap<>(hm);
		Iterator<Integer> itm = tm.keySet().iterator();
		
		System.out.println("\n");
		System.out.println("After Shorting...");
		while(itm.hasNext()) {
			int key = (int)itm.next();
			System.out.println("ID : "+key+" name : "+tm.get(key));
		}
		
	}

}
