
package CollectionPrograms.GarbageCollection;

public class CallingFinalizeMethod {

	public static void main(String[] args) {
//		String s = new String("Sudhir");
		CallingFinalizeMethod s1 = new CallingFinalizeMethod();
		s1=null;
		System.gc();
		System.out.println("End of Main");
	}
	public void finalize() {
		System.out.println("Finalize Method Called");
	}
}
