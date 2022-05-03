package chapter07;
//p330 상속 연습문제5 
public class Child extends Parent {
	private String name;
  	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		//super();
		this.name = name;
		System.out.println("Child(String name) call");
	}
}

