package chapter07;
// p340 상속 필드의 다향성 (TIRE 클래스)
public class Tire {
	//필드
	public int maxRaotaion; // 최대 회전수(타이어 수명)
	public int accumulatedRotation; // 누적 회전수
	public String location;  //타이어 위치
	
	
	//생성자
	public Tire(String location, int  maxRaotaion) {
		this.location = location; //타이어 위치 초기화
		this.maxRaotaion = maxRaotaion; // 최대 회전수(타이어 수명) 초기화
	}
	
	
	// 메소드
	public boolean roll() {
		++accumulatedRotation; //누적 회전수 1증가
		if(accumulatedRotation<maxRaotaion) {
			System.out.println(location + " Tire 수명: "+
			(maxRaotaion-accumulatedRotation)+ "회");
			return true;
		}else {
			System.out.println("*** "+location + " Tire 펑크 ***");
			return false;
		}
		
	}
}
