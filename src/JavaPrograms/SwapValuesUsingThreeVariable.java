package JavaPrograms;

public class SwapValuesUsingThreeVariable {

	public static void main(String[] args) {
		
		int a = 10, b = 20, temp;
		
		System.out.println("Before Swapping Numbers : "+a+" "+b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swapping Numbersis : "+a+" "+b);

	}

}
