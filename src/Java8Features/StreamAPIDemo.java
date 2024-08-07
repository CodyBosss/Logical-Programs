package Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String [] args) {
		
				
		List<Integer> list = new ArrayList<>();
		
		list.add(32);
		list.add(21);
		list.add(12);
		list.add(15);
		list.add(13);
		list.add(14);
		
		System.out.println(list);
		
		List<Integer> list1 = List.of(21,32,43,33,44,55);
		System.out.println(list1);
		
		List<Integer> list3 = Arrays.asList(34,33,44,32,22,21);
		System.out.println(list3);
		
		//Without Stream API
		
		List<Integer> evenlist = new ArrayList<>();
		for(int no : list3) {
			if(no%2==0) {
				evenlist.add(no);				
			}
		}
		System.out.println(evenlist);	
		
		// With Stream Api
		
		System.out.println("\nWith Stream API\n");
		
//		Stream<Integer> stream = list3.stream();
//		List<Integer> EvenList = stream.filter(i->i%2==0).collect(Collectors.toList());		
//		System.out.println(EvenList);
		
		List<Integer> EvenList = list3.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(EvenList);
				
	}
		

}
