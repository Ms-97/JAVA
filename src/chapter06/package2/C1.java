package chapter06.package2;

import chapter06.package1.A1;

//P298 생성자의 접근 제한 (생성자의 접근제한(3))
public class C1 {
	A1 a1 = new A1(true);
	A1 a2 = new A1(1);          // default 생성자 접근 불가(컴파일 에러)
	A1 a3 = new A1("문자열");   // private 생성자 접근 불가(컴파일 에러)
}
