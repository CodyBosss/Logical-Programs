package JavaPrograms;

public class SumofArrayElements {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4};
		int n = a.length;
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum = sum + a[i];
			
		}
		System.out.println(sum);

	}

}
