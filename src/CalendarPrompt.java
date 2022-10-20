import java.util.Scanner;

public class CalendarPrompt {
	
//		private final static String PROMPT = "cal> ";
	
		public int parseDay(String week) {
			if(week.equals("su")) {
				return 0;
			}else if(week.equals("mo")) {
				return 1;
			}else if(week.equals("tu")) {
				return 2;
			}else if(week.equals("we")) {
				return 3;
			}else if(week.equals("th")) {
				return 4;
			}else if(week.equals("fr")) {
				return 5;
			}else if(week.equals("sa")) {
				return 6;
			}else {
				return 0;
			}
		}
	
		public void runPrompt() {
			Scanner scanner = new Scanner(System.in);
			Calendar cal =new Calendar();
			
			int month = -1;
			int year = 2022;
			
			while(true) {
				System.out.println("년도를 입려하세요.(exit: -1)");
				System.out.print("Year> ");
				year = scanner.nextInt();
				if(year == -1) {
					break;
				}
				System.out.println("달을 입력하세요:");
				System.out.print("Month> ");
				month = scanner.nextInt();
				if(month > 12 || month < 1) {
					System.out.println("잘 못된 입력값입니다.");
					continue;
				}
//				System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getMaxDaysOfMonth(month));
				
				cal.printCaldar(year, month);
			}
			
			System.out.println("bye~");
			scanner.close();
		}
		

		public static void main(String[] args) {
			//셀 실행
			CalendarPrompt p = new CalendarPrompt();
			p.runPrompt();
			
			
		}
	}
