import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		System.out.println("값을 입력하세요:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("입력한 값은:" + number);
		Task1Class.input(number);
	}
}
