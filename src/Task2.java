import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("값을 입력해 보세요:");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		Task2Class.result(inputValue);
		
		
		scanner.close();
	}

}
