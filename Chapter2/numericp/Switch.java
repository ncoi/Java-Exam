package numericp;

public class Switch {
	public static void main(String[] args) {
		int dayOfWeek = 0;
		switch(dayOfWeek) {
		case 0:
			System.out.println("Sunday");
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.print("Weekday");
		}
	}
}
