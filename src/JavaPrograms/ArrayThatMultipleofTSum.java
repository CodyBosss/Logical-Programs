package JavaPrograms;

public class ArrayThatMultipleofTSum {

public static void main(String [] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8,9};
		int n = arr.length;
		int T = 3;
		int sum = 0;
		int sum1 = 0;
		
		for(int i=0; i<n; i++) {
			if(arr[i]%T==0) {
				sum = sum+arr[i];
				
			}
			sum1+=arr[i];
		}
		System.out.println("Sum of all integers are : "+sum1);
		System.out.println("Sum of all multiples to T is : "+sum);
	
		
	}

}
