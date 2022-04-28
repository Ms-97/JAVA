package chapter06.package2;

import chapter06.package1.A2;

//P231 필드와 메소드의 접근 제한 (필드와 메소드의 접근 제한(2))
public class C2 {
	public C2() {
		A2 a = new A2();
		
		a.field1 = 1;
		a.field2 = 1; // default 필드 접근 불가(컴파일 에러)
		a.field3 = 1; // private 필드 접근 불가(컴파일 에러)
		
		a.method1();
		a.method2(); // default 필드 접근 불가(컴파일 에러)
		a.method3(); // private 필드 접근 불가(컴파일 에러)
	}
}
