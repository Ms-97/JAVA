package chapter10;

//p454 10장 예외처리 예외처리 코드(수업)

public class ExceptionExample {
	public static void main(String[] args) {
		// 1. 일반 예외(Compiletime Exception)
		try {
			Class.forName("java.lang.String");
			// 2. 실행 예외(Runtime Exception)
			
			int[] numbers = new int[5];
			numbers[10] = 100;
			
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("배열 갯수가 잘못되었습니다.");
		} catch (Exception e) {
			
		} finally {                   // 항상실행
			System.out.println("프로그램 종료");
		}
		
	}
}
