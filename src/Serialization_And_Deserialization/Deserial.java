package Serialization_And_Deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial{
	public static void main(String [] args) {
		try {
			FileInputStream fis = new FileInputStream("ob.txt");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Student std = (Student)ois.readObject();
			std.displayName();
			System.out.println(std.getEmail());
			System.out.println(std.getAge());
			System.out.println(std.getAddress());
		}
		
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}