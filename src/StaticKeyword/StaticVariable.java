
package StaticKeyword;

public class StaticVariable {
	
	int Id;
	String Name;
	static String Company = "JavaLover";
//	static int count = 0;
	
	StaticVariable(int id, String name){
		this.Id=id;
		this.Name=name;
	}
	
	void m1() {
//		count++;
//		System.out.println(count);
		System.out.println(Id+" "+Name+" "+Company);
	}

	public static void main(String[] args) {
		
		StaticVariable sb = new StaticVariable(100, "Sudhir");
		StaticVariable sb1 = new StaticVariable(101, "Ronny");
		StaticVariable sb2= new StaticVariable(102, "Chinti");
		
		sb.m1();
		sb1.m1();
		sb2.m1();

	}

}
