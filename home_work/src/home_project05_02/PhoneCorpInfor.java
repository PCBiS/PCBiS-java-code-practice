package home_project05_02;

/*
 * 프로젝트 0.4 버전 - 상속 개념을 이용하여 전화번호부를 구현
 * 
 * 1. 공통사항 - 이름, 전화번호, 주소, 이메일 변수는 상속이 가능한 변수.
 * 2. 자손대 추가정보 - 회사(회사이름)
 * 
 * 3. 자손격 기본 기능
 * 		PhoneCompanyInfor : 이름, 전화번호, 주소, 이메일 을 입력 받아 PhoneInfor 형의 클래스가 된다.
 * 		.infoShow() : 조상이 가지고 있는 정보 + 자손대에서 추가 된 정보를 출력해준다. 		
 */


public class PhoneCorpInfor extends PhoneInfor {
	private String company;		// 회사명
	
	public PhoneCorpInfor(String name, String phoneNumber, String address, String email, String birthDay, String company) {
		super(name, phoneNumber, address, email, birthDay); // 조상 변수를 상속받아서 사용.
		this.company = company;	// 자손대에서 추가로 확인 된 정보를 대입.
	}

	@Override
	public void allInfo() {		
		super.allInfo();	// 조상격의 allInfo 를 상속받음.
		System.out.println("회    사 : " + company);	// 자손대에서 추가 된 정보를 출력함.
	}
}
