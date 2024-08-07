package ExceptionHandling_TryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyBlockExample {

	public static void main(String[] args)throws IOException {
		
		FileInputStream fsi = null;
		try {
			fsi = new FileInputStream("d:/abc.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		finally {
			// cleanup code			
			if(fsi!=null) {				
				fsi.close();				
			}
			System.out.println("File closed");
		}
	}
}
