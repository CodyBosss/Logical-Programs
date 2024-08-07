package JavaPrograms;

public class PalindromString {

	public static void main(String[] args) {
		
		String str = "madam";
		String rev = "";
		int n = str.length();
		
		for(int i=n-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not Palindrom");
		}

	}

}
