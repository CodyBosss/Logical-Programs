package CollectionPrograms.GarbageCollection;

import java.util.Date;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		Runtime r = Runtime.getRuntime();
		
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		
		for(int i=0; i<=10000; i++) {
			Date t = new Date();
			t = null;
		}
		
		System.out.println(r.totalMemory());
		r.gc();
		System.out.println(r.freeMemory());

	}

}
