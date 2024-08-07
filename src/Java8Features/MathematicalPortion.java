package Java8Features;

@FunctionalInterface
interface Demo{
	public int show(int a, int b);
}

@FunctionalInterface
interface Name{
	public int name(String str);
}

public class MathematicalPortion {

	public static void main(String[] args) {
		
		Demo d = (a,b) -> (a+b);
		System.out.println("Addition of two numbers is : "+d.show(10, 20));
		
		Demo c = (a, b) -> (a-b);
		System.out.println("Substractio of two numbers is : "+c.show(20, 10));
		
		Demo f = (a, b) -> (a * b);
		System.out.println("Multiplication os two number is : "+f.show(3, 4));
		
		Demo g = (a, b) -> (a/b);
		System.out.println("Division of two numbers is : "+g.show(10, 5));
		
		Name n = str -> str.length();
		System.out.println("The length of words is : "+n.name("My name is Sudhir Khandare"));
	}

}
