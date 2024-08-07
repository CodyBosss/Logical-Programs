package Variables;

public class InstanceVariable {
	
	int x = 10;

	public static void main(String[] args) {
		
//		System.out.println(x);		CE: non -static variable x can't be referenced from static context 
		
		InstanceVariable Iv = new InstanceVariable();
		System.out.println(Iv.x);
	 Iv.m1();
	}
	public void m1() {
		System.out.println("m1 : "+x);
	}

}
