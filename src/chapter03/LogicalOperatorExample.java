package chapter03;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		
		int charCode = 'A';
		
		if((charCode>=65) & (charCode<=90)) {
			System.out.println("대문자군요");
		}
		
		if((charCode>=97) && (charCode<=122)) {
			System.out.println("소문자군요");
		}

		if((charCode>=48) && (charCode<=57)) {
			System.out.println("0~9 숫자군요");
		}
		
		int value = 6;
		
		if((value%2==0) | (value%3==0)) {
			System.out.println("2또는 3의 배수군요");
		}
		if((value%2==0) || (value%3==0)) {
			System.out.println("2또는 3의 배수군요");
		}
		
		// && : 앞의 피연산자가 false라면 뒤의 피연자를 평가하지 않고 바로 false
		//  & : 두 피연산자 모두 평가 산출
		// || : 앞의 피연산자가 true라면 뒤의 피연자를 평가하지 않고 바로 true
		//  | : 두 피연산자 모두 평가 산출
	}

}
