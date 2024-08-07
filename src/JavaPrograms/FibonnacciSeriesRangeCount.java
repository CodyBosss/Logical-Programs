package JavaPrograms;

public class FibonnacciSeriesRangeCount {

	/*
	 * public static void main(String [] args) { 
	 * int low = 10, high =100; 
	 * int a=0, b=1, c=1; 
	 * int result = 0; 
	 * while(a<=high) { 
	 * if(a>=low) 
	 * result++; 
	 * a=b; b=c;
	 * c=a+b; 
	 * } 
	 * System.out.println(result); 
	 * }
	 */

	// By using return statement

	public static int m1(int low, int high) {
		int a = 0, b = 1, c = 1;
		int result = 0;

		while (a <= high) {
			if (a >= low)
				result++;
			a = b;
			b = c;
			c = a + b;
		}
		return result;
	}

	public static void main(String[] args) {
		int low = 10, high = 100;
		System.out.println("Range is : " + m1(low, high));

	}
}