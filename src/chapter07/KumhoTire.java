package chapter07;
//p342 상속 필드의 다향성 (TIRE의 자식클래스)
public class KumhoTire extends Tire {
	//필드
	//생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRaotaion) {
			System.out.println(location + " KumhoTire 수명: "+
			(maxRaotaion-accumulatedRotation)+ "회");
			return true;
		}else {
			System.out.println("*** "+location + " KumhoTire 펑크 ***");
			return false;
		}
	}
}


