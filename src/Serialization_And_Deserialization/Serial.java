package Serialization_And_Deserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
	
	public static void main(String [] args)throws IOException{
		
		// create object of student
		Student std = new Student("Sudhir Khandare", "sandy@gmail.com", 29, "Shirur");
		
		//write date to file
		FileOutputStream fos = new FileOutputStream("ob.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		// how to serialize
		oos.writeObject(std);
		
		oos.close();
		fos.close();
		
		System.out.println("Object state is transfered to file ob");
	}

}
