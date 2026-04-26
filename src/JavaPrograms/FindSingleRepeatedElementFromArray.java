package JavaPrograms;

public class FindSingleRepeatedElementFromArray {

	public static void main(String[] args) {
		
		int [] a = {3,4,3,4,5,5,6};
		
		int res = 0;
		for(int i=0; i<a.length; i++) {
			res = res ^ a[i];
		}
		System.out.println(res);
	}

}
