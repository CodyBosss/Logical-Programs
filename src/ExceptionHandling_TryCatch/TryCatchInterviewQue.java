package ExceptionHandling_TryCatch;

public class TryCatchInterviewQue {
	
	public static void main(String [] args) {
		try {
			System.out.println("1");
			int a = 10/0;
			System.out.println("2");
		}
		catch(ArithmeticException e) {
			System.out.println("3");
		}
		catch(Exception e) {
			System.out.println("4");
		}
		finally {
			System.out.println("5");
		}
	}

}
