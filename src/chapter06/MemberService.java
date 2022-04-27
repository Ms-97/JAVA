package chapter06;

public class MemberService {
	// 클래스(4.메소드) 확인문제 3번
	
	
	boolean login(String id, String password){
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
			
		}
	
	
	void logout(String id) {
		if(id.equals("hong")) {	
		System.out.println("로그아웃 되었습니다.");
		}else {
			return;
			}
		}
	}	
