package home_project04;

/*
 * 프로젝트 0.4 버전 - 상속 개념을 이용하여 전화번호부를 구현
 * 
 * 1. 공통사항 - 이름, 전화번호, 주소, 이메일 변수는 상속이 가능한 변수.
 * 2. 차 이 점 - 대학정보(전공 학년), 회사(회사이름)
 * 
 * 3. 조상격 기본 기능
 * 		PhoneInfor : 이름, 전화번호, 주소, 이메일 을 입력 받아 PhoneInfor 형의 클래스가 된다.
 * 		.infoShow() : 가지고 있는 정보를 출력해준다. 공통적인 부분 		
 */

public class PhoneInfor {
	String name;			// 이름
	String phoneNumber;		// 전화번호
	String address;			// 주소
	String email;			// 이메일
	String birthDay;		// 생년월일
	
	public PhoneInfor(String name, String phoneNumber, String address, String email, String birthDay) {
		this.name = name;						// 전달받은 이름을 클래스(this) 이름에 저장한다.
		this.phoneNumber = phoneNumber;			// 이하 동일 구조.
		this.address = address;
		this.email = email;
		this.birthDay = birthDay;
	}
	
	public void infoShow() {
		System.out.println("이    름 : " + name);			// 가지고 있는 이름을 반환해준다.
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("주    소 : " + address);
		System.out.println("이 메 일 : " + email);
	}	
}
