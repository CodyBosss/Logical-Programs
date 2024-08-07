package CollectionPrograms;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SynchronizedHashSet {

	public static void main(String[] args) {
		
		Set<String> hs = Collections.synchronizedSet(new HashSet<>());
		
		hs.add("Sudhir");
		hs.add("Bala");
		hs.add("Chiki");
		hs.add("Bitti");
		
		System.out.println(hs);
	}
}
