package home_project03_02;

import java.util.Scanner;

public class PhoneBookManager {
	Scanner sc;
	final Phoneinfor[] pBooks;
	 /* 
	  * int cnt : 입력된 친구의 정보 개수를 세기 위한 변수.
	  * 용도
	  * 	1. 참조 할 때 반복을 몇번 할 지에 대한 지표. (저장되있는 개수와 배열의 전체 개수는 별개 이야기)
	  * 	2. 새로운 객체를 저장 할 때의 index 지표로 사용이 가능.
	  */ 
	int cnt;
	
	public PhoneBookManager() { // 배열은 가급적 생성자에서 초기화 하는게 일반적.
		pBooks = new Phoneinfor[100]; // Phoneinfor 타입의 배열 100개 생성 (값은 모두 Null)
		cnt = 0;
		sc = new Scanner(System.in);
	}	
	
	/* 
	 * 저장 : 이름, 전화번호, 생년월일 정보를 대상으로 하는 저장.
	 * 			배열에 PhoneInfor 타입의 참조 값을 저장.
	 */
	void AddInfo(Phoneinfor info) {
		pBooks[cnt++] = info;	//배열에 요소를 대입 하면서 cnt값을 후위증가		
	}
	
	void AddInfo() {
		pBooks[cnt++] = createInstance();	//배열에 요소를 대입.		
	}
	
	// 전체 리스트 출력
	void showAllData() {
		for (int i = 0; i < cnt; i++) {
			pBooks[i].showInfo();
		} 
	}
	
	
	/*
	 * 검색 : 이름을 기준으로 데이터를 찾아서 해당 데이터의 정보를 출력. 
	 * 배열의 요소(PhoneInfor)의 name 속성값으로 배열의 요소를 찾는 것.
	 */
	void showSearchInfo() {
		System.out.println("검색 하고자 하는 이름을 입력해주세요.");
		System.out.println("=====================================");
		String name = sc.nextLine(); // 사용자가 입력한 이름으로 배열에서 요소를 검색.
		int searchIndex = -1;
		for (int i = 0; i < cnt; i++) {
			searchIndex = searchIndex(name);
		}
		if (searchIndex<0) { // 만약 검색한 결과와 일치하는 i값이 없으면 searchIndex 는 -1 이 유지되니
			System.out.println("검색한 이름과 일치하는 자료가 없습니다.");
		}else {
			pBooks[searchIndex].showInfo(); // 일치한다면 searchIndex에 i값(해당하는 index)이 대입되었을 테니
		}
	}
	
	/*
	 * 삭제 : 이름을 기준으로 데이터를 찾아서 해당 데이터를 삭제.
	 * 데이터 삭제 후 남아있는 데이터 처리는 데이터의 빈공간이 없도록 순차적으로 자료구조를 유지하도록 설계
	 *   
	 */
	
	void delInfo() { // 기본적인 로직은 Search와 유사
		System.out.println("삭제 하고자 하는 이름을 입력해주세요.");
		System.out.println("=====================================");
		String name = sc.nextLine(); // 사용자가 입력한 이름으로 배열에서 요소를 검색.
		int searchIndex = -1;
		for (int i = 0; i < cnt; i++) {
			searchIndex = searchIndex(name);
		}
		if (searchIndex<0) { 
			  System.out.println("검색한 이름과 일치하는 자료가 없습니다.");
		}else {
			//삭제 : 검색한 index 부터 저장된 위치까지 왼쪽으로 shift 작업을 진행.
			for (int i = searchIndex; i < cnt-1; i++) { 
				// i는 검색된 값부터. index(cnt)값 -1 까지 1씩 증가시켜 나가며 반복한다
				pBooks[i] = pBooks[i+1];
				//pBooks[i]번의 정보를 pBooks[i+1](한칸 위에 있는 정보)로 대체해나간다.
				//for문에서 cnt-1 이 아닌 cnt값을 하면 null값을 찾기 때문에 에러남.
			}
			cnt--; // 이거 처리 안하면 향후 로직 꼬임(null값 찾게 됨)
			System.out.println("삭제 완료 하였습니다.");
		}
	}
	
	//공통코드 searchIndex를 기능화 한다.
	int searchIndex(String name) {
		int searchIdx = -1;
		for (int i = 0; i < cnt; i++) {
			if (pBooks[i].checkName(name)) {
				searchIdx = i;
				break;
			}
		}
		return searchIdx;           
	}
	
	// 사용자의 입력데이터로 PhoneInfo 객체를 생성하는 기능.
	Phoneinfor createInstance() {
		Phoneinfor info = null; // 아무것도 없는 Phoneinfor 타입의 자료형을 생성사여 info에 대입.
		System.out.println("친구의 데이터 정보를 저장하기 위해 입력합니다.");
		
		System.out.println("이름을 입력해주세요. >> ");
		String name = sc.nextLine();
		
		System.out.println("전화번호를 입력해주세요. >> ");
		String phoneNumber = sc.nextLine();
		
		System.out.println("생년월일을 입력해주세요. >> ");
		String birthDay = sc.nextLine();
		
		//사용자의 입력데이터에 따라 인스턴스 생성방법을 구분해야 한다 .
		// .trim (입력받은 문자열의 공백을 제거.)
		if (birthDay==null||birthDay.trim().isEmpty()) {
			info = new Phoneinfor(name, phoneNumber);
		}else {
			info = new Phoneinfor(name, phoneNumber, birthDay);
		}
		return info;
	}
	
}
