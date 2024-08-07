package JavaPrograms;

import java.util.Arrays;

public class ConvertStringToArray {

	public static void main(String[] args) {
		
		String str = "a,c,d";
		String [] a = str.split(" ");
		System.out.println(Arrays.toString(a));

	}

}
