package JavaPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingStreamApiFindCommonElemementsofArray {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		System.out.println("List1 : "+list1);
		
		List<Integer> list2 = Arrays.asList(6,7,8,2,3);
		System.out.println("List2 : "+list2);
		
		Stream<Integer> stream1 = list1.stream();
		
		Stream<Integer> stream2 = stream1.filter(list2::contains);
		
		List<Integer> commonlist = stream2.collect(Collectors.toList());
		
		System.out.println();
		System.out.println("CommonList : "+commonlist);

	}

}
