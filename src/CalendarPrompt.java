import java.util.Scanner;

public class CalendarPrompt {
	
		private final static String PROMPT = "cal> ";
	
		public void runPrompt() {
			Scanner scanner = new Scanner(System.in);
			Calendar cal =new Calendar();
			
			int month = -1;
			int year = 2022;
			
			while(true) {
				System.out.println("년도를 입려하세요");
				System.out.print("Year> ");
				year = scanner.nextInt();
				System.out.println("달을 입력하세요:");
				System.out.print("Month> ");
				month = scanner.nextInt();
				if(month == -1) {
					break;
				}else if(month > 12) {
					continue;
				}
				
//				System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getMaxDaysOfMonth(month));
				
				cal.printCaldar(year, month);
			}
			
			System.out.println("bye~");
		}
		

		public static void main(String[] args) {
			//셀 실행
			CalendarPrompt p = new CalendarPrompt();
			p.runPrompt();
		}
	}
