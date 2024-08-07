package StringMethods;

public class StringequalAnddoubleequaltooperator {

	
	public static void main(String[] args) {
		
		// below program will throw boolean values.
		
		String s1 = "ABC";
		String s2 = "ABC";
		
		String s5 = new String("ABC");
		
		System.out.println(s1.equals(s2));	//true
		System.out.println(s1==s2);			//true
		
		String s3 = new String("Sudhir");
		String s4 = new String("Sudhir");
		
		System.out.println(s3.equals(s4));	//true
		System.out.println(s3==s4);			//false
		
		System.out.println(s1==s3);			//false
		System.out.println(s1.equals(s5));	//true
		
		// StringBuffer 
		
		StringBuffer sb = new StringBuffer("Sudhir");
		sb.append("Khandare");
		System.out.println(sb);
					
	}

}
