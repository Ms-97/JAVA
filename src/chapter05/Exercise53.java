package chapter05;

import java.util.Random;
import java.util.Scanner;

public class Exercise53 {
	public static void main(String[] args) {
		/*인공지능 컴퓨터와 게이머(사람)가 가위바위보 
		 * 게임을 할 수 있도록 프로그램을 작성하시오.
		 */
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String player;
		String winner = null;
		String[] com = {"가위","바위","보"};
		int ran = random.nextInt(3);
		
		System.out.print("가위 바위 보를 입력하세요: ");
		player = scanner.nextLine();
		
		if(player.equals(com[ran])) {
					   winner = "무승부";
				}
		else if(com[ran].equals("가위") && player.equals("보") 
				   || com[ran].equals("바위") && player.equals("가위")
				   || com[ran].equals("보") && player.equals("바위")) {
					
					winner = "인공지능 승리";
				}
				else {
					winner = "게이머 승리";
				}
		
		System.out.println("게이머: " + player);
		System.out.println("인공지능 컴퓨터: " + com[ran]);
		System.out.println("결과: " + winner);
	}
}
