package JavaPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindSecondLowestNum_Array {
	public static void main(String [] args) {
		int num [] = {5,2,8,11,1,1,};
		System.out.println(findSecondLowest(num));
	}
	
	public static int findSecondLowest(int num[]) {
		int result = Arrays.stream(num).distinct().skip(1).findFirst().orElseThrow(() -> new IllegalStateException("There is no any second element"));
		return result;
	}
	
//	public static int findSecondLowest(int num[]) {
//		Set<Integer> hs = new HashSet<>();
//		for(int i=0; i<num.length; i++) {
//			hs.add(num[i]);
//		}
//		for(int i=0; i<hs.size(); i++) {
//			if(i==1)
//				return num[i];
//		}
//		return 0;
//	}
	
//	public static int findSecondLowest(int num[]) {
//		
//		Arrays.sort(num); //1,1,3,5,8,11
//		int i=0, j=1;
//		if(num[i]==num[j]) {
//			j++;
//		}
//		if(num[i]<num[j] && i==) {
//			return num[j];
//		}
//		return 0;
//	}
	
}
