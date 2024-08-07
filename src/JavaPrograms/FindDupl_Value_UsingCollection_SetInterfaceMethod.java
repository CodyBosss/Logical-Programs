package JavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindDupl_Value_UsingCollection_SetInterfaceMethod {

public static void main(String[] args) {
		
		int [] a = {1,2,3,4,2,5,3};
		System.out.println("Duplicate Elements are : ");
		Set<Integer> s = new HashSet<>();
				
		for(int no:a) {
			if(s.add(no)==false) {
				System.out.print(no+" ");
			}
		}

	}

}
