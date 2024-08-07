package JavaPrograms;

public class simpleRecursion {
	
	public static void simpleRecursion(Integer currentNumber) {
		if(currentNumber > 0) {
			System.out.println(currentNumber);
			simpleRecursion(currentNumber - 1);
		}		
	}

	public static void main(String[] args) {
		simpleRecursion(10);

	}

}
