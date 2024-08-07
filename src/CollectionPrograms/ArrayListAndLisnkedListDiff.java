package CollectionPrograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAndLisnkedListDiff {

	public static void main(String[] args) {
		
//		ArrayList Diff
		
//		List<String> list = new ArrayList<>();
//		list.add("a");
//		list.add("b");
//		list.add("c");
//		
//		System.out.println(list);
//		List al = new ArrayList();
//		for(String l : list) {
//			if(l.startsWith("a")) {
//				al.add(l);
//				System.out.println(al);
//			}
//		}
		
		
//		LinkedList Diff
		
		List<String> name = new LinkedList<>();
		
		name.add("Sudhir");
		name.add("Chiki");
		name.add("Bitti");
		
		System.out.println(name);
		
		name.remove(0);
		System.out.println(name);
		
		name.set(0, "Ronny");
		System.out.println(name);
		
	}

}
