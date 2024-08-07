package JavaPrograms;

import java.util.Arrays;

public class ConvertArrayIntoString {

	public static void main(String[] args) {
		
		String [] a = {"Apple", "Mango", "Greps", "Banana"};
		String str = String.join(", ", a);
		System.out.println(str);

	}

}
