package chapter04;

import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		// 옛날 랜덤 공식          마지막숫자 - 처음숫자 + 1 
		// (int)(Math.random() * (추출할 숫자)) + 처음숫자;  해킹위험 높음 사용 x
		
		// 앞으로는 이걸로 쓰세요.
		Random random = new Random();
		//random.nextInt(6);//0 부터 5까지
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		System.out.println(random.nextInt(6));
		
	}
}
