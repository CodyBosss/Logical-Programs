package CollectionPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class CollectionTest {
	public static void main(String[] args) {
			
			Map<Integer, String> hm = new HashMap<>();
			
			hm.put(143, "Sudhir");
			hm.put(534, "Ronny");
			hm.put(654, "Chinti");
			hm.put(50,"Nilya");
			
			Iterator it = hm.keySet().iterator();
			System.out.println("Before Sorting...");
			
			while(it.hasNext()) {
				int key = (int)it.next();
				System.out.println("ID:"+key+" Name: "+hm.get(key));
			}		
			
			Map<Integer,String> tm = new TreeMap<>(hm);
			Iterator itm = tm.keySet().iterator();
			
			System.out.println("After Sorting...");
			
			while(itm.hasNext()) {
				int key = (int)itm.next();
				System.out.println("ID : "+key+" Name : "+tm.get(key));
			}
	}
}