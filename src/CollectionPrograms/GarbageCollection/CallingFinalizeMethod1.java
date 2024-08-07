package CollectionPrograms.GarbageCollection;

public class CallingFinalizeMethod1 {

	public static void main(String[] args) {
		CallingFinalizeMethod1 t = new CallingFinalizeMethod1();
		t.finalize();
		t.finalize();
		t=null;
		System.gc();
		System.out.println("End of main()");
	}	
	public void finalize() {
		System.out.println("Finalize() Called");
	}
}
