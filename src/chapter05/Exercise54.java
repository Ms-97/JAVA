package chapter05;

import java.util.Random;

public class Exercise54 {
	public static void main(String[] args) {
/*주사위를 던져서 각 면이 나오는 횟수를 출력하는 프로그램을 만들어 보자.
 *  주사위를 던지는 동작은 1부터 6까지의 임의로 만들어내는 난수 발생기(Random 객체)가 대신한다.
 *   난수 발생기를 10,000번 호출하여 각 면이 나타나는 횟수를 계산하여 배열에 저장한다.
 */
		Random random = new Random();
		int[] dice = new int[6];
		int count=0;
		
		for(int i=0; i<10000; i++) {
		 int ranNum = random.nextInt(6);
		  // dice[random_nextInt(6)]++;
		 	
		 	if (ranNum == 0) {
		 		count = dice[0];
		 		dice[0] = ++count;
			}
			else if (ranNum == 1) {
				count = dice[1];
		 		dice[1] = ++count;
			}
			else if (ranNum == 2) {
				count = dice[2];
		 		dice[2] = ++count;
			}
			else if (ranNum == 3) {
				count = dice[3];
		 		dice[3] = ++count;
			}
			else if (ranNum == 4) {
				count = dice[4];
		 		dice[4] = ++count;
			}
			else if (ranNum == 5) {
				count = dice[5];
		 		dice[5] = ++count;
			}
		}
		System.out.println("-----------------");
		System.out.println("면           빈도");
		System.out.println("-----------------");
		
		for(int j=0; j<6; j++) {
			System.out.println(j+1+"            "+dice[j]);
		}
	}
}
