package chapter02;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// 정수는 int 타입으로 간주
		
		int a = 1000000000;
	    long l = 10000000000L;
		
		float var1 = 3.14f;
		double var2 = 3.14;
		
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;

		System.out.println(var4);
		System.out.println(var5);
		
		// 수학지수(exponential)
		double var6 = 3e6;  //3000000
		double var8 = 2e-3; //0.002
		System.out.println(var6);
		System.out.println(var8);
	}

}
