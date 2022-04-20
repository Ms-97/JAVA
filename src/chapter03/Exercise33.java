package chapter03;

import java.util.Scanner;

public class Exercise33 {

	public static void main(String[] args) {
/*입력 연도가 윤년인지 아닌지 확인하는 프로그램을 작성해보자. 
 * 윤년의 조건은 다음과 같다고 가정한다. */
		
		Scanner scanner = new Scanner(System.in);
		
		int year;	
		String leap;
		
		System.out.print("윤년인지를 확일할 연도를 입력하세요: ");
		year = scanner.nextInt();
		
		leap = (year%4 == 0) && (year%100 != 0) || (year%400 == 0)? "맞습니다." : "아닙니다.";
		
		System.out.println(year+"년은 윤년이 " + leap);
	}
     
}
