package Java8Features;

import java.util.List;

public class SortedethodInStreamAPI {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(9,2,5,4,3,6,7,8,1);
		
		list.stream().sorted().forEach(System.out::println);

	}

}
