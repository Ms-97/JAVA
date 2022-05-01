package chapter06.classroomExample;

public class NewCar {
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200/1.6;
	
	NewCar() {
		
	}
	
	NewCar(String color) {	
	this.color = color;
	}
	
	public double getSpeed() {
		double speed = mileToKillo(this.speed);
		return speed;
		
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean speedUp(double speed) {
		double Mile = killoToMile(speed);
		if( Mile > 0.0 &&  Mile < MAX_SPEED) {
			this.speed +=  Mile;
			return true;
		}else {
			 Mile = this.speed;
		 	return false;
		}
	}
	public static double getMaxSpeed() {
		 return MAX_SPEED;
	}
	
	private static double killoToMile(double distance) {
		double mSpeed = distance/1.6;
		return mSpeed;
	}
	
	private static double mileToKillo(double distance) {
		double kSpeed = distance*1.6;
		return kSpeed;
		
	}
}
