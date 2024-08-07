package JavaPrograms;

class A{
	public A() {
		System.out.println("Constructor-A");
	}
}

class B extends A{
	public B() {
		System.out.println("Constructor-B");
	}
}

class C extends B{
	public C() {
		System.out.println("Constructor-C");
	}
}

class D{
	public D() {
		System.out.println("Constructor-D");
	}
}

public class ConstructorTest_using_subclasses {
	
	public static void main(String [] args) {
//		A a = new A();	//it will execute only Constructor A
		
//		B b = new B();	// it will execute both A abd B Constructors.
		
		C c = new C();	// it will execute A, B and C Constructors.
		
//		D d = new D();
	}

	
}
