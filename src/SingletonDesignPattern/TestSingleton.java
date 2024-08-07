package SingletonDesignPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class TestSingleton {
	
	public static void main(String [] args)throws Exception,CloneNotSupportedException {
		
//		Singleton singleton1 = Singleton.getSingleton();
//		System.out.println(singleton1.hashCode());
//		
//		Singleton singleton2 = Singleton.getSingleton();
//		System.out.println(singleton2.hashCode());
//		
//		SingletonWithEager swe1 = SingletonWithEager.getSingletonWithEager();
//		System.out.println(swe1.getSingletonWithEager().hashCode());
//		
//		SingletonWithEager swe2 = SingletonWithEager.getSingletonWithEager();
//		System.out.println(swe2.getSingletonWithEager().hashCode());
		
		
		/*case: 1
		 * 1. we can use Reflection API to break singleton pattern. 
		 * Solution:
		 * 1.If object already is there we can throw exception from constructor.
		 * 2. Use Enum
		 * 
		 * case: 2
		 * 1. By using Deserialization we can break singleton class.
		 * Solution: To avoid this we can implements readResolve Method.
		 * 
		 * case: 3
		 * 1. By using cloning
		 * Solution: return singleton
		 * 
		 * 
		 * */
		
		//case: 1
		
//		Singleton s1 = Singleton.getSingleton();
//		System.out.println(s1.hashCode());
//		
//		Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
//		constructor.setAccessible(true);
//		Singleton s2 = constructor.newInstance();
//		System.out.println(s2.hashCode());
		
		//case: 2
		
		Singleton singleton = Singleton.getSingleton();
		System.out.println(singleton.hashCode());
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
//		oos.writeObject(singleton);
//		
//		System.out.println("Serialization done...");
//		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
//		Singleton s2 = (Singleton)ois.readObject();
//		System.out.println(s2.hashCode());
		
		//case: 3
		
		Singleton s2 = (Singleton)singleton.clone();
		System.out.println(s2.hashCode());
	}

}


