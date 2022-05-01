package chapter06.classroomExample;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	public Time(){
		hour = 0;
		minute = 0;
		second = 0;
	}
	public Time(int hour,int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
		if(hour > 23) {
			this.hour = 0;
		}
		
		if(minute > 59) {
		   this.minute = 0;
		}
		
		if(second > 59) {
			this.second = 0;
		}
	}
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}
