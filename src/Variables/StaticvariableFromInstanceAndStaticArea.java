package Variables;

public class StaticvariableFromInstanceAndStaticArea {

	static int x = 10;
	
	public static void main(String[] args) {
		
		System.out.println("Main : "+x);
		StaticvariableFromInstanceAndStaticArea s = new StaticvariableFromInstanceAndStaticArea();
		s.m1();
	}
	public void  m1() {
		System.out.println("m1 method : "+x);
	}

}
