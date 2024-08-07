package StaticKeyword;

public class StaticKeywordExample {
	
	static int a = 10;
	int b = 20;
	
	static void m1() {
		a=30;
	}
	public static void main(String[] args) {
		
		StaticKeywordExample sk = new StaticKeywordExample();
		sk.a = 111;
		sk.b = 222;
		
		StaticKeywordExample sk1 = new StaticKeywordExample();
		System.out.println(sk1.a+"...."+sk1.b);
		
	}

}
