package chapter11;
//p.495 문자열 잘라내기 문자열 추출하기
public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firsNum = ssn.substring(0, 6);
		System.out.println(firsNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
}
