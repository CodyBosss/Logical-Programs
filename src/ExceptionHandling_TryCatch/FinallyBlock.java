package ExceptionHandling_TryCatch;

public class FinallyBlock {

	public static void main(String[] args) {
		
		// if exception is not there try and finally will be executed
		
	/*	try {
			int a=100, b=2, c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
		System.out.println("I am in finally block");
		}	*/
		
		
		// if exception is there try, catch and finally block will executed.
		
	/*	try {
			int a=100, b=0, c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("I am in finally block");
		}	*/
		
			
			// Without catch (if exception is not there) we can execute try and finally block
		
	/*	try {
			int a=100, b=2, c;
			c=a/b;
			System.out.println(c);
		}
		finally {
			System.out.println("I am in finally block");
		}		*/
		
		
			// If exception is there without catch, try and finally can be executed.
		
		try {
			int a=100, b=0, c;
			c=a/b;
			System.out.println(c);
		}
		finally {
			System.out.println("I am in Finally Block");
		}
		System.out.println("Hello");		
	}
}
