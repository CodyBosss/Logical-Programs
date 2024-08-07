package JavaPrograms;

import java.util.HashSet;

public class UsingTwoIngArrayFindCommonElements {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5};
		int [] b = {6,7,8,2,3};
		

	/*	for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i]==b[j]) {
					System.out.print(a[i]+" ");
				}
			}
		}	*/
		
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i]==b[j]) {
					hs.add(a[i]);
					break;
				}
			}
		}
		for(int no : hs) {
			System.out.print(no+" ");			
		}

	}

}
