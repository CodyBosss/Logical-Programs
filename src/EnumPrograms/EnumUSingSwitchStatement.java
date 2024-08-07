package EnumPrograms;

import java.util.Scanner;

enum Days{
	Sun, Mon, Tue, Wed, Thus, Fri, Sat
}

class EnumUSingSwitchStatement {
	
	public static void main(String [] args) {
		
			Days d = Days.Mon;	
			
			switch(d){
				
				case Mon:
					System.out.println("Monday");
					break;
				
				case Sun:
					System.out.println("Sunday");
					break;
				
				case Tue:
					System.out.println("Tuesday");
					break;
					
				case Wed:
					System.out.println("Wednesday");
					break;
					
				case Thus:
					System.out.println("Thusday");
					break;
					
				case Fri:
					System.out.println("Friday");
					break;
					
				case Sat:
					System.out.println("Saturday");
					break;
					
				default:
					System.out.println("Out of Storage");
			
			}
			
	}
	}
	

