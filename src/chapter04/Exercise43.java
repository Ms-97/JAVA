package chapter04;

import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
/*사용자로부터 5과목의 점수를 입력받아 평균을 구하는 프로그램을 작성하여 보자.
 *  평균 점수로 학점을 계산하여 출력한다.(평균 점수는 소숫점 둘째자리까지만 출력)		
 */
		Scanner scanner = new Scanner(System.in);
		int program;
		int databass;
		int ui;
		int app;
		int ai;
		int sum;
		float average;
		String grade;
		
		System.out.println("점수를 입력하세요.");
		System.out.print("프로그래밍 기초: ");
		program = scanner.nextInt();
		System.out.print("데이터베이스: ");
		databass = scanner.nextInt();
		System.out.print("화면 구현: ");
		ui = scanner.nextInt();
		System.out.print("애플리케이션 구현: ");
		app = scanner.nextInt();
		System.out.print("머신러닝: ");
		ai = scanner.nextInt();
		
		sum = program + databass + ui + app + ai;
		average = (float)sum / 5;
		
		if(average >= 90) {
			grade = "A";
		}
		else if(average >= 80) {
			grade = "B";
		}
		else if(average >= 70) {
			grade = "C";
		}
		else if(average >= 60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		
		
		
		
		System.out.println("총점: " +sum);
		System.out.println("평균: " +average);
		System.out.println("학점: " +grade);
		
	}
}
