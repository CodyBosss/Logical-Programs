package EnumPrograms;

// TO listout all values present in enum we should go for values() method.

/*enum Colors{
	Red, Blue, Pink, Green
}

public class EnumUsingValuesMethod {
	
	public static void main(String [] args) {
		Colors[] c = Colors.values();
		for(Colors c1 : c) {
			System.out.println(c1);
		}
	}
}*/

// To find ordinals values of enum we can use ordinal() method.

enum Colors{
	Red, Blue, Pink, Green
}

public class EnumUsingValuesMethod {
	
	public static void main(String [] args) {
		Colors[] c = Colors.values();
		for(Colors c1 : c) {
			System.out.println(c1+"...."+c1.ordinal());
		}
	}
}
