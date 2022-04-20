package chapter04;

import java.util.Scanner;

public class Exercise42 {
	public static void main(String[] args) {
/* 사용자로부터 특정 월을 입력받은 후, 
 * 입력 받은 월의 계절이 어떤 계절인지 알아내는 프로그램을 만들어 보자. 
 * 3월~5월은 봄, 6월~8월은 여름, 9월~11월은 가을, 12월~2월은 겨울을 출력한다.
 */
		int month;
		String season;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력하세요(1~12): ");
		month = scanner.nextInt();
		
		if(month >=3 && month <=5 ) {
			season = "봄";
		}
		else if (month >=6 && month <=8 ) {
			season = "여름";
		}
		else if (month >=9 && month <=11 ) {
			season = "가을";
		}
		else if (month>= 1 && month <=2 || month == 12){
			season = "겨울";
		}
		else{
			season = "잘못된 입력";
		}
		System.out.println(month+"월은 "+season+"입니다.");
	}
}
