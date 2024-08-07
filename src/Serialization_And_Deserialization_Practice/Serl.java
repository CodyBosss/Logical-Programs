package Serialization_And_Deserialization_Practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serl {

	public static void main(String [] args) {
		
//		Employee emp = new Employee(100, "Sudhir" ,"8857043067");
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(100, "Sudhir", "9876543423"));
		
		try {
			
		FileOutputStream fos = new FileOutputStream("abc.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(list);
		
		fos.close();
		oos.close();			
		}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
