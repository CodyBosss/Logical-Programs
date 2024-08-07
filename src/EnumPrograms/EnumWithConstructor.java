package EnumPrograms;


enum Beer{
	KF, TB, KO, KR;
	
	Beer() {
		System.out.println("Constructor");
	}
}

public class EnumWithConstructor {
	
	public static void main(String [] args) {
	
	Beer b = Beer.KF;
	
	System.out.println("Hello");
	
	}
}
