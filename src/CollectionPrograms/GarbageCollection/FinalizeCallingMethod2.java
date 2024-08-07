package CollectionPrograms.GarbageCollection;

public class FinalizeCallingMethod2 {

	public static void main(String[] args){
		FinalizeCallingMethod2 t = new FinalizeCallingMethod2();
//		t.finalize();	//------>(1)  // This line will throw exception
		t=null;
		System.gc();
		System.out.println("End of Main()");
	}
	
	public void finalize(){
		System.out.println("finalize() called");	
		System.out.println(10/0);
	}
}
