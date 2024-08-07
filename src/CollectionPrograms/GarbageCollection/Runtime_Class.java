package CollectionPrograms.GarbageCollection;

import java.util.Date;

public class Runtime_Class {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		
		for(int i=0; i<10000; i++) {
			Date d = new Date();
			d=null;
		}
		
		System.out.println(r.freeMemory());
//		System.gc();
		r.gc();
		System.out.println(r.freeMemory());
	}
}
