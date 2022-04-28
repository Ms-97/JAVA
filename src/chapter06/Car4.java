package chapter06;

public class Car4 {
	// p.278 정적메소드 선언 시 주의할점
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car4 myCar = new Car4();
		myCar.speed = 60;
		myCar.run();
	}
}
