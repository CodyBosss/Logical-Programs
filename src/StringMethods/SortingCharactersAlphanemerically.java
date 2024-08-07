package StringMethods;

public class SortingCharactersAlphanemerically {

	public static void main(String[] args) {
		
		String str = "qwertyuiopllkjhgfdsazxcvbnm";
		char [] c = str.toCharArray();
		char temp;
		
		for(int i=0; i<c.length;i++) {
			for(int j=i+1; j<c.length; j++) {
				if(c[i]>c[j]) {
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
//		System.out.println(new String(c));
		for(char a : c) {
			System.out.print(" "+a);
		}
	}

}
