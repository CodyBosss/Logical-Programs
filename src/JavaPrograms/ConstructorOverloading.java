package JavaPrograms;

public class ConstructorOverloading {
	
	ConstructorOverloading(){
		System.out.println("1");
	}
	
	ConstructorOverloading(int a){
		this("s",10);
		System.out.println("2");
	}
	
	ConstructorOverloading(String str, int b){
		this();
		System.out.println("3");		
	}

	public static void main(String[] args) {
		
		ConstructorOverloading co = new ConstructorOverloading(10);

	}

}
