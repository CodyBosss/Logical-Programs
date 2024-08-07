package CollectionPrograms.GarbageCollection;

public class FinalizeExample {
	static int count = 0;
	public static void main(String[] args) {
		for(int i=0; i<1000000; i++) {				// if we increase i value then it will show effect
			FinalizeExample f = new FinalizeExample();
			f = null;
		}
	}
	public void finalize() {
		count++;
		System.out.println("finalize() called"+count);
	}
}
