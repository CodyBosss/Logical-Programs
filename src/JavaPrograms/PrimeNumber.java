package JavaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int no = 17;
		int temp = 0;
		
		for(int i=2; i<no-1; i++) {
			if(no%i==0) {
				temp = temp + 1;
			}
		}
		if(temp==0) {
			System.out.println("Given Prime Number Is : "+no);
			System.out.println("Expected Prime Number Is : "+(no-6));
		}
		else {
			System.out.println("Not Prime");
		}
	}

}
