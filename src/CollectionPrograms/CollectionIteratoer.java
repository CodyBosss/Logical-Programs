package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionIteratoer {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(10);
		l.add(20);
		l.add(30);
		
//		System.out.println(l);
		
		Iterator it = l.iterator();
		
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
