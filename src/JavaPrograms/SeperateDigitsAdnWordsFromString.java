package JavaPrograms;

public class SeperateDigitsAdnWordsFromString {

	public static void main(String[] args) {
		
		String str = "lndfnr54n5jg5njnj3543n5";
		
		System.out.println(str.replaceAll("[^0-9]", ""));
		System.out.println(str.replaceAll("[^a-z]", ""));

	}

}
