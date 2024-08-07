package StringMethods;

public class StringMethods {

	public static void main(String[] args) {

		String s = "sudhir khandare";
		
		// *****indexOf() method*****
		
		/* The indexOf() method return the first occurrence of the specified characters (ex. s) String or return -1, 
		 * if the character does not occurs */
				
		System.out.println(s.indexOf('u'));
		System.out.println(s.indexOf("dh"));
		
		
		// *****lastIndexOf() method*****
		
		/* The lastIndexOf() method returns the position of the last occurrence of the specified characters(s) in a
		  String or return -1, if the character does not occurs. */
		
		 System.out.println(s.lastIndexOf('d'));
		 
		 
		 // ****charAt() method****
		 
		 /* The charAt() method returns the character at the specified index. The index value should lie between 0 and
		    length()-1. */
		  
		 System.out.println(s.charAt(3));
		 
		 
		 // *****contains() method*****
		 
		 /* The contains() method searches the sequence of characters in the  given string. it returns true if sequence 
		    of char values are found in this String otherwise returns false */
		 
		 System.out.println(s.contains("ud"));
		 
		 
		 // *****startsWith()*****
		 
		 /* startWith() method  tests  if a  string starts  with  the specified prefix begining from the 1st index, if
		    yes it will return true else it will return false */
		 
		 System.out.println(s.startsWith("s"));
		 
		 
		 // *****endsWith() method*****
		 
		 /* The endsWith() method checks whether the string ends with a specified suffix. if yes the method will return
		    true otherwise return false */
		  
		 System.out.println(s.endsWith("r"));
		 
		
		 //*****toUpperCase() method*****
		 
		 /* The toUpperCase() method converts all characters of the string into a uppercase latter */
		 
		 System.out.println(s.toUpperCase());
		 
		 
		 //*****toLowerCase() method*****
		 
		 /* he toUpperCase() method converts all characters of the string into a lowercase latter */
		
		 System.out.println(s.toLowerCase());
		 
		 
		 //*****valueOf() method*****
		 
		 /* The valueOf() method converts different types of values into string. By the help of String.valueOf()
		  * method, we can convert int/char/float/double/long/object or any other type into the string.
		  * 
		  * Note: valueOf() method is static method thats why we can call valueOf() method directly by string class. */
		 
		 int a = 10;
		 
		 String s1 = String.valueOf(a);
		 System.out.println(s1);
		 
		 
		 //*****toCharArray()*****
		 
		 /* The toCharArray() method converts the given String into a sequence of characters. The returned array length
		  * is equal to the length of string. */
		 char [] c = s.toCharArray();
		 for(int i=0; i<c.length-1; i++) {
			 System.out.println(c[i]);
		 }
		
		 
		}

}
