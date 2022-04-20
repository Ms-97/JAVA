package chapter05;
import java.util.Scanner;


public class ReferenceExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//String Poll
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		
		System.out.println(name1.equals(name2));
		System.out.println(name1 == name2);
		
		System.out.println(name3.equals(name4));
		System.out.println(name3 == name4);

	}
}