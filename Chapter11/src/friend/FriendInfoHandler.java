package friend;

import java.util.Scanner;

/*
 * Friend 타입의 배열 정보를 저장한다.
 *	- Friend 를 저장하는 기능.
 *	- Friend[i] 번의 기본 정보를 출력하는 방법.
 *	- Friend[i] 번의 상세 정보를 출력하는 방법. 
 *
 *	20200428 수정사항
 *	1. Manager 클래스 Singleton 패턴으로 처리.
 *	01. 생성자 점근제어지시자 : private - 인스턴스 생성을 막는다.
 *	02. 공동으로 사용 할 인스턴스를 생성한다. : private static
 *	03. 참조변수를 반환하는 메소드 필요 : static
 *	
 *	2. Interface 기반의 상수 표현.
 *	3. Interface -> 추상클래스 -> 상속관계
 */


public class FriendInfoHandler {	
	private Friend[] myFriends;		// Friend 타입의 배열
	private int numOfFriends;		// 배열에 저장 되어있는 수를 집계하는 수. [루프 기준점.]
	Scanner sc;
	/*
	 * 생성자를 이용한 초기화.
	 * 저장공간 (사이즈) 크기를 입력 받아서 배열을 생성. 
	 */
	private static FriendInfoHandler handler = new FriendInfoHandler(100);
	
	private FriendInfoHandler(int num) {				
		this.myFriends = new Friend[num];	// num 을 전달받아서 num 크기만한 배열을 생성.
		this.numOfFriends = 0;	// index 기준 값.
		this.sc = new Scanner(System.in);
	}
	
	public static FriendInfoHandler getInstance() {
		return handler;
	}
	
	/*
	 * 친구 정보를 저장하는 기능
	 * 	1. 배열에 저장하는 기능
	 * 	2. 사용자에게 데이터를 받아서 사용자 요청에 맞는 인스턴스를 생성.
	 * 
	 * 		- HighFriend
	 * 		- UnivFriend
	 * 			각각 요구하는 데이터가 다르다.
	 */ 

	void addFriendInfo(Friend friend) {
		this.myFriends[numOfFriends++] = friend;
		// Friend class 단위를 전달받아 Friend[numOfFriends] 배열에 저장하고 num을 1 증가 시킨다.
	}
	
	void addFriend(int select) {
		String name, phoneNum, addr, job, major, grade;	
		/* 
		 * friend 에서 받는 기본 정보와 , High 에서 받는 job 		
		 * 								  Univ 에서 받는 major, grade 의 설계를 해둔다.
		 */
		
		// 기본 공통정보.
		System.out.println("이    름 : "); 						
		name = sc.nextLine();
		System.out.println("전화번호 : ");
		phoneNum = sc.nextLine();
		System.out.println("주    소 : ");
		addr = sc.nextLine();
		if (select==1) {
			System.out.println("직    업 : ");			
			job = sc.nextLine();
			addFriendInfo(new HighFriend(name, phoneNum, addr, job));
		}else {
			System.out.println("전    공 : ");
			major = sc.nextLine();
			System.out.println("학    년 : ");
			grade = sc.nextLine();			
			// Integer.parseInt(grade) String 타입 인스턴스 배열을 to Int 타입의 자료형으로 형 변환.
			addFriendInfo(new UnivFriend(name, phoneNum, addr, major, Integer.parseInt(grade)));
		}
		System.out.println("입력이 완료 되었습니다.");
	}
	
	void showAllData() {
		for (int i = 0; i < numOfFriends; i++) {
			myFriends[i].showBasicInfo();
			System.out.println("--------------------------");
		}
	}
	
	void showAllSimpleData() {
		System.out.println("=========친구의 모든 정보를 출력합니다=========");		
		for (int i = 0; i < numOfFriends; i++) {
			myFriends[i].showData();
			System.out.println();
		}
	}

}
