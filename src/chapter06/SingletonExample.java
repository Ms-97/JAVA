package chapter06;

public class SingletonExample {
	 //p.280 싱글톤
	
	public static void main(String[] args) {
		
	
	/*
	Singleton obj1 = new Singleton();  //컴파일에러
	Singleton obj2 = new Singleton();
	*/
	
	Singleton obj1 =  Singleton.getInstance();
	Singleton obj2 =  Singleton.getInstance();
	
	if(obj1 == obj2) {
		System.out.println("같은 Singleton 객체입니다.");
	}else {
		System.out.println("같은 Singleton 객체입니다.");
	}
		
	}
}