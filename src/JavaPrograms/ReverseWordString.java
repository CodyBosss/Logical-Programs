package JavaPrograms;

public class ReverseWordString {

	public static void main(String[] args) {
		
		String str = "My name is Sudhir Khadnare";
		String [] a = str.split(" ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=a.length-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}

	}
}
