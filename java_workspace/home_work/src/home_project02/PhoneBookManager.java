package home_project02;

import java.util.Scanner;

/*
 * 전화번호 정보를 저장하는 기능만을 포함하는 클래스
 * 
 * 1. 사용자로부터 데이터를 받아서 인스턴스를 생성
 */

public class PhoneBookManager {
	Scanner sc = new Scanner(System.in);
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
