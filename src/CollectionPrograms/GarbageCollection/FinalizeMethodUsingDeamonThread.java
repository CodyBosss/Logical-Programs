package CollectionPrograms.GarbageCollection;

public class FinalizeMethodUsingDeamonThread {

	static FinalizeMethodUsingDeamonThread s;
	public static void main(String[] args)throws InterruptedException {
		
		FinalizeMethodUsingDeamonThread t = new FinalizeMethodUsingDeamonThread();
		
		System.out.println(t.hashCode());
		t=null;
		System.gc();
		Thread.sleep(2000);
		
		System.out.println(s.hashCode());
		s=null;
		System.gc();
		Thread.sleep(4000);
		
		System.out.println("End of Main()");
	}
	
	public void finalize() {
		System.out.println("Finalize() Called");
		s=this;
	}
}
