package home_project03_02;

import java.util.Scanner;

public class PhoneBookMain {
	public static void main(String[] args) {
		PhoneBookManager manager = new PhoneBookManager();		
		Scanner sc = new Scanner(System.in);
		int selectNum;	
		
		
		/*
		// 사용자의 입력 데이터를 인스턴스로 생성
		info = manager.createInstance();
		// 입력 데이터를 저장
		manager.AddInfo(info);
		// 입력받은 이름을 삭제.
		manager.delInfo();
		// 현재까지 저장 된 데이터를 모두 출력.
		manager.showAllData();	 
		 */
		
		while (true) {			
			
			Menu.showMenu();
			
			selectNum = sc.nextInt();
			sc.nextLine();
			
			switch (selectNum) {
			case 1:				
				manager.AddInfo();
				break;
			case 2:
				manager.showSearchInfo();
				break;
			case 3:
				manager.delInfo();
				break;
			case 4:
				manager.showAllData();
				break;
			case 5:				
				//return;
				System.exit(0);
				break;
			}				
		}
	}
}
