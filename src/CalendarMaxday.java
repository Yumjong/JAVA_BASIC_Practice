import java.util.Scanner;

public class CalendarMaxday {
	
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	public int getMaxDayOfMonth (int month) {
		return MAX_DAYS[month-1];
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		CalendarMaxday cal = new CalendarMaxday();
		System.out.print("달을 입력해주세요:");
		int month = scanner.nextInt();
		
		System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getMaxDayOfMonth(month));
		scanner.close();
	}

}
