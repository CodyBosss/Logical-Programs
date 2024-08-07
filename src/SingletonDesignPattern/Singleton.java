package SingletonDesignPattern;

import java.io.Serializable;

public class Singleton implements Serializable,Cloneable{
	
	private static Singleton singleton;
	
	//constructor
	private Singleton() {
		if(singleton!=null) {
			throw new RuntimeException("You are trying to break singleton design pattern");
		}
		
	}
	
	// Lazy way of creating singleton object
	public static Singleton getSingleton() {
		//this method will create object of this class
//Case: 1
		
//		if(singleton==null) {
//			singleton = new Singleton();
//		}
//		return singleton;
		
//Case: 2 it is for Thread management, If one thread is already working on the ojbect so it will
//	prevent another can't work on same object
				
		if(singleton==null) {
			synchronized (Singleton.class) {
				if(singleton==null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;		
	}
	
	
	public Object readResolve() {
		return singleton;
	}
	
	@Override
	public Object clone()throws CloneNotSupportedException {
//		return super.clone();
		return singleton;
	}

}

