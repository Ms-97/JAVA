package chapter02;

import java.util.Scanner;

public class Exercise25 {

	public static void main(String[] args) {
		      // 2022.04.11 연습문제 - 02. 변수와 타입
		      // Exercise25 김민수
			  //사용자로부터 500원, 100원, 50원, 10원짜리 동전의 갯수를 입력 받아 저금통 안에
		      // 총 얼마가 들어 있는지 출력하는 프로그램을 만들어 보자. *

		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("500원 짜리 동전의 갯수:");
		int coin500 = scanner.nextInt();
		System.out.print("100원 짜리 동전의 갯수:");
		int coin100 = scanner.nextInt();
		System.out.print("50원 짜리 동전의 갯수:");
		int coin50 = scanner.nextInt();
		System.out.print("10원 짜리 동전의 갯수:");
		int coin10 = scanner.nextInt();
		
		int bank = (coin500*500)+(coin100*100)+(coin50*50)+(coin10*10);
		
		System.out.printf("저금통 안의 동전의 총 액수:%s",bank);
		
	}

}
