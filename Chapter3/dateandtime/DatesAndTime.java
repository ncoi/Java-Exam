package dateandtime;

import java.time.*;

public class DatesAndTime {

	public static void main(String[] args) {
//		System.out.println(LocalDate.now()); // 2017-10-23
//		System.out.println(LocalTime.now()); // 11:15:07.359
//		System.out.println(LocalDateTime.now()); // 2017-10-23T11:15:07.360
		
		// Date with no time
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20); // 2015-01-20
		LocalDate date2 = LocalDate.of(2015,  1, 20); // 2015-01-20
//		System.out.println(date2);
		
		// Time
		LocalTime time1 = LocalTime.of(6,  15); // hour and minute
		LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
		LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds;
//		System.out.println(time3);
		
		// Date and Time
		LocalDateTime dt1 = LocalDateTime.of(date1, time1);
		LocalDateTime dt2 = LocalDateTime.of(2017, Month.OCTOBER, 23, 11, 29, 30);
//		System.out.println(dt2);
		
		// Manipulating dates
		date1 = date1.plusDays(2);
		System.out.println(date1);
		date1 = date1.plusWeeks(2);
		System.out.println(date1);
		date1 = date1.plusMonths(2);
		System.out.println(date1);
		date1 = date1.plusYears(2);
		System.out.println(date1);
		
		dt1 = dt1.minusDays(1).minusHours(10).minusSeconds(30);
		System.out.println(dt1);
	}

}
