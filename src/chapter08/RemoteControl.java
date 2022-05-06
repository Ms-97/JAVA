package chapter08;
//p.372 08-1 인터페이스 (상수필드 선언)
public interface RemoteControl {
	//상수
	public int MAX_VOULME = 10;
	public int MIN_VOULME = 0;
	
//p.373 08-1 인터페이스 +(추상메소드 선언)
	//추상메소드
	public void turnOn();
	public void turnOff();             //<--- 메소드 선언부만 작성
	public void setVolume(int volume);
}
