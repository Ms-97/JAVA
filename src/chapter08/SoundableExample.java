package chapter08;
//p385 08-1인터페이스 확인문제3
public class SoundableExample {
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
	public static void printSound(Soundable sound) {
		System.out.println(sound.sound());
	}
}
