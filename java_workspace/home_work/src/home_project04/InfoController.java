package home_project04;

import java.io.IOException;
import java.util.Scanner;

/*
 * 컨트롤러에 필요 한 기능
 * 
 * 정보 추가. 
 * 	- 파생기능 : 정보 수정. (기본 기능 구현 후 추가 구현 예정.)
 * 기본 정보 보기.
 * 전체 정보 보기.
 * 정보 검색. (이름을 기준으로, 다만 구현 가능하다면 0.3버전과는 다른 방식을 추구)
 * 정보 삭제. (정보 검색과 동일한 로직으로.)
 * 
 */

public class InfoController {	
	PhoneInfor[] pInfo;	// PhoneInfor 클래스 형태의 배열 생성
	int pIdx;	// PhoneInfor를 통제할 기초 index 값 생성.
	Scanner sc;
	boolean flag;
	
	public InfoController() {
		this.pInfo = new PhoneInfor[100]; // 배열 크기는 100개.
		this.pIdx = 0; // 숫자는 0 to 99(100개), 이 이상 증가하려고 하면 막는 로직이 존재해야 함.
		this.sc = new Scanner(System.in); // 스캐너는 한개만 만들어서 가급적 재활용.
		this.flag = false; // While 문에서 사용 예정.
	}
	
	void showInfoList() {
		// 조상격의 공통되는 전체 정보만을 출력 한다.
		if (this.pIdx<0) {
			try {System.out.println("저장 된 정보가 없습니다. 처음으로 돌아갑니다."); 
				 System.in.read(); } 
			catch (IOException e) { 
				e.printStackTrace();}			
		}else {
			for (int i = 0; i < pIdx; i++) {
				pInfo.infoShow();
			}
		}
		
	}
		
}
