package CollectionPrograms.hashmap;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurencesUsingStream {

	public static void main(String[] args) {
		String str = "Welcome to Pune or Welcome to Mumbai";
		findOccurences(str);
//		System.out.println(findCount(str, str));
	}

	public static void findOccurences(String str) {
		Map<String, Long> countWord = Arrays.stream(str.split("\\s+")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		countWord.forEach((word, count) -> System.out.println(word + ": " + count));
	}
	public static int findCount(String str, String find) {
		String[] arr = str.split(" ");
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(find)) {
				count++;
			}
		}
		return count;
	}


}
