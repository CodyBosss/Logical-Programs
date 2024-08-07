package Java8Features;

import java.util.List;
import java.util.stream.Collectors;

public class FilterMethodInStreamAPI {

	public static void main(String[] args) {
		
		List<String> list = List.of("Sudhir", "Shekhar", "Ronny", "Chiki", "Appu","Chinti");
		List<String> Exnum = list.stream().filter(e -> e.startsWith("S")).collect(Collectors.toList());
		System.out.println(Exnum);

	}

}
