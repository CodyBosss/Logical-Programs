package Java8Features;

import java.util.List;

public class MaxMethodInStreamAPI {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(22,11,33,44,55,66,77);
		
		Integer integer = list.stream().max((x,y) -> x.compareTo(y)).get();
		System.out.println(integer);
	}

}
