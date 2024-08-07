package ExceptionHandling_TryCatch;

import java.util.List;

class Ex extends Exception {
	Ex(String s) {
		super(s);
	}
}

public class Test {
	public static void main(String[] args) {

		try {
			throw new Ex("NewException");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}