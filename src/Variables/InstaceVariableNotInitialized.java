package Variables;

import java.util.Arrays;

public class InstaceVariableNotInitialized {
	
	int x;
	double d;
	boolean b;
	String s;
	char c;
	
	int [] a;
	double [] a1;
	boolean [] a2;
	String [] a3;
	char [] a4;

	public static void main(String[] args) {

		InstaceVariableNotInitialized t = new InstaceVariableNotInitialized();
		
		System.out.println("Primitive Values");		
		System.out.println(t.x);
		System.out.println(t.d);
		System.out.println(t.b);
		System.out.println(t.s);
		System.out.println(t.c);
		
		// if we took array variable as a empty or not initialize the will be null for all
		
		System.out.println("Array Variable");
		System.out.println(Arrays.toString(t.a));
		System.out.println(Arrays.toString(t.a1));
		System.out.println(Arrays.toString(t.a2));
		System.out.println(Arrays.toString(t.a3));
		System.out.println(Arrays.toString(t.a4));
		
	}

}
