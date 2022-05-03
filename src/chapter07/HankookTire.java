package chapter07;
//p342 상속 필드의 다향성 (TIRE의 자식클래스)
public class HankookTire extends Tire {
	//필드
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRaotaion) {
			System.out.println(location + " HankookTire 수명: "+
			(maxRaotaion-accumulatedRotation)+ "회");
			return true;
		}else {
			System.out.println("*** "+location + " HankookTire 펑크 ***");
			return false;
		}
	}
}
