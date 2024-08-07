package EnumPrograms;

enum Name{
	KO(70), KF(95), RS(100), RM;
	int price;
	Name(int price){
		this.price = price;
	}
	Name(){
		this.price = 66;
	}
	public int getName() {
		return price;
	}
}

public class InsideEnumDeclarations {
	
	public static void main(String [] args) {

	Name[] n = Name.values();
	for(Name n1 : n) {
		System.out.println(n1+"...."+n1.getName());
	}
}
}