package Java8Features;

import java.util.List;

public class MinMethodInStreamAPI {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(11,23,45,66,33,22);
		
		Integer integer = list.stream().min((x,y) -> x.compareTo(y)).get();
		System.out.println(integer);

	}

}
