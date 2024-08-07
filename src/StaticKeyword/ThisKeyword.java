 package StaticKeyword;

//class ThisKeyword{
	
	//If instance variable and local variable will be same so, that time we must use "this" keyword.
	
//	int i;
//	void setvalue(int i) {
//		this.i=i;
//		}	
//	/*int i;
//	void setValue(int a) {
//		i=a;
//	}	*/	
//	void show() {
//		System.out.println(i);
//	}
//}
//class ThisKeyword{
//	
//	public static void main(String [] args) {
//		
//		TestDS t = new TestDS();
//		t.setvalue(10);
//		t.show();	
		
		// this keyword can be used to invoked current class method(implicitly)
		
//	void Display() {
//		System.out.println("Hello");	
//	}
//	void show() {
//		this.Display(); // Display(); //if we don't use this keyword, compiler automatically will add this keyword while invoking the method.
//	}
//	public static void main(String [] args) {
//		ThisKeyword tk = new ThisKeyword();
//		tk.show();
//	}
	
	
		// this keyword can be used to pass as an argument in the method call.
	
//	void m1(ThisKeyword tk) {
//		System.out.println("Hello");
//	}
//	void m2() {
//		m1(this);
//	}
//	public static void main(String [] args) {
//		ThisKeyword tk = new ThisKeyword();
//		tk.m2();
	
	
		// this keyword can be used to pass as an argument in the constructor call.
	
	
//	class TestDS{
//		
//		TestDS(ThisKeyword tk){
//		System.out.println("test class constructor");
//		}
//	}
//	class ThisKeyword{
//		void m1() {
//			TestDS t = new TestDS(this);
//		}
//		public static void main(String [] args) {
//			ThisKeyword t = new ThisKeyword();
//			t.m1();

		
		// this keyword can be used to return the current class instance from the method.

	class ThisKeyword{
		
		ThisKeyword m1() {
			System.out.println("Current class instance");
			return this;	
		}
		public static void main(String [] args) {
			
			ThisKeyword kt = new ThisKeyword();
			kt.m1();		
		}
	}
