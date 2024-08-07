package JavaPrograms;

public class FindOccurencesUsingString {
	
	public static void main(String [] args) {
		String str = "Welcome to Pune and Welcome to Mumbai";
		countOccurences(str);
	}
	
	public static void countOccurences(String str) {
		char ch = 'W';		
		System.out.println("No.of "+ch+" chars are : "+str.chars().filter(c->c==ch).count());
	}

}
