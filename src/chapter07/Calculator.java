package chapter07;

//p318~p319 상속 메소드 재정의 (부모클래스)

public class Calculator {
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r* r;  
	}
}
