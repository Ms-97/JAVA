package chapter11;
//p.501 (11장 wrapper 클래스) 자동 박싱과 언박싱
public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		//자동박싱
		Integer obj = 100;
		System.out.println("value: "+obj.intValue());
		
		//대입 시 자동 언박싱
		int value = obj;
		System.out.println("value: "+value);
		
		//연산 시 자동 언박싱
		int result = obj +100;
		System.out.println("result: "+result);
	}
}
