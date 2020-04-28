package home_project05;

import java.util.Scanner;

public class PhoneMain implements AddInterface, MenuInterface {	
	public static void main(String[] args) {
		/*
		 * 0.4버전과의 차이점
		 * 	요구사항대로 인터페이스 기반의 상수표현으로 메뉴를 구성함.
		 */
		
		InfoControllerAbstract ci = InfoController.getInstance();		
		Scanner sc = new Scanner(System.in);
		int select = 0;
		int depthSelect = 0;
		
		while (true) {
			System.out.println(MenuInterface.FunctionNotification);
			System.out.println(MenuInterface.UserAdd);			
			System.out.println(MenuInterface.UserListView);			
			System.out.println(MenuInterface.UserSearch);
			System.out.println(MenuInterface.UserDelete);
			System.out.println(MenuInterface.UserModify);
			System.out.println(MenuInterface.ExitProgram);
			select = sc.nextInt();
			
			switch (select) {
			case MenuInterface.UserAddNum:
				System.out.println(MenuInterface.UserAdd_Catagory);
				System.out.println(UserAdd_Work);
				System.out.println(UserAdd_Univ);				
				System.out.println(UserAdd_Club);
				System.out.println(UserAdd_Base);
				depthSelect = sc.nextInt();
				switch (depthSelect) {
					case AddInterface.Work:
						ci.addInfo(depthSelect);
						break;
					case AddInterface.Univ:
						ci.addInfo(depthSelect);
						break;
					case AddInterface.Club:
						ci.addInfo(depthSelect);
						break;
					case AddInterface.Base:
						ci.addInfo(depthSelect);
						break;
					default:
						System.out.println("입력을 취소합니다.");
						break;
					}
				break;
			case MenuInterface.UserListViewNum:
				System.out.println(UserSearch_Catagory);
				System.out.println(UserSearch_Default);
				System.out.println(UserSearch_Detail);
				depthSelect = sc.nextInt();
				switch (depthSelect) {
					case 1:
						ci.showList(depthSelect);					
						break;
					case 2:
						ci.showList(depthSelect);
						break;
					default:
						System.out.println("입력을 취소합니다.");
						break;
				}
				break;
			case MenuInterface.UserSearchNum:
				sc.nextLine();
				System.out.println(MenuInterface.Search+InputUserName);			
				ci.infoSearch(sc.nextLine());
				break;
			case MenuInterface.UserDeleteNum:
				sc.nextLine();
				System.out.println(MenuInterface.Delete+InputUserName);
				ci.infoDelete(sc.nextLine());
				break;
			case MenuInterface.UserModifyNum:
				sc.nextLine();
				System.out.println(MenuInterface.Modify+InputUserName);
				ci.infoModify(sc.nextLine());
				break;
			case MenuInterface.ExitMenuNum:
				System.out.println("프로그램을 종료 합니다.");
				sc.close();
				System.exit(0);				
			default:
				System.out.println(MenuInterface.WrongChoice);
				break;
			}
		}
	}
}
