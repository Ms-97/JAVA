package chapter06;

public class Singleton {
 //p.280 싱글톤
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
	
}
