package chapter06;

public class PrinterExample {
	// 클래스(4.메소드) 확인문제 4번
	public static void main(String[] args) {
		Printer printer = new Printer();
		
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
	}
}
