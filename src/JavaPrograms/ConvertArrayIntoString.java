package JavaPrograms;

import java.util.Arrays;

public class ConvertArrayIntoString {

	public static void main(String[] args) {
		
		String [] a = {"Apple", "Mango", "Greps", "Banana"};
		String str = String.join(", ", a); //join helps to join elements of an array in a single string.
		System.out.println(str);

	}

}
