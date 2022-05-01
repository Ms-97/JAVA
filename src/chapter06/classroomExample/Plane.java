package chapter06.classroomExample;


public class Plane {
	private String manufacturer;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes;


	public Plane() {
	   manufacturer = "0";
	   model = "0";
	   maxNumberOfPassengers = 0;
	   getNumberOfPlanes();
	   
	}
	public Plane(String manufacturer, String model, int maxNumberOfPassengers) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
		getNumberOfPlanes();
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}
	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
	  if(maxNumberOfPassengers < 0) {
		  maxNumberOfPassengers = 0;
		  this.maxNumberOfPassengers = maxNumberOfPassengers;
	  }
	}
	public static int getNumberOfPlanes() {
		return numberOfPlanes++;
	}
	
	
}