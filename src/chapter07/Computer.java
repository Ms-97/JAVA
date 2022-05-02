package chapter07;

//p318~p319 상속 메소드 재정의 (자식클래스)

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r* r;

	}
}
