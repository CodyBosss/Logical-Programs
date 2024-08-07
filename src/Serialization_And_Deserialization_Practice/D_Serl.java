package Serialization_And_Deserialization_Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class D_Serl {

	public static void main(String[] args){
		
		
		
		try {
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee e = (Employee)ois.readObject();
		
		e.showName();
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getContact());
		
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		
		catch(ClassCastException e) {
			System.out.println(e);
		}
		
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
