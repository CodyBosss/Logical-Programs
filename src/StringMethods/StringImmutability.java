package StringMethods;

final class StringImmutability {
	
	final int no;
	
	StringImmutability(int no){
		this.no = no;
	}
	public int getno() {
		return no;
	}	
	public static void main(String[] args) {
		StringImmutability s = new StringImmutability(10);
		
		System.out.println(s.getno());
	}
}
