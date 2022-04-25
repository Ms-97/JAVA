package chapter06;

public class CarExample {
 public static void main(String[] args) {
	Car car1 = new Car();
	System.out.println(car1.company);
	System.out.println(car1.model);
	System.out.println(car1.speed);
	System.out.println(car1.engineStart);
	
	
	Car car2 = new Car();
	System.out.println(car2.company);
	System.out.println(car2.model);
	System.out.println(car2.speed);
	System.out.println(car2.engineStart);
	
	car2.engineStart = true;
	car2.speed = 100;
	
	System.out.println(car2.company);
	System.out.println(car2.model);
	System.out.println(car2.speed);
	System.out.println(car2.engineStart);
	

	
 }
}

