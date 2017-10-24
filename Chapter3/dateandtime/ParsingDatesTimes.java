package dateandtime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParsingDatesTimes {

	public static void main(String[] args) {
		// Converting from a String to a date / time
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date = LocalDate.parse("01 02 2015", f);   // takes a formatter as well
		LocalTime time = LocalTime.parse("11:22");
		System.out.println(date);
		System.out.println(time);

	}

}
