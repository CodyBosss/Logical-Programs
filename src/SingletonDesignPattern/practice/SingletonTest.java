package SingletonDesignPattern.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SingletonTest {

	public static void main(String[] args) {
		
		Employee e = new Employee(1303, "Sudhir");
		Employee e1 = new Employee(120, "Ronny");
		Employee e2 = new Employee(13, "Chinti");
		
		Map<Integer, Employee> hm = new HashMap<>();
		hm.put(340, e);
		hm.put(23, e1);
		hm.put(3000, e2);
		
		Iterator<Integer> it = hm.keySet().iterator();
		System.out.println("Before Sorting...");
		while(it.hasNext()) {
			int key = (int)it.next();
			System.out.println("Id : "+key+" name : "+hm.get(key));
		}
		
		Map<Integer, Employee> tm = new TreeMap<>(hm);
		System.out.println("After Sorting...");
		
		Iterator<Integer> itm = tm.keySet().iterator();
		while(itm.hasNext()) {
			int key = (int)itm.next();
			System.out.println("Id : "+key+" name :"+tm.get(key));
		}
	}

}
