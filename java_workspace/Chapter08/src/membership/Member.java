package membership;

// 회원정보를 저장하기 위한 클래스 생성.
public class Member {
	String memberID; // 글로벌 변수
	String memberName;
	String memberEmail;
	
	Member(String memberID, String memberName){
		this.memberID = memberID;
		this.memberName = memberName;		
	}
	
	// 생성자 만들기 - 클래스 이름으로.	
	Member(String memberID, String memberName, String memberEmail){ // 지역 변수 - 이 지역 벗어나면 소멸
		this.memberID = memberID; // 글로벌변수 memberID에 입력받은 memberID를 대입.
		//this : 나 자신(class Member)을 가르키는 참조변수(글로벌 변수를 참조)
		this.memberName = memberName; // 이하 상동.
		this.memberEmail = memberEmail;
	}
	
	void showInfo() {
		System.out.println("회원 ID : " + this.memberID); // 이 지역변수에선 동일한 변수명이 없으나
		System.out.println("회원 이름 : " + this.memberName); // 사고 방지를 위하여 this.로 명확하게
		System.out.println("회원 E-Mail : " + this.memberEmail); // 글로벌 변수를 보도록 한다.
	}

	@Override
	public String toString() {
		return "Member [memberID=" + memberID + ", memberName=" + memberName + ", memberEmail=" + memberEmail + "]";
	}	
}
