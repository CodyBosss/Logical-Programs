package JavaPrograms;

public class ConvertStringToChar {

	public static void main(String[] args) {
		
		String str = "Sudhir Khandare";
		
		int n = str.length();
	/*	for(int i=0; i<n-1; i++) {
			char c = str.charAt(i);
			System.out.println(c);
		}*/
		
		char [] c = str.toCharArray();
		for(int i=0; i<n-1; i++) {
			System.out.print(c[i]+" ");
		}

	}

}
