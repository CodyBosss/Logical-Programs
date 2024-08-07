package JavaPrograms;

public class Missing_No_Arrays {

	public static void main(String[] args) {
		
		int [] nums = {0,1};
	
		int n = nums.length + 1; // Size of the complete sequence
        int totalSum = n * (n + 1) / 2; // Sum of the complete sequence (0 to n)
        
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        System.out.println(totalSum - sum); // The missing number
		
//		int xor = 0;
//		for(int i=0; i<a.length; i++) {
//			xor = xor ^ a[i];
//		}
//		int xor1 = 1;
//		for(int i=2; i<=(a.length+1); i++) {
//			xor1 = xor1 ^ i;
//		}
//		System.out.println(xor^xor1);		
	}

}
