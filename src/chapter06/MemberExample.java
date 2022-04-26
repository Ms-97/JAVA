package chapter06;

public class MemberExample {
	public static void main(String[] args) {
		Member member1 = new Member();
		member1.name = "최하얀";
		member1.age = 21;
		
		Member member2 = new Member();
		member2.name = "홍길동";
		member2.age = 23;
		
		System.out.println("이름: "+member1.name+ "\n나이: "+ member1.age);
		System.out.println("이름: "+member2.name+ "\n나이: "+ member2.age);
		
		Member mem3 = new Member("도길홍", 32);
		System.out.println("이름: "+mem3.name+ "\n나이: "+ mem3.age);
	}
}
