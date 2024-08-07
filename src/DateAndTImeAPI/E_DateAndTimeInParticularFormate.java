package DateAndTImeAPI;

import java.time.LocalDateTime;

public class E_DateAndTimeInParticularFormate {
	
	public static void main(String [] args) {
		LocalDateTime dt = LocalDateTime.of(1993,10,13, 07,00);
		System.out.println(dt);
		
		System.out.println("After six months : "+dt.plusMonths(6));		//we can find future date
		System.out.println("Before six months : "+dt.minusMonths(6));	//we can find past date
	}
}
