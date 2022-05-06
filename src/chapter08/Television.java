package chapter08;
//p.374 08-1 인터페이스 (구현 클래스)
public class Television implements RemoteControl{
	//필드
	private int volume;
	
	//turnOn() 추상메소드의 실제 메소드
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	//turnOff() 추상메소드의 실제 메소드
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	//setVolum() 추상메소드의 실제 메소드
	public void setVolume(int volume) {              //************************
		if(volume>RemoteControl.MAX_VOULME) {        //                       *  
			this.volume = RemoteControl.MAX_VOULME;  //                       *
		}else if(volume<RemoteControl.MIN_VOULME) {  //    인터페이스 상수를  *
			this.volume = RemoteControl.MIN_VOULME;  //  이용해서 volume 필드 *                      
		}else {                                      //   값을 제한           *
			this.volume = volume;                    //                       *
		}                                            //************************
		System.out.println("현재 TV 볼륨 : "+this.volume);
	}	
}
