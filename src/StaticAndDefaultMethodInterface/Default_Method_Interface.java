package StaticAndDefaultMethodInterface;

interface Test{
	public void m1();	
	default void m2() {
		System.out.println("Default Method");
	}
}
public class Default_Method_Interface implements Test{	
	public void m1() {
		System.out.println("abstract Method");
	}
	public static void main(String[] args) {		
		Default_Method_Interface dm = new Default_Method_Interface();		
		dm.m1();
		dm.m2();
	}
}
