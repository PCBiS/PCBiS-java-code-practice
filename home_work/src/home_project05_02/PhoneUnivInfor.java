package home_project05_02;

/*
 * 프로젝트 0.4 버전 - 상속 개념을 이용하여 전화번호부를 구현
 * 
 * 1. 공통사항 - 이름, 전화번호, 주소, 이메일 변수는 상속이 가능한 변수.
 * 2. 자손대 추가정보 - 대학정보(전공, 학년)
 * 
 * 3. 자손격 기본 기능
 * 		PhoneUnivInfor : 이름, 전화번호, 주소, 이메일 을 입력 받아 PhoneInfor 형의 클래스가 된다.
 * 		.infoShow() : 조상이 가지고 있는 정보 + 자손대에서 추가 된 정보를 출력해준다. 		
 */

public class PhoneUnivInfor extends PhoneInfor {
	private String major;	// 전공
	private String year;	// 학년
	
	public PhoneUnivInfor(String name, String phoneNumber, String address, String email, String birthDay, String major, String year) {
		super(name, phoneNumber, address, email, birthDay); // 조상 변수를 상속받아서 사용.
		this.major = major; // 자손대에서 추가로 확인 된 정보를 대입.
		this.year = year; // 자손대에서 추가로 확인 된 정보를 대입.
	}

	@Override
	public void allInfo() {		
		super.allInfo();	// 조상격의 allInfo를 상속받음
		System.out.println("전    공 : " + major);	// 자손대에서 추가 된 정보를 출력함.
		System.out.println("학    년 : " + year);	// 자손대에서 추가 된 정보를 출력함.
	}
}
