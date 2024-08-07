package CollectionPrograms.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Methods {
	
	public static void main(String [] args) {
		HashMap hm = new HashMap();
		
		hm.put("Sudhir", 700);
		hm.put("Chki", 500);
		hm.put("chinti", 100);
		hm.put("Ronny", 400);
		System.out.println(hm);		
		System.out.println();
		
		System.out.println(hm.put("Sudhir", 1000));
		Set s = hm.keySet();
		System.out.println(s);
		System.out.println();
		
		Collection c = hm.values();
		System.out.println(c);
		System.out.println();
		
		Set hs = hm.entrySet();
		System.out.println(hs);
		System.out.println();
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Map.Entry m1 = (Map.Entry)it.next();
			System.out.println(m1.getKey()+"......."+m1.getValue());
			if(m1.getKey().equals("Sudhir")) {
				m1.setValue(10000);
			}
		}
		System.out.println(hm);
	}
	
}
