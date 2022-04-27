package chapter06;

public class Car3Example {
	//p262 클래스 클래스 외부에서 메소드 호출
	public static void main(String[] args) {
		Car3 myCar = new Car3();
		myCar.KeyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도: "+speed+"km/h");
	}
}

