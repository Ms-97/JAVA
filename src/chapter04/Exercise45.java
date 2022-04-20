package chapter04;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
/*컴퓨터가 1부터 100 사이의 임의의 정수를 생성하면, 그 수를 맞추는 게임을 만들어보자.
 *  사용자가 추측한 수를 입력하면, 컴퓨터가 생성한 수보다 큰지 작은지를 알려준다.
 *   사용자가 추측한 수가 컴퓨터가 생성한 수와 같을 때까지 반복한다.		
 */
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int num;
		int ranNum;
		boolean run = true;
		int win=0;
	    ranNum = random.nextInt(100)+1;
		
	    
	    while(run) {
	    	win++;
	    	System.out.print("1부터 100 사이즈의 정수 중 하나를 선택하세요: ");
	    	num = scanner.nextInt();
	    	
	    	if(num > ranNum) {
	    		System.out.println("정답은 더 작은 수입니다.");
	    		
	    	}
	    	else if(num < ranNum) {
	    		System.out.println("정답은 더 큰 수입니다.");
	    		
	    	}
	    	else if(num == ranNum) {
	    		System.out.println("정답입니다.");
	    		
	    		run = false;
	    	}
	    	
	    }
	    System.out.println("당신은 "+ win +"번 만에 승리하였습니다.");
	}
}
