package chapter10;
// p.456~459 10장 예외처리 예외처리 코드(수업)
public class TryCatchFinallyRuntimeException {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			System.out.println(data1 + " + " + data2 + " = " + (value1 + value2));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("에러가 발생했습니다.");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} catch (Exception e) {
			
		}
	}
}
