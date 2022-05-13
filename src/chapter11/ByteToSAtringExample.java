package chapter11;
//p.485 String 클래스 바이트 배열을 문자열로 변환
public class ByteToSAtringExample {
	public static void main(String[] args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97}; //아스키코드값
		
		String str1 = new String(bytes);
		System.out.println(str1);
		                                    
		String str2 = new String(bytes, 6, 4);  //6: 74의 인덱스 위치 4: 4개
		System.out.println(str2);
	}
}
