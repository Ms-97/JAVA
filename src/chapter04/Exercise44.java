package chapter04;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
/*두 사람이 하는 가위 바위 보 게임을 만들어 보자. 
 * 두 사람이 입력한 문자열을 비교하여 누가 이겼는지 출력하는 프로그램이다.		
 */
	Scanner scanner = new Scanner(System.in);
	
	String cheolSu;
	String yeongHui;
	
	//시험!
	
	System.out.println("가위 바위 보 게임!");
	System.out.print("철수: ");
	cheolSu = scanner.next();
	System.out.print("영희: ");
	yeongHui = scanner.next();
	
	if(cheolSu.equals("가위") && yeongHui.equals("보") 
	   || cheolSu.equals("바위") && yeongHui.equals("가위")
	   || cheolSu.equals("보") && yeongHui.equals("바위")) {
		
		System.out.println("결과: 철수 승리!");
	}
	else if(yeongHui.equals("가위") && cheolSu.equals("보") 
			   || yeongHui.equals("바위") && cheolSu.equals("가위")
			   || yeongHui.equals("보") && cheolSu.equals("바위")) {
		
		System.out.println("결과: 영희 승리!");
	}
	else if(cheolSu.equals("가위") && yeongHui.equals("가위")   // cheolSu.equals(yeongHui)
			   || cheolSu.equals("바위") && yeongHui.equals("바위")
			   || cheolSu.equals("보") && yeongHui.equals("보")) {
		
		System.out.println("결과: 무승부!");
	}
  }
}
