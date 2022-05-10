package chapter09;

import chapter09.OuterClass.InnerClass;

public class NestedClassExample {
	public static void main(String[] args) {
		new java.lang.String();
//		InnerClass innerClass = new OuterClass(). new InnerClass();
//		innerClass.innerName = "안쪽 클래스";
//		innerClass.innerMethod();
		OuterClass.outerName = "바깥쪽 클래스";
		OuterClass.outerMethod();
		new OuterClass.InnerClass().innerMethod();
	}
}
