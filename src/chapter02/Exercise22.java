package chapter02;

public class Exercise22 {

	public static void main(String[] args) {
		// 2022.04.11 연습문제 - 02. 변수와 타입
		// Exercise22 김민수
		/*지구에서 가장 가까운 별은 어디일까? 정답은 태양이다. 
		 * 태양 다음으로 가까운 별은 프록시마 센타우리(Proxima Centauri) 별이라고 한다. 
		 * 프록시마 센타우리는 지구로 부터 40 * 10^12km 떨어져 있다고 한다. 
		 * 빛의 속도로 프록시마 센타우리까지 간다면 시간이 얼마나 걸리는지 직접 계산해보기로 하자.
		 *  빛의 속도는 300,000km/s이다. 
		 */
		
		double distance = 40e12;
		double lightSpeed = 3e5 * 60 * 60 *24 *365;
		
		//데이터 처리
		double time = distance / lightSpeed;
		
		
		// 데이터 출력
		System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 " + time + "광년이다.");
	}

}
