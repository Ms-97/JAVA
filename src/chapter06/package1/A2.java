package chapter06.package1;
//P230 필드와 메소드의 접근 제한 (필드와 메소드의 접근 제한(1))
public class A2 {
	//필드
	public int field1;  //public 접근제한
	int field2;         //default 접근제한
	private int field3; //private 접근제한

	
	
	//생성자
	public A2(){
		field1 = 1;
		field2 = 1;
		field3 = 1;
	 
		                    // 클래스의 내부일 경우 접근
		method1();          // 제한자의 영향을 받지 않음
		method2();
		method3();
	}
	
	//메소드
	public void method1() {}   //public 접근제한
	void method2() {}          //default 접근제한
	private void method3() {}  //private 접근제한

}
