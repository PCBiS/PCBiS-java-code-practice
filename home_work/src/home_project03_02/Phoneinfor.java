package home_project03_02;

/*
 * 전화번호 관리 프로그램 0.1 Ver.
 * 작성자 : 안정민
 * 작성목적 : 이름, 번호, 생년월일(선택적 입력)을 입력받고 원하는경우 저장된 정보를 볼 수 있다. 
 */

public class Phoneinfor {
	
	// private : 변수의 직접참조를 막는다, 정보 은닉 목적.
	private String name;		// 이름
	private String phoneNum;	// 전화번호
	private String birthDay;	// 생년월일
		
	Phoneinfor(String name, String phoneNum){	// 이름, 전화번호만을 입력받는 메소드		
		this.name = name;			// 클래스 변수 이름 = 입력받은 이름을 대입
		this.phoneNum = phoneNum;	// 클래스 변수 전화번호 = 입력받은 전화번호를 대입.
		System.out.println(this.name + " 님의 전화번호 " + this.phoneNum + " 가 정상적으로 등록되었습니다."); // 확인용.
	}
	
	Phoneinfor(String name, String phoneNum, String birthDay) {	// 이름, 전화번호, 생년월일을 입력받는 오버로딩 메소드
		this.name = name;				// 클래스 변수 이름 = 입력받은 이름을 대입
		this.phoneNum = phoneNum;		// 클래스 변수 전화번호 = 입력받은 전화번호를 대입.
		this.birthDay = birthDay;		// 클래스 변수 생년월일 = 입력받은 생년월일을 대입.
		System.out.println(this.name + " 님의 전화번호 " + this.phoneNum + " 가 정상적으로 등록되었습니다."); // 정상등록 확인용.
	}	
	
	void showInfo() {	// 저장 된 정보를 출력하는 메소드
		System.out.println("이름 : " + name);						// 이름 출력
		System.out.println("전화번호 : " + phoneNum);				// 전화번호 출력
		System.out.println(birthDay!=null?"생일 : " + birthDay:"");	// 생년월일 출력 (단 생년월일이 등록 안되있으면 출력 안함)
	}
	
	// name 속성 값과 전달받은 문자열을 비교하여 결과 반환해주는 메소드 
	boolean checkName(String name) {
		
		return this.name.equals(name); 
		//.equals( 비교한 객체가 일치하는지 아닌지 boolean 타입으로 반환하는 메소드 
	}
}


