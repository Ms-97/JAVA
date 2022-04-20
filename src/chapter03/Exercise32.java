package chapter03;

import java.util.Scanner;

public class Exercise32 {

	public static void main(String[] args) {
 /*메트로폴리스(거대도시)는 다음과 같은 2가지 조건 중 하나를 만족하여야 한다고 가정한다. 
  * 어떤 도시가 메트로폴리스인지를 알아보는 프로그램을 작성하여 보자.(삼항연산자 사용)
  */
		Scanner scanner = new Scanner(System.in);
		
		int capital;
		int population;
		int resultP;
		String metero;
		
		System.out.print("수도입니까?(수도: 1, 수도아님: 0) ");
		capital = scanner.nextInt();
		System.out.print("총 인구는?(단위: 만) ");
		population = scanner.nextInt();
		System.out.print("연소득이 1억 이상인 인구는?(단위: 만) ");
		resultP = scanner.nextInt();
		
		metero = ((capital == 1) && (population >= 100)) || (resultP >= 50) ? "입니다." : "가 아닙니다.";
		
		
		
		System.out.println("이 도시는 메트로폴리스"+ metero);
	}

}
