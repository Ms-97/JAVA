package chapter03;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {


    ///9번 문제
  Scanner scanner = new Scanner(System.in);
   
   System.out.print("첫 번째 수:");
   double first = scanner.nextDouble();
   System.out.print("두 번째 수:");
   double sec = scanner.nextDouble();
   
   if (sec == 0.0) {
   System.out.println("결과:무한대");
   }
   else {
	   double result = first / sec;
	   System.out.println("결과:"+ result);
   }
   /* ///11번 문제
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4 = var2 * var1 * Double.parseDouble(var2 + "." + var3);
		System.out.println("넓이:" + var4);
		 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디:");
		String name = scanner.nextLine();
		
		System.out.print("비번:");
		String strpass = scanner.nextLine();
		int pass = Integer.parseInt(strpass);
		
		if(name.equals("java")) {
			if(pass == 12345) {
				System.out.println("로그인");
			}
			else {
				System.out.print("로그인 실패 : 패스워드");
		}
		}
			else {
				System.out.print("로그인 실패 : 아이디");
		}
		///12번 문제
		int x = 10;
		int y = 5;
		System.out.println((x>7)&&(y<=5));
		System.out.println((x%3 == 2 )||(y%2 != 1));
		
		///14번 문제
		int s = 85;
		String r = (!(s>90)) ? "ㄱ" : "ㄴ";
		System.out.println(r); */ 
			}
		
}

