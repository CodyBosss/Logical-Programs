package JavaPrograms;

public class FrequencyOfDuplicatesElements {

	public static void main(String[] args) {
		
		int [] no = new int[] {1,2,3,4,5,1,2,3,3};
		int [] n = new int[no.length];
		
		int visit = 1;
		
		for(int i=0; i<no.length; i++) {
			int count = 1;
			for(int j=i+1; j<no.length; j++) {
				if(no[i]==no[j]) {
					count++;
					n[j]=visit;
				}
			}
			if(n[i]!=visit) {
				n[i]=count;
			}
		}
		for(int i=0; i<n.length; i++) {
			if(n[i]!=visit) {
				System.out.println(no[i]+"...."+n[i]);
			}
		}

	}

}


//String [] arr = new String[] {"Mango", "Orange", "Mango", "Apple"};
//int [] n = new int [arr.length]; 
//
//int temp = -1;
////int temp = 1 if I took only 1 so it will print only repeated elements frequency.
//
//for(int i=0; i<arr.length; i++) {
//	int count = 1;
//	for(int j=i+1; j<arr.length; j++) {
//		if(arr[i]==arr[j]) {
//			count++;
//			n[j]=temp;
//			
//		}
//	}
//	if(n[i]!=temp) {
//		n[i]=count;
//	}
//}
//for(int i=0; i<arr.length; i++) {
//	if(n[i]!=temp) {
//		System.out.println(arr[i]+"........."+n[i]);
//	}
//}
