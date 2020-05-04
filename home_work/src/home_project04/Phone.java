package home_project04;

import java.util.Scanner;

public class Phone {	
	public static void main(String[] args) {
		InfoController infoController = new InfoController();
		Scanner sc = new Scanner(System.in);
		int select = 0;
		int depthSelect = 0;
		
		while (true) {
			System.out.println("원하는 기능을 선택하세요.");
			System.out.println("1. 사용자 추가");			
			System.out.println("2. 사용자 정보 보기");			
			System.out.println("3. 사용자 검색");
			System.out.println("4. 사용자 삭제");
			System.out.println("5. 사용자 수정");
			System.out.println("6. 프로그램 종료");
			select = sc.nextInt();
			
			switch (select) {
			case 1:
				System.out.println("등록할 카테고리를 선택하세요.");
				System.out.println("1. 직장");
				System.out.println("2. 회사");				
				System.out.println("3. 동호회");
				System.out.println("4. 기본");
				depthSelect = sc.nextInt();
				switch (depthSelect) {
					case 1:
						infoController.addInfo(depthSelect);
						break;
					case 2:
						infoController.addInfo(depthSelect);
						break;
					case 3:
						infoController.addInfo(depthSelect);
						break;
					case 4:
						infoController.addInfo(depthSelect);
						break;
					default:
						System.out.println("입력을 취소합니다.");
						break;
					}
				break;
			case 2:
				System.out.println("검색할 카테고리를 선택하세요.");
				System.out.println("1. 기본정보");
				System.out.println("2. 상세정보");
				depthSelect = sc.nextInt();
				switch (depthSelect) {
					case 1:
						infoController.showList(depthSelect);					
						break;
					case 2:
						infoController.showList(depthSelect);
						break;
					default:
						System.out.println("입력을 취소합니다.");
						break;
				}
				break;
			case 3:
				sc.nextLine();
				System.out.println("검색할 사용자의 이름을 입력해주세요.");			
				infoController.infoSearch(sc.nextLine());
				break;
			case 4:
				sc.nextLine();
				System.out.println("삭제할 사용자의 이름을 입력해주세요.");
				infoController.infoDelete(sc.nextLine());
				break;
			case 5:
				sc.nextLine();
				System.out.println("수정할 사용자의 이름을 입력해주세요.");
				infoController.infoModify(sc.nextLine());
				break;
			case 6:
				System.out.println("프로그램을 종료 합니다.");
				sc.close();
				System.exit(0);				
			default:
				System.out.println("잘못 선택 하셨습니다. 다른 번호를 입력하세요.");
				break;
			}
		}
	}
}
