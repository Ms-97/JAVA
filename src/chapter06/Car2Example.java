package chapter06;

public class Car2Example {
	public static void main(String[] args) {
		// p.257 메소드 return문
		Car2 myCar = new Car2();
		
		
		myCar.setGas(5); //Car2의 SetGas() 메소드 호출
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();    //Car2의 run() 메소드 호출
		}
		
		if(myCar.isLeftGas()) {  // Car2의 isLeftGas() 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}
}

