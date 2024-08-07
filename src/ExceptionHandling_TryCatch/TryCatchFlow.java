package ExceptionHandling_TryCatch;

public class TryCatchFlow {

	public static void main(String[] args) {
		System.out.println("1");
		try {
			
//			System.out.println("2");
//			int a=100, b=2, c;			// if there is no exception it will not go inside catch.
//			System.out.println("3");
			
			System.out.println("2");
			int a=100, b=0, c;
			System.out.println("3");
			
			c=a/b;
			System.out.println("4");
			System.out.println(c);		//if there is exception it will go inside the catch.
			System.out.println("5");
		}
		catch(ArithmeticException e) {
			System.out.println("6");
			System.out.println(e);
			System.out.println("7");
		}
		System.out.println("Hello");
	}

}
