package chapter08;
//p.378 08-1 인터페이스 (다중 인터페이스 구현 클래스)
public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	public void setVolume(int volume) {              //************************
		if(volume>RemoteControl.MAX_VOULME) {        //                       *  
			this.volume = RemoteControl.MAX_VOULME;  //                       *
		}else if(volume<RemoteControl.MIN_VOULME) {  //    RemoteControl의    *
			this.volume = RemoteControl.MIN_VOULME;  //  추상 메소드에 대한   *                      
		}else {                                      //   실체 메소드         *
			this.volume = volume;                    //                       *
		}                                            //************************
		System.out.println("현재 TV 볼륨: "+this.volume);
	}
	public void search(String url) {     
		System.out.println(url + "을 검색합니다.");   //Searchable의 추상메소드에 대한 실체 메소드
	}
}
	
