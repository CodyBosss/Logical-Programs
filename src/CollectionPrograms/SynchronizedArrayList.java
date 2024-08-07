package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		List<String> name = Collections.synchronizedList(new ArrayList<>());
						
		name.add("Sudhir");
		name.add("Ronny");
		name.add("Chinti");
		name.add("Chiku");
		name.add("Bitti");		
		
		synchronized(name) {
			Iterator it = name.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
	}
}
