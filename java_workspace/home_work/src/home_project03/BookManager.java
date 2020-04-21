package home_project03;

import java.util.Scanner;

public class BookManager {
	private PhoneBook[] book = new PhoneBook[100];
	private int idx = 0;
	
	private void BookManager() {} // 싱글톤 타입으로 사용자 추가 기능을 만든다.	
	private static BookManager mgr = new BookManager();	
	public static BookManager getInstance() {
		return mgr;
	}
	
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
	
	void UserAdd() {
		System.out.println("안녕하세요, 전화번호 등록 기능입니다.");
		System.out.println("만약 등록 중지를 원하면 Q 를 입력하세요.");
		
		while (true) {			
			Scanner sc = new Scanner(System.in);
			String uName;
			String uPhone;
			String uBirth;
			boolean flag = false;
			
			if (idx>100) { System.out.println("저장용량이 가득찼습니다."); break; }
			while (true) {
				System.out.println("등록할 이름을 입력하세요");			
				uName = sc.next();
				if (exitCase(uName)) { flag = !false; break; } // 혹시 Q가 입력되면 외부 탈출을 위한 flag를 true로 설정하고 While 문을 벗어난다.
				if (nameCheck(uName)) { continue;} else {break;} // 이름이 입력 안되었으면 메소드에서 true를 리턴해서 Continue
			}
			if (flag) { break; }
			
			while (true) {
				System.out.println("등록할 전화번호를 입력하세요");
				uPhone = sc.next(); // 계속해서 입력받는다.
				if (exitCase(uPhone)) { flag = !false; break; } // 혹시 Q가 입력되면 외부 탈출을 위한 flag를 true로 설정하고 While 문을 벗어난다.
				if (phoneCheck(uPhone)) { continue; } else {break;}// 전화번호가 입력 안되었으면 메소드에서 true를 리턴해서 Continue
			}
			if (flag) { break; }
			
			while (true) {
				System.out.println("등록할 생년월일을 입력하세요");
				uBirth = sc.next();
				if (exitCase(uBirth)) { flag = !false; break; } // 혹시 Q가 입력되면 외부 탈출을 위한 flag를 true로 설정하고 While 문을 벗어난다.
				if (birthCheck(uBirth)) { continue; } else {break;} // 생년월일이 입력 안되었으면 메소드에서 true를 리턴해서 Continue				
			}
			if (flag) { break; }			
			
			book[idx++] = new PhoneBook(uName, uPhone, uBirth); // PhoneInfo에 직접적 액세스를 하지 않게 하고 등록하게 한다.
						
			System.out.println("정상적으로 등록 되었습니다.");
			System.out.println("====================================");			
		}		
	}
	
	void UserShow() {
		for (int j = 0; j < idx; j++) {
			book[j].showPhoneBook();
		}		
	}
	
	private boolean exitCase(String text) {
		boolean flag = false;
		if (text.equalsIgnoreCase("Q")) {
			System.out.println("등록 중지 키워드를 확인하여 등록중단합니다.");			
			flag = !false;
		}
		return flag;
	}
	
	private boolean nameCheck(String text) {
		boolean flag = false;
		if (text==""||text==null) {
			System.err.println("이름이 입력되지 않았습니다!, 이름을 입력하세요!!");
			flag = !false;
		}
		return flag;
	}
	
	private boolean phoneCheck(String text) {
		boolean flag = false;
		if (text==""||text==null) {
			System.err.println("전화번호가 입력되지 않았습니다!, 전화번호를 입력하세요!!");
			flag = !false;
		}
		return flag;
	}
	
	private boolean birthCheck(String text) {
		boolean flag = false;
		if (text==""||text==null) {
			System.err.println("생년월일이 입력되지 않았습니다!, 생년월일을 입력하세요!!");
			flag = !false;
		}
		return flag;
	}
	
}
