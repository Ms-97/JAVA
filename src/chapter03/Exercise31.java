package chapter03;

import java.util.Scanner;

public class Exercise31 {

	public static void main(String[] args) {
/*두 정수를 입력받아 큰 수를 작은 수로 나눈 몫과 나머지를 출력하는 프로그램을 만들어 보자. 
 * 임의의 두 정수는 a, b에 대하여 ((a + b) + |a - b|) / 2는 큰 수, ((a + b) - |a - b|) / 2는 작은 수이다. 
 * 절대값을 반환하는 메소드는 Math.abs(숫자)이다. 만약 |-3|을 알아보고 싶으면 Math.abs(-3)이라고 쓰면 3이 반환된다. 
 * 이것을 이용하여 만들어 보자. */
		Scanner scanner = new Scanner(System.in);
		
		int a;
		int b;
		int quotient;
		int remainder;
		
		System.out.print("첫 번째 숫자를 입력하세요: ");
		a = scanner.nextInt();
		System.out.print("두 번째 숫자를 입력하세요: ");
		b = scanner.nextInt();
		
		
		quotient = (((a + b) + Math.abs(a - b)) / 2) / (((a + b) - Math.abs(a - b)) / 2);
		remainder = (((a + b) + Math.abs(a - b)) / 2) % (((a + b) - Math.abs(a - b)) / 2);
		
		
		
		
		System.out.println("큰 수를 작은 수로 나눈 몫은 "+quotient+"이고, 나머지는 "+remainder+"이다.");
	}

}
