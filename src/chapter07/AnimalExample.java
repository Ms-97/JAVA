package chapter07;

import org.omg.CORBA.PUBLIC_MEMBER;

//p363~p365 추상클래스 (추상메소드 실행클래스)
public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("---------");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();    //<-자동 타입 변환 및 재정의된 메소드 호출
		animal.sound();
		animal = new Cat();   //<-자동 타입 변환 및 재정의된 메소드 호출
		animal.sound();
		System.out.println("---------");
		
		//메소드의 다형성
		animalSound(new Dog());  // <ㄱ            
		animalSound(new Cat());  // 자동 타입 변환 | 
	}                            //                V
		public static void animalSound(Animal animal) { // Animal animal = new Dog()
			animal.sound(); // 재정의된 메서드 호출
			
		}
	
}
