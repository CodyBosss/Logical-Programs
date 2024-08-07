
package Java8Features;

import java.util.Arrays;
import java.util.List;

public class FindUniqueUsingStreamAPI {
	
	public static void main(String [] args) {

	List<Integer> list = Arrays.asList(1,2,3,4,5,1,4,6);
	list.stream().distinct().forEach(System.out::print);
}
}
