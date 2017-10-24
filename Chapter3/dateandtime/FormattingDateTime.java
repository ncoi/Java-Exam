package dateandtime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDateTime {
	public static void main(String... args) {
//		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
//		System.out.println(date.getDayOfWeek());      // MONDAY
//		System.out.println(date.getMonth());          // JANUARY
//		System.out.println(date.getYear());           // 2020
//		System.out.println(date.getDayOfYear());      // 20
		
		LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date1, time);
		
//		System.out.println(date1.format(DateTimeFormatter.ISO_LOCAL_DATE));
//		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
//		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		// Localized Formatter
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(date1));
		System.out.println(shortDateTime.format(dateTime));
		// System.out.println(shortDateTime.format(time));    // unsupported temporal tyope exception
		
		System.out.println(date1.format(shortDateTime));
		System.out.println(dateTime.format(shortDateTime));
		
		
		// Predefined Fromats: SHORT and MEDIUM
		LocalDateTime dt2 = LocalDateTime.of(date1, time);
		
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

		System.out.println(shortF.format(dt2));    // 1/20/20 11:12 AM
		System.out.println(dt2.format(mediumF));   // Jan 20, 2020 11:12:34 AM
		
		
		// Create own format
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.print(dateTime.format(f));   // January 20, 2020, 11:12
		
	}
}
