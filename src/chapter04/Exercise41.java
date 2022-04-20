package chapter04;

import java.util.Scanner;

public class Exercise41 {
	public static void main(String[] args) {
		/*사용자로부터 세 변의 길이를 입력받은 후, 
		 * 입력받은 변의 길이로 삼각형을 입력 받을 수 있는지 판별하는 프로그램을 만들어 보자. 
		 * 삼각형을 판별하는 방법은 가장 긴 변의 길이가 다른 두 변의 길이의 합보다 
		 * 작으면 삼각형을 만들 수 있다.
		 */
		Scanner scanner = new Scanner(System.in);
		
		int length1;
		int length2;
		int length3;
		
		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요: ");
		length1 = scanner.nextInt();
		System.out.print("삼각형의 두번째 변의 길이를 입력하세요: ");
		length2 = scanner.nextInt();
		System.out.print("삼각형의 세번째 변의 길이를 입력하세요: ");
		length3 = scanner.nextInt();
		
		
		
		
		if (length1 < (length2+length3) && length2 < (length1+length3) && length3 < (length1+length2) ) {
			System.out.println("삼각형을 만들 수 있습니다.");
		}
		else {
			System.out.println("삼각형을 만들 수 없습니다.");
		}
	}
}
