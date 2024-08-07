package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionIteratorUsingLoop {

	public static void main(String[] args) {
		
		Collection values = new ArrayList();
		
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		
		// Using While Loop

		Iterator it = values.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}

}
