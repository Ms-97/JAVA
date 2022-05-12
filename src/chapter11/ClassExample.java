package chapter11;

import java.lang.reflect.Field;

import chapter08.Student;
public class ClassExample {
	public static void main(String[] args) {
		try {
			Class sClass = Class.forName("chapter08.Student");/// ---같은
			new Student().getClass();                           //---- 의미
			System.out.println(sClass.getName());
			System.out.println(sClass.getSimpleName());
			System.out.println(sClass.isInterface());
			System.out.println(sClass);
			
			System.out.println("메소드 갯수: " + sClass.getMethods().length);
			System.out.println("필드 갯수: " + sClass.getDeclaredFields().length);  //getFields = 퍼블릭만
	
			Field[] declaredFields = sClass.getDeclaredFields();
			for (Field field : declaredFields) {
				System.out.println(field.getName());
			}
	} catch (ClassNotFoundException e) {
			e.printStackTrace();
	}
 }	
}
