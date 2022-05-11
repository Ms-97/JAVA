package chapter10;
//p.460~642 10장 예외처리 예외 떠넘기기
public class ThrowsExample {
	public static void main(String[] args) {
		// throw 명령어
		try {
			throw new Exception("내가 만든 에러");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
