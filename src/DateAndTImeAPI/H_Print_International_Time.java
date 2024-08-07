package DateAndTImeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class H_Print_International_Time {

	public static void main(String[] args) {
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt = ZonedDateTime.now(la);
		System.out.println(zt);
	}

}
