package home_project05_02;

public abstract class PhoneInforAbstract {
	//추상변수를 자손에게 상속
	String name;			// 이름
	String phoneNumber;		// 전화번호
	String address;			// 주소
	String email;			// 이메일
	String birthDay;		// 생년월일

	//기본적으로 구현 해야 할 기능들을 추상적으로 표현
	public boolean searchName(String keyword) {
		return false;		
	}
	public void basicInfo() {}
	
	public void allInfo() {}
	
}
