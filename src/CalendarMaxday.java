import java.util.Scanner;

public class CalendarMaxday {
	
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	public int getMaxDayOfMonth (int month) {
		return MAX_DAYS[month-1];
	}

	public static void main(String[] args) {
		
		String PROMPT = "cal>";
		Scanner scanner = new Scanner(System.in);
		CalendarMaxday cal = new CalendarMaxday();
		
//		System.out.println("반복횟수를 입력해 주세요");
//		int repeat = scanner.nextInt();
//		
//		for(int i = 0; i < repeat; i++) {
//			System.out.print("달을 입력해주세요:");
//			System.out.print(PROMPT);
//			   int month = scanner.nextInt();
//			
//			System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getMaxDayOfMonth(month));
//		}
			
		int month = 1;
		while(true) {
			System.out.println("달을 입력해주세요:");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if(month == -1) {
				break;
			}else if(month > 12) {
				continue;
			}
			System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getMaxDayOfMonth(month));
		}
//		
		System.out.println("Bye~~");
	
		scanner.close();
	}

}
