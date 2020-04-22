package home_project03;

import java.util.Scanner;

public class PhoneBookManager {
	PhoneBook[] book = new PhoneBook[100];
	private int idx = 0;
	Scanner sc = new Scanner(System.in);
		
	/*
	 * 사용자 추가 모듈 0.1 ver
	 * 스캐너로 입력받은 문자열을 조건이 맞으면 넘어가고
	 * 안맞으면 올바른 입력값을 입력 할 때 까지 무한하게 입력 받는다.
	 * 모든 조건이 성립하면 idx 증가값, uName, uPhone, uBirth 값을 
	 * 
	 * 스캐너 sc
	 * 이름 String 타입 uName
	 * 폰번호 String 타입 uPhone
	 * 생년월일 String 타입 uBirth
	 * 광역 While 문 탈출용 boolean 타입 flag
	 */
	
	void userAdd() {
		String uName, uPhone, uBirth;
		boolean flag = false;

		System.out.println("안녕하세요, 전화번호 등록 기능입니다.");
		System.out.println("만약 등록 중지를 원하면 X 를 입력하세요.");
		
		while (true) {
			
			if (idx>=100) { System.out.println("저장용량이 가득찼습니다."); break; }
			while (true) {
				System.out.println("등록할 이름을 입력하세요");			
				uName = sc.nextLine();
				if (exitCase(uName)) { flag = !false; break; } 
				// 혹시 Q가 입력되면 외부 탈출을 위한 flag를 true로 설정하고 While 문을 벗어난다.
				if (nullCheck(uName)) { continue;} else {break;}
				// 아무것도 입력 안되었으면 메소드에서 true를 리턴해서 Continue로 While문을 계속해서 반복
			}
			if (flag) { break; }
			
			while (true) {
				System.out.println("등록할 전화번호를 입력하세요");
				uPhone = sc.nextLine(); // 계속해서 입력받는다.
				if (exitCase(uPhone)) { flag = !false; break; }
				if (nullCheck(uName)) { continue;} else {break;}
			}
			if (flag) { break; }
			
			while (true) {
				System.out.println("등록할 생년월일을 입력하세요");
				uBirth = sc.nextLine();
				if (exitCase(uBirth)) { flag = !false; break; } 
				if (nullCheck(uName)) { continue;} else {break;}
			}
			if (flag) { break; }
			
			book[idx++] = new PhoneBook(uName, uPhone, uBirth); // PhoneInfo에 직접적 액세스를 하지 않게 하고 등록하게 한다.
						
			System.out.println("정상적으로 등록 되었습니다.");
			System.out.println("====================================");			
		}		
	}
		     
	/*
	 * 사용자 검색 모듈 Ver 0.1
	 * 외부에서 입력받은 이름을 기준으로 
	 * 배열의 이름값과 입력받은 값을 대조하여
	 * 일치하는 값의 book[idx]의 정보를 리턴하는 기능.
	 */	
	
	void userSearch(String name) {		
		int findIdx = -1;
		if (idx<1) {System.out.println("사용자가 아무도 등록 되어있지 않습니다!");
		}else {
			for (int j = 0; j < idx; j++) {
				findIdx = SearchIdx(name);
			}
			if (findIdx<0) {
				System.out.println("검색결과, 일치하는 이름을 찾을 수 없었습니다.");
			} else {
				System.out.println("검색결과, 일치하는 이름을 찾았습니다.");
				System.out.println("해당 사용자명에 해당하는 정보를 출력합니다.");
				System.out.println("============================================");
				book[findIdx].showPhoneBook();
			}
		}
	}
	
	/*
	 * 사용자 삭제 모듈
	 * 검색모듈과 큰 틀에서 로직은 비슷하나
	 * 사용자가 입력한 이름으로 배열에서 요소를 검색하여 
	 * 일치하는 idx값에 해당하는 참조변수를 끊는다
	 */
	
	void userDelete(String name) {		
		int findIdx = -1;
		if (idx<1) {System.out.println("사용자가 아무도 등록 되어있지 않습니다!");
		}else {			
			for (int i = 0; i < idx; i++) {
				findIdx = SearchIdx(name);
			}			
			if (findIdx<0) {
				System.out.println("검색결과, 일치하는 이름을 찾을 수 없었습니다.");
			} else {
				System.out.println("검색결과, 일치하는 이름을 찾았습니다.");
				System.out.println("해당 사용자명에 해당하는 정보를 삭제합니다.");
				System.out.println("============================================");
				for (int i = findIdx; i < idx-1; i++) {
					book[i] = book[i+1];
				}
				idx--;				
				System.out.println("일치하는 사용자를 삭제하였습니다.");
			}
		}
	}
	
	/*
	 * 사용자 전체 출력
	 * 현재까지 입력받은 사용자의 수 만큼 for문을 돌려서
	 * 사용자들을 일괄적으로 출력해준다.
	 */
	void userAllShow() {
		if (idx<1) {System.out.println("사용자가 아무도 등록 되어있지 않습니다!");
		}else {
			for (int j = 0; j < idx; j++) {
				book[j].showPhoneBook();
			}		
		}
	}
	
	
	
	
	/*
	 *  이하 내부적으로 사용되는 함수들. - 외부에는 노출이 안되도록 Private 처리 했음.
	 */
	
	
	private int SearchIdx(String name) {
		int findIdx = -1;
		for (int j = 0; j < idx; j++) {
			if (book[j].searchName(name)) {
				findIdx = j;
				break;
			}
		}
		return findIdx;
	}
	
	private boolean exitCase(String text) {
		boolean flag = false;
		if (text.equalsIgnoreCase("X")) {
			System.err.println("등록 중지 키워드를 확인하여 등록중단합니다.");			
			flag = !false;
		}
		return flag;
	}
	
	private boolean nullCheck(String text) {
		boolean flag = false;
		if (text==null||text.trim().isEmpty()) {
			System.err.println("아무것도 입력되지 않았습니다!, 입력하세요!!");
			flag = !false;
		}
		return flag;
	}	
}
