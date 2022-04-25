package chapter05;

public class Exercise51 {
	public static void main(String[] args) {
		/*다음 배열에서 최댓값과 최솟값을 구하시오.
		 {38, 94, 16, 3, 76, 94, 82, 47, 59, 8} */
		
		int[] array = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
		int max = array[0]; //Interger.MAX_VALUE
		int min = array[0]; //Interger.MIN_VALUE
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			  
			if (array[i] < min) {
				min = array[i];	
			}
		}
		
		
		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}
}
