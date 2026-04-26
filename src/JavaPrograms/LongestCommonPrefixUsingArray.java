package JavaPrograms;

public class LongestCommonPrefixUsingArray {
	
	public static void main(String [] args) {
		LongestCommonPrefixUsingArray result = new LongestCommonPrefixUsingArray();
		String  [] word1 = {"flower","flow","flight"};
		System.out.println("Longest Common Prefix : "+result.longestCommonPrefix(word1));
		String [] word2 = {"dog","racecar","car"};
		System.out.println("Longest Common Prefix : "+result.longestCommonPrefix(word2));
	}
	
	public String longestCommonPrefix(String [] strs) {
		if(strs==null || strs.length==0)return"";
		
		String prefix = strs[0];
		
		for(int i=1; i<strs.length; i++) {
			while(strs[i].indexOf(prefix)!=0) {
				prefix = prefix.substring(0,prefix.length()-1);
				if(prefix.isEmpty())return "";
			}
		}
		return prefix;
	}

}
