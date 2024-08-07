package DateAndTImeAPI;

import java.time.LocalDate;
import java.time.Period;

public class G_Period_Between_BirthDate_And_TodayDate {

	public static void main(String[] args) {
		LocalDate birthday = LocalDate.of(1993, 10, 13);
		LocalDate today = LocalDate.now();

		Period p = Period.between(birthday, today);
		System.out.printf("your age is %d years %d months and %d days", 
				p.getYears(), p.getMonths(), p.getDays());
		
		LocalDate deathDay = LocalDate.of(1993+60, 10, 13);
		Period p1 = Period.between(today, deathDay);
		int s = p1.getYears()*365+p1.getMonths()*30+p1.getDays();
		System.out.printf("\nYou will live on earth only %d Days...Plzz do something more importent",s);
	}

}
