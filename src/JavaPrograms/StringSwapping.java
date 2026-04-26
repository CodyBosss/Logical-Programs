package JavaPrograms;

public class StringSwapping {

	public static void main(String[] args) {
		String a = "Java";
		String b = "Developer";

		// using two variable
//		System.out.println("Before Swapping\n"+"a : "+a+".... "+"b :"+b);
//		
//		a=a+b;
//		b=a.substring(0,a.length() - b.length());
//		a=a.substring(b.length());
//		
//		System.out.println("After Swapping\n"+"a : "+a+".... "+"b :"+b);

		// using third variable
		String temp = a;
		a = b;
		b = temp;

		System.out.println("After Swapping\n" + "a : " + a + ".... " + "b :" + b);
	}

}
