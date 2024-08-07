package StaticKeyword;

public class ConstructorDemo {
	
	// Default Constructor
	
	int a;
	String str;
	
	public static void main(String [] args) {
	
		ConstructorDemo cd = new ConstructorDemo();
		System.out.println(cd.a+" "+cd.str);		
		
	// No-argument Constructor.
		
	/*	ConstructorDemo(){
			System.out.println("No-argument Constructor");
		}
		public static void main(String [] args) {
			ConstructorDemo cd = new ConstructorDemo();		*/
			
	// Parameterized Constructor.
			
//			ConstructorDemo(int a){
//				System.out.println("Parameterized Constructor");
//			}
//			public static void main(String [] args) {
//				ConstructorDemo cd = new ConstructorDemo(10);
	}
}
