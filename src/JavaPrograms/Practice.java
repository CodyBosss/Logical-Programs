package JavaPrograms;

import java.util.Arrays;

class Practice {
	public static void main(String [] args) {
		String str = "Welcome to Pune, Welcome to Mumbai";
		String newStr = "Pune";
		
		long elist = Arrays.stream(str.split("\\s+")).filter(i->i.equalsIgnoreCase(newStr)).count();
		System.out.println(elist);
		
	}
}
