package StaticKeyword;	

class StaticMethod{
	int i = 10;
	static void m1() {
//		m2();
//		System.out.println(this.i);
//		System.out.println(super.i);
}
	void m2() {
		System.out.println("2");
		//System.out.println(super.i);
	}
		
	public static void main(String[] args) {
		
		m1();
		
	}
}
