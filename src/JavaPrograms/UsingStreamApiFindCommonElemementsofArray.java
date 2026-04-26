package JavaPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingStreamApiFindCommonElemementsofArray {

	public static void main(String[] args) {
		
		List<Integer> list1 = List.of(1,2,3,4,5);
		List<Integer> list2 = List.of(4,5,6,7,8);
		
		List<Integer> list = list1.stream().filter(list2::contains).collect(Collectors.toList());
		System.out.println(list);

	}

}
