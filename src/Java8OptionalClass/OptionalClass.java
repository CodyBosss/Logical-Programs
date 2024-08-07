package Java8OptionalClass;

import java.util.Optional;

// Without Option Class

/*public class OptionalClass {

	public static void main(String[] args) {
		
//		String str = null;
		String str = "My name is Sudhir";
		if(str==null) {
			System.out.println("Value is Null");
		}
		else {
			System.out.println(str.length());
		}
	}

}*/

public class OptionalClass {
	public static void main(String [] args) {
		
		String str = null;
//		String str = "My name is Sudhir";
			
		Optional<String> optional =	Optional.ofNullable(str);
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
		
		System.out.println(optional.orElse("no value in this obj"));
		
	}
}
