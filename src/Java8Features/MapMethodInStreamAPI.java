package Java8Features;

import java.util.List;
import java.util.stream.Collectors;

public class MapMethodInStreamAPI {

	public static void main(String[] args) {
		
		List<Integer> Numbers = List.of(2,3,4,5,6,7);
		List<Integer> ExNum1 = Numbers.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println(ExNum1);

	}

}
