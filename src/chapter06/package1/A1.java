package chapter06.package1;
 //P297 생성자의 접근 제한 (생성자의 접근제한(1))
public class A1 {
	//필드
	A1 a1 = new A1(true);
	A1 a2 = new A1(1);
	A1 a3 = new A1("문자열");
	
	
	//생성자
	public A1(boolean b1) {} //public 접근제한
	A1(int b1){}             //default 접근제한
	private A1(String s) {}  //private 접근제한
	
}
