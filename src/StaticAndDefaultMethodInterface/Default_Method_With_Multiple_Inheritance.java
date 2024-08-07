package StaticAndDefaultMethodInterface;

interface A{
	default void m1() {
		System.out.println("Default Method Of A class");
	}
}

interface B{
	default void m1() {
		System.out.println("Default Method of B class");
	}
}

interface C{
	default void m1() {
		System.out.println("Default Method of c class");
	}
}

public class Default_Method_With_Multiple_Inheritance implements A, B, C {
	
	public void m1() {
		System.out.println("Method Implementation");
		A.super.m1();
		B.super.m1();
		C.super.m1();
	}

	public static void main(String[] args) {
		
		Default_Method_With_Multiple_Inheritance dm = new Default_Method_With_Multiple_Inheritance();
		
		dm.m1();
		
	}

}
