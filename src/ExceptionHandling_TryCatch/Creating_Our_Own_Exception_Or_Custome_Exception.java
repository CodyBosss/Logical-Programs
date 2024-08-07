package ExceptionHandling_TryCatch;

class MyException extends Exception{
	MyException(String s){
		super(s);
	}
}

public class Creating_Our_Own_Exception_Or_Custome_Exception {

	public static void main(String[] args) {

		try {
			throw new MyException("MyExcpeion");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
