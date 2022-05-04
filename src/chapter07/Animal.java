package chapter07;
//p363~p365 추상클래스 (추상메소드 선언)
public abstract class Animal {
	public String kind; 
		
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
}
