package JavaPrograms;

import java.util.Arrays;

public class HowToFindLengthofArray {
		
		public static void main(String[] args) {
			
			String [] a = {"S", "U", "D", "H", "I", "R"};
			System.out.println("Array length is : "+a.length);
			
			String str = String.join("", a);
			System.out.println("Given Array is : "+Arrays.toString(a));
			System.out.println("Conversion in String is : "+str);
			

	}

}
