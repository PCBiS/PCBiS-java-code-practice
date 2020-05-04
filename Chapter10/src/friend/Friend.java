package friend;

/*
 * 친구의 정보를 저장하기 위한 조상(super) 클래스.
 * 상속을 목적으로 공통되는 정보를 기본 클래스 정의.  
 * 
 * 친구라는 상위(super)개념의 공통정보
 * 
 * 이름
 * 전화
 * 주소
 * 
 * 상위개념을 상속(extend)받고 추가로 알아야 할 정보
 * 
 * 고등학교 동창			대학 동기			
 * 
 * 직업						전공
 * 							학년
 * 							이메일
 * 							
 */

public class Friend {
	String name;		// 이름      
	String phoneNum;	// 전화번호	
	String addr;		// 주소
	
	// 기본 생성자.
	Friend(String name, String phoneNum, String addr) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.addr = addr;		
	}
	
	void showBasicInfo() {
		System.out.println("이    름 : " + name);
		System.out.println("전화번호 : " + phoneNum);
		System.out.println("주    소 : " + addr);
	}
	
	/*
	 * 상속의 목적으로 오버라이딩 할 메소드를 정의한다.	
	 * 상위 클래스의 데이터 + 하위 클래스의 기본 데이터를 출력할 수 있도록.
	 */

	void showData() {}
	
}
