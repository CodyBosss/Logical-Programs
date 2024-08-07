 package JavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindUniqueElementsFromDuplicateElementsUsingArray {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5,1,2,3};
		
		System.out.println("Duplicates Values Are : ");
		Set<Integer> hs = new HashSet<>();
		for(int no:a) {
			if(hs.add(no)==false) {
				System.out.print(no+" ");
			}
		}
		
//		1st Method to find Unique Elements
		
		System.out.println();
		System.out.println("Unique Values Are : ");
		for(int i=0; i<a.length; i++) {
			boolean temp = false;
			for(int j=0; j<i; j++) {
				if(a[i]==a[j]) {
					temp=true;
					break;
				}
			}
			if(!temp) {
			System.out.println(a[i]+" ");
			}
		}
		
//		2nd Method to find Unique Elements
		System.out.println("2nd Methods Unique values are : ");
		Set<Integer> hs1 = new HashSet<>();
		for(int num : a) {
			if(hs1.add(num)) {
				System.out.println(num);
			}
		}

	}

}
