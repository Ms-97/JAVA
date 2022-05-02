package chapter06.classroomExample;

public class NewCar {
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200/1.6;
	
	public NewCar() {
		
	}
	
	public NewCar(String color) {	
	this.color = color;
	}
	
	public double getSpeed() {
		return mileToKillo(speed);
	
	}
	public void setSpeed(double speed) {
		this.speed = killoToMile(speed);
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean speedUp(double speed) {
		speed = killoToMile(speed);
		if (this.speed + speed >= 0 && this.speed + speed <= MAX_SPEED) {
			this.speed += speed;
			return true;
		} 
			return false;
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
