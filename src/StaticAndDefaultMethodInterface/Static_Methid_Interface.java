package StaticAndDefaultMethodInterface;

interface Test1{	
	public void m1();	
	public static void m2() {
		System.out.println("Static Method");
	}
}
public class Static_Methid_Interface implements Test1{	
	public void m1() {
		System.out.println("Abstract Method");
	}
	public static void main(String[] args) {
		Static_Methid_Interface sm = new Static_Methid_Interface();		
		sm.m1();
		Test1.m2();
	}
}
