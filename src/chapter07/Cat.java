package chapter07;
//p363~p365 추상클래스 (추상메소드 재정의)
public class Cat extends Animal{
	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
