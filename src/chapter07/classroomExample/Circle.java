package chapter07.classroomExample;

public class Circle extends Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	// Annotation 어노테이션
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	@Override
	public double perimeter() {	
		return 2 * Math.PI * radius;
	}
	@Override
	public String toString() {
		return String.format("도형의 종류: 원, 둘레:"+perimeter()+"cm, 넓이: "+area()+"cm²");
	}
}
