package StaticKeyword;

	//use 1 : "super" keyword refers to the immediate parent class instance variable. 

//class TestDS{
//	int a = 10;
//}
//class SuperKeyword extends TestDS{	
//	int a = 20;	
//	void m1(int a) {		
//		System.out.println("Parameterized variable : "+a);
//		System.out.println("Current Variable : "+this.a);
//		System.out.println("Super Variable : "+super.a);
//	}
//	public static void main(String[] args) {		
//		SuperKeyword sk = new SuperKeyword();
//		sk.m1(30);		
//	}
//}



	//use 2 : "super" keyword can be used to invoke immediate parent class method.

//class TestDS{
//	void m1() {
//		System.out.println("I am in parent class");
//	}
//}
//class SuperKeyword extends TestDS{
//	void m1() {
//		System.out.println("I am in current class");
//	}
//	void show() {
//		m1();
//		super.m1();
//	}
//	public static void main(String [] args) {
//		SuperKeyword sk = new SuperKeyword();
//		sk.show();
//	}
//}

	//use 3 : "super()" can be used to invoke immediate parent class constructor.

class Test{
	Test(){
		System.out.println("I am in parent class");
	}
}
class SuperKeyword extends Test{
	SuperKeyword(){
		
		super();		// if we didn't take super() compiler will put it by default
		System.out.println("I am in current class");
	}
	public static void main(String [] args) {
		SuperKeyword sk = new SuperKeyword();
	}
}