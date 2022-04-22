package chapter05;

import java.util.Random;

public class Exercise52 {
	public static void main(String[] args) {
/*로또번호를 생성하는 프로그램을 작성하시오.
* (로또 번호는 1 ~ 45번까지 있으며 이 중에서 중복되지 않는 6개의 숫자를 추출하여 결과를 출력한다.)
 */
		Random random = new Random();
		int[] array = new int[6];
		int ranNum = 0;
                                          
		for (int i = 0; i < 6; i++) {
			ranNum = random.nextInt(45)+1;
			array[i] = ranNum;
			
			for(int j =0; j < i; j++) {
			  if (array[i] == array[j]) {
				  i--;
				  break;
			  }
		  }
		}
		
		System.out.print("생성된 로또번호:");
		for(int k=0; k < 6; k++) {
			System.out.print(" "+array[k]);
		}
	}
}
		
	

