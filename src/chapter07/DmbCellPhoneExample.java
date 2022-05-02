package chapter07;

public class DmbCellPhoneExample {
	
	//p311~p313 상속 클래스 상속 (자식 클래스 사용)
	
	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정",10);
		
		
		//CellPhone 클래스로부터 상속받은 필드
		System.out.println("모델: " +dmbCellPhone.model);
		System.out.println("생상: "+dmbCellPhone.color);
		
		//DmbCellPhone 클래스의 필드
		System.out.println("채널: "+dmbCellPhone.channel);
		
		//CellPhone 클래스로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요.");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동입니다.");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone 클래스의 메소드 호출
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
