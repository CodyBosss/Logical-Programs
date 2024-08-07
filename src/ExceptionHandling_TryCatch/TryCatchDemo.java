 package ExceptionHandling_TryCatch;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchDemo {

	public static void main(String[] args) {
		
	/*	try {
//			FileInputStream fsi = new FileInputStream("d:/abc.txt");	//FileNotFoundException
			Class.forName("com.mysql.jdbc.Driver");						// java.lang.ClassNotFoundException
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Hello");		*/
		
		
		try {
			int a =100, b=0, c;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Hello");
	}

}
