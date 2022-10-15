import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		//입력: 키보드로 두 수의 입력을 받는다.
		System.out.println("두 값을 입력하세요:");
		int a,b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		s1 = scanner.next();
		s2 = scanner.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		//출력: 화면에 두 수의 합을 출력한다.
		System.out.println("입력한 값: " + a + "," + b );
		System.out.printf("%d + %d  = %d",a,b, a + b);
		scanner.close();
	}
}
