package EnumPrograms;

/*
 * enum beer{ KF, TB, IB }
 * 
 * public class BeerExample {
 * 
 * public static void main(String [] args) { 
 * beer b = beer.KF;
 * System.out.println(b); } }
 */


/*public class BeerExample {	

	public static void main(String [] args) {
		
		enum beer{
			KF, TB, IB
		}
		
		beer b = beer.KF;
		System.out.println(b);
	}
}*/

// we can't define enum inside method compiler will throw error.
/*
 * public class BeerExample {
 * 
 * void m1() { enum beer{ KF, TB, IB } }
 * 
 * public static void main(String [] args) { beer b = beer.KF;
 * System.out.println(b); }
 * 
 * }
 */


public class BeerExample {
	
	static void m1() {
		enum demo{
			sk,bk,rk
		}
		demo d = demo.bk;
		System.out.println(d);
	}
	public static void main(String [] args) {
		BeerExample b = new BeerExample();
		b.m1();
	}
}