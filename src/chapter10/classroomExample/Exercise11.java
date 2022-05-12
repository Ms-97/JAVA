package chapter10.classroomExample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1;
		int num2;
		int result;

		while (true) {

			try {
				System.out.print("어떤 수를 나누시겠습니까?>>");
				num1 = Integer.parseInt(scanner.nextLine());
				System.out.print("어떤 수로 나누시겠습니까?>>");
				num2 = Integer.parseInt(scanner.nextLine());

				result = num1 / num2;

				System.out.printf("%d / %d = %d", num1, num2, result);
				scanner.close();
				break;
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				

			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				
			}
		}
	}
}
