package chapter07;

//p315~p316 상속 부모 생성자 호출 (자식 객체 이용)

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("홍길동","123456-1234657",1);
		System.out.println("name : " + student.name);    //  <--부모에게 상속받은 필드 출력
		System.out.println("ssn : " + student.ssn);      //  <-- 부모에게 상속받은 필드 출력
		System.out.println("studentNo : " + student.studentNo);
	}
}
