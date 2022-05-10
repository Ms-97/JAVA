package chapter08.classroomExample.Shape;

public class Triangle extends Shape{

	private double side;
	
	public Triangle(double side) {
		this.side = side;
	}
	public double area() {
		return Math.sqrt(3)/4 * side * side;
	}
	public double perimeter() {	
		return side * 3;
	}
	
	public String toString() {
		return String.format("도형의 종류: 삼각형, 둘레: %.2fcm, 넓이: %.2fcm²",perimeter(),area());
	}

}
