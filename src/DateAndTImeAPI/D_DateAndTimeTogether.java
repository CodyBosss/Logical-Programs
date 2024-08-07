package DateAndTImeAPI;

import java.time.LocalDateTime;

public class D_DateAndTimeTogether {
	
	public static void main(String [] args) {
	LocalDateTime dt = LocalDateTime.now();
	
	int dd = dt.getDayOfMonth();
	int mm = dt.getMonthValue();
	int yyyy = dt.getYear();
	System.out.printf("Date : %d-%d-%d", dd,mm,yyyy);
	int h = dt.getHour();
	int m = dt.getMinute();
	int s = dt.getSecond();
	int n = dt.getNano();
	System.out.printf("\nTime : %d:%d:%d:%d", h,m,s,n);
	}
}
