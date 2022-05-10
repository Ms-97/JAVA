package chapter09;

//p.439 09-2 익명객체 확인문제2(익명 구현 클래스와 객체 생성)
public class AnonymousExample1 {
	public static void main(String[] args) {
		Anonymous1 anony = new Anonymous1();

		anony.field.run();
		// 익명 객체 로컬 변수 사용
		anony.method1();
		// 익명 객체 매개값 사용
		anony.method2(new Vehicle() {
			@Override
			public void run() {

				System.out.println("트럭이 달립니다.");
			}
		});

	}
}
