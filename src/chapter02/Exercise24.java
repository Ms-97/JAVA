package chapter02;

import java.util.Scanner;


public class Exercise24 {
	public static void main(String[] args) {
		
		// 2022.04.11 연습문제 - 02. 변수와 타입
		// Exercise24 김민수
		//원기둥 밑면의 반지름과 높이를 입력 받아서 밑면의 넓이와 부피를 계산하는 프로그램을 작성하여 보자. 
		//원주율은 Math.PI를 사용한다.
		
		Scanner scanner = new Scanner(System.in);
		
		double radius;
		double height;
		double area;
		double volume;
		double pi = Math.PI;
		
		System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위: cm):");
		radius = scanner.nextDouble();
		System.out.print("원기둥 높이를 입력하시오.(단위: cm):");
		height = scanner.nextDouble();
		
		area =radius * radius * pi;
		volume = area * height;
		
		System.out.println("원기둥 밑변의 넓이는 "+ area +"㎠이고, 원기둥의 부피는 "+ volume + "㎤이다.");
	}
}
