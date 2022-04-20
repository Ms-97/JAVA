package chapter04;

import java.util.Random;
import java.util.Scanner;

public class ChExample{
public static void main(String[] args) {
	//확인문제 2번
	/*int num = 0;
	for(int i=1; i<=100; i++) {
		if(i%3 == 0) {
			num += i;
		}
}
	System.out.println("3의 배수의 총합:" +num); */
	
	//확인문제 3번 
	/* Random random = new Random();
	
	while(true) {
		int num1 = random.nextInt(6)+1;
		int num2 = random.nextInt(6)+1;
		System.out.println("(" + num1 + ", " + num2 + ")");
		if (num1+num2==5) {
			break;
		}
	}
	
	// 확인문제 4
	 /* for(int x=0; x<=10; x++) {
		  for (int y=0; y<=10; y++) {
			  if(4*x + 5*y == 60) {
				  System.out.println("("+x+","+y+")");
			  }
		  }
	  }
	*/
	//확인문제5 
	/* for(int i=1; i<=4; i++) {
		for(int j=1; j<=i; j++) {
			 System.out.print("*");
		}
			 System.out.println();
		 }
     */
   //확인문제6
	/* for(int i=1; i<=4; i++) {
		for(int j=4; j>=0; j--) {
		   if(j>=i) {
			   System.out.print(" ");
		   }
		   else {
			 System.out.print("*");
		   }
		}
			 System.out.println();
		 }
	*/ 
		 
	
	   //확인문제7
	boolean run = true;
	int balance = 0;
	Scanner scanner = new Scanner(System.in);
	
	while(run) {
		System.out.println("----------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("----------------------------------");
		System.out.print("선택> ");
		int choice = Integer.parseInt(scanner.nextLine());
		
		if (choice == 1) {
			System.out.print("예금액>");
			balance += Integer.parseInt(scanner.nextLine());
			continue;
		}
		
		else if (choice == 2) {
			System.out.print("출금액>");
			 int pay = Integer.parseInt(scanner.nextLine());
			 	if(balance>=pay) {
			 		balance -= pay;
			 		}
			 	else {
			 		System.out.println("잔고가 부족합니다");
			 		}
			continue;
		}
		
		else if (choice == 3) {
			System.out.println("잔고>"+balance);
			continue;
		}
		
		else if (choice == 4) {
			System.out.print("프로그램 종료");
			run = false;
		}
		
		else {
			System.out.println("잘못입력했습니다.");
			continue;
		}
	} 
 }
}
	

	

