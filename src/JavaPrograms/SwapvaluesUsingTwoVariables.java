package JavaPrograms;

public class SwapvaluesUsingTwoVariables {

	public static void main(String[] args) {
		
		int a=10, b=20;
		System.out.println("Before Swapping Number is : "+a+" "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping Number is : "+a+" "+b);
	}

}
