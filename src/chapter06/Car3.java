package chapter06;

public class Car3 {
	//p262 클래스 클래스 외부에서 메소드 호출
	//필드
	int speed;
	
	//생성자
	
	//메소드
	int getSpeed() {
		return speed;
	}
	
	void KeyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("달립니다.(시속:"+speed +"km/h)");
			}
		}
	}

