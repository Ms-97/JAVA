package chapter06.classroomExample;

public class Circle {

	private double radius;
	private double x;
	private double y;
	
	public Circle(){}
	
	public double getRadius(){
	   return radius;
	}
	
	public void setRadius(double radius) {
		if(radius > 0) {
		this.radius = radius;
		}
	}
	
	public double getX(){
		   return x;
		}
	
	public void setX(double x) {
		this.x = x;
	}
    
	public double getY(){
		   return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getArea(){
		return Math.PI * radius * radius;
	}
}
