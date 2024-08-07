package JavaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElementUsingHashTable {

	public static void main(String[] args) {
			int [] a = {1,2,3,4,2,5,3,3,2};
			
			Map<Integer, Integer> hm = new HashMap<>();
			for(int no:a) {
				Integer count = hm.get(no);
				if(count==null) {
					hm.put(no,1);
				}
				else {
					count = count + 1;
					hm.put(no, count);
				}
			}
			System.out.println("Duplicate Elements are : ");
			Set<Map.Entry<Integer, Integer>> es = hm.entrySet();
			for(Map.Entry<Integer, Integer>me : es) {
				if(me.getValue()>1)
				{
					System.out.print(me.getKey()+" ");
				}
			}
		}
	}


