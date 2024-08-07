package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collection;


public class CollectionAddMethods {

	public static void main(String[] args) {
		
		//Collection Object 1
		
		ArrayList al = new ArrayList();
		
		al.add(111);
		al.add(200);
		al.add(300);
		
		System.out.println(al);
		
		//Collection Object 2
		
		ArrayList al2 = new ArrayList();
		
		al2.add("Sudhir");
		al2.add("Chiki");
		al2.add("Appu");
		
		System.out.println(al2);
		
		// addAll means we can add one collection object to 2nd collection object.
		
		al.addAll(al2);
		System.out.println(al);
		
		ArrayList al3 = new ArrayList();
		
		al3.add(111);
		al3.add(222);
		al3.add(333);
		
		//it add string inside value
		
		System.out.println(al3.add("aaa"));		
		System.out.println(al3);
		
		// it returns boolean values
		
		System.out.println(al3.contains(500));// returns boolean values like true and false
		
		System.out.println(al3.isEmpty()); //it will returns boolean values also like true and false
		
		System.out.println(al3.size()); //it will shows the size of collection object
	
		al3.remove(0);  //remove method removes the integer values and key 		
		System.out.println(al3);
		
		//it removes same elements from the collection objects
		
		al.removeAll(al3);
		System.out.println(al);
		System.out.println(al3);
		
		al3.clear(); // it removes all the objects from collection
		System.out.println(al3);		
		
	}

}
