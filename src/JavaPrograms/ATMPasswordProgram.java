package JavaPrograms;

import java.util.Scanner;

public class ATMPasswordProgram {

	public static void main(String[] args) {
		
		int pass = 1234;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Pin");
		int entry = sc.nextInt();
		
		count++;
		while(pass!=entry && count<3) {
			
			System.out.println("Password is wrong plz try again...");
			System.out.println("Enter The Pin : ");
			entry = sc.nextInt();
			count++;
		}
		
		if(pass==entry)
		System.out.println("Welcome to BOI...");
		else if(count>=3)
			System.out.println("Card is blocked");
	}

}
