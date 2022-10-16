import java.util.Scanner;

public class CalenndarMaxday {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("달을 입력해주세요:");
		int month = scanner.nextInt();
		
		int[] mzx_day = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.printf("%d월은 %d일까지 있습니다. \n", month, mzx_day[month -1]);
		scanner.close();
	}

}
