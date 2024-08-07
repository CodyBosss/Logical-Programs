package JavaPrograms;

class MOverriding {
	
	void m1() {
		
		System.out.println("1");
	}
}

class MethodOverridingProgram  extends MOverriding {
	
	void m1() {
		System.out.println("2");
	}
	
	void print() {
		System.out.println("3");
	}

	public static void main(String[] args) {
		
		System.out.println("Hello Main");
		
		MethodOverridingProgram mo = new MethodOverridingProgram();
		mo.m1();
		mo.print();
		
		MOverriding m = new MethodOverridingProgram();		
		m.m1();
//		m.print(); // method is undefined for MOverriding class
	}

}
