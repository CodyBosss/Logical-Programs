package CollectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionIteratorsUsingRemoveMethod {
			
		public static void main(String[] args) {
		   
			List list = new ArrayList<>();
			
			list.add(12);
			list.add(22);
			list.add(4);
			list.add(3);
			
//			System.out.println(list);
			
			Iterator<Integer> it = list.iterator();
			while(it.hasNext()) {
				Integer i = it.next();
				if(i<10) {
					it.remove();
				}
			}
			System.out.println(list);
	}

}
