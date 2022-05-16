package chapter11;
//p.514 Date 클래스 
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date date = new Date();
		// 2022-05-16 11:13:43
		System.out.println(date); // Mon May 16 11:13:43 KST 2022
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH:mm:ss");
		String string = format.format(date);
		System.out.println(string);
		
		// jdk 1.8 이후(2014년 이후)
		String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 HH:mm:ss"));
		System.out.println(now);
		String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일"));
		System.out.println(today);
	}
}
