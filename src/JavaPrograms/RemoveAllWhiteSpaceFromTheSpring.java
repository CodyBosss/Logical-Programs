package JavaPrograms;

import java.util.Arrays;

public class RemoveAllWhiteSpaceFromTheSpring {

	public static void main(String[] args) {
		
		// 1st way
	
		String str = "Sudhir is  a    Java     Developer";
//		String RemoveSpaces = str.replaceAll("\\s", "");
		System.out.println(str.replaceAll("\\s", ""));
		
//		System.out.println(str.replaceAll("\\s", RemoveSpaces));
		
		// 2nd way
		
		String str1 = "Sudhir   is My   Name";
		String [] a = str1.split(" ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
		
		// 3rd Way
		
		System.out.println();
		String str3 = "Sudhir is the   one Man   Show";
		
		char[] c = str3.toCharArray();  
        StringBuffer sb = new StringBuffer();  
        for (int i = 0; i < c.length; i++) {  
            if ((c[i] != ' ') && (c[i] != '\t')) {  
                sb.append(c[i]);  
            }  
        }  
        String noSpaceStr2 = sb.toString();  
        System.out.println(noSpaceStr2); 
		

	}

}
