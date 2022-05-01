package chapter06.classroomExample;

public class Circle {

	double radius;
	double x;
	double y;
	
	Circle(){}
	
	double getRadius(){
	   return radius;
	}
	
	public void setRadius(double radius) {
		if(radius < 0) {
			this.radius = 0;
		}else {
		this.radius = radius;
		}
	}
	
	double getX(){
		   return x;
		}
	
	public void setX(double x) {
		this.x = x;
	}
    
	double getY(){
		   return y;
		}
	
	public void setY(double y) {
		this.y = y;
	}
	
	double getArea(){
		double area = Math.PI * radius * radius;
		return area;
		}

		
	

}
