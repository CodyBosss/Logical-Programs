package EnumPrograms;

// Without Inner Class

/*enum  Colours{
	Blue, Red, Green;
	
	public void Info() {
		System.out.println("Universal Coulors");
	}
}

class EnumUsingInnerClassAndWithoutInnerClass {
	
	public static void main(String [] args) {		

	Colours [] c = Colours.values();
	for(Colours c1 : c) {
		c1.Info();		
	}
}
	
}
*/

// With Inner Class

enum Colours{
	Blue, Red{
		public void Info() {
			System.out.println("Dangerous Method");
		}
	}, Green;
	public void Info() {
		System.out.println("Universal Method");
	}
}

class EnumUsingInnerClassAndWithoutInnerClass{
	public static void main(String [] args) {
	Colours[] c = Colours.values();
	for(Colours c1 : c) {
		c1.Info();
	}
}}