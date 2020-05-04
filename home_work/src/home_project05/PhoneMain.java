package home_project05;

import java.util.Scanner;

public class PhoneMain implements AddInterface, MenuInterface {

	private PhoneMain() {
	}

	private static PhoneMain main = new PhoneMain();

	public static PhoneMain getInstance() {
		return main;
	}

	public static void main(String[] args) {
		InfoControllerAbstract ci = InfoController.getInstance();
		PhoneMain main = PhoneMain.getInstance();
		Scanner sc = new Scanner(System.in);
		int select = 0;
		int depthSelect = 0;

		/*
		 * 0.4버전과의 차이점 요구사항대로 인터페이스 기반의 상수표현으로 메뉴를 구성함.
		 */

		while (true) {
			main.mainMenuList();
			// 숫자가 아니면 While 무한 반복, 숫자값이 입력되면 While문을 탈출하고 그 다음 입력받은 값을 select에 대입.
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("숫자가 아닙니다! 메뉴를 선택해주세요.");
				main.mainMenuList();
			}
			select = sc.nextInt();

			switch (select) {
			case MenuInterface.UserAddNum:
				main.subMenuList();
				// 숫자가 아니면 While 무한 반복, 숫자값이 입력되면 While문을 탈출하고 그 다음 입력받은 값을 depthSelect에 대입.
				while (!sc.hasNextInt()) {
					sc.next();
					System.out.println("숫자가 아닙니다! 메뉴를 선택해주세요.");
					main.subMenuList();
				}
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
					do {
						System.out.println("범위 외의 숫자를 입력하셨습니다.");
						System.out.println("다시 선택해주세요.");
						sc.nextLine();
						main.subMenuList();
						depthSelect = sc.nextInt();					
					} while (depthSelect<AddInterface.Work||depthSelect>AddInterface.Base);
				}
				break;
			case MenuInterface.UserListViewNum:
				main.viewMenuList();
				while (!sc.hasNextInt()) {
					sc.next();
					System.out.println("숫자가 아닙니다! 메뉴를 선택해주세요.");
					main.viewMenuList();
				}
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
				System.out.println(MenuInterface.Search + InputUserName);
				ci.infoSearch(sc.nextLine());
				break;
			case MenuInterface.UserDeleteNum:
				sc.nextLine();
				System.out.println(MenuInterface.Delete + InputUserName);
				ci.infoDelete(sc.nextLine());
				break;
			case MenuInterface.UserModifyNum:
				sc.nextLine();
				System.out.println(MenuInterface.Modify + InputUserName);
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

	void mainMenuList() {
		System.out.println(MenuInterface.FunctionNotification);
		System.out.println(MenuInterface.UserAdd);
		System.out.println(MenuInterface.UserListView);
		System.out.println(MenuInterface.UserSearch);
		System.out.println(MenuInterface.UserDelete);
		System.out.println(MenuInterface.UserModify);
		System.out.println(MenuInterface.ExitProgram);
		System.out.println(MenuInterface.Catagory);
	}

	void subMenuList() {
		System.out.println(MenuInterface.UserAdd_Catagory);
		System.out.println(MenuInterface.UserAdd_Work);
		System.out.println(MenuInterface.UserAdd_Univ);
		System.out.println(MenuInterface.UserAdd_Club);
		System.out.println(MenuInterface.UserAdd_Base);
	}

	void viewMenuList() {
		System.out.println(UserSearch_Catagory);
		System.out.println(UserSearch_Default);
		System.out.println(UserSearch_Detail);
	}
}
