package StaticKeyword;

public class ConstructorChaining {
	
	ConstructorChaining(){
		System.out.println("1");
	}
	
	ConstructorChaining(int a){
		this();
		System.out.println("2");
	}
	
	ConstructorChaining(int b, String s){
		this(10);
		System.out.println("3");
	}
	
	public static void main(String[] args) {
		
		ConstructorChaining obj = new ConstructorChaining(10, "Sudhir");

	}

}
