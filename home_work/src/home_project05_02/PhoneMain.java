package home_project05_02;

import java.util.InputMismatchException;
import java.util.Scanner;

import home_project05_02.exception.OutOfMenuInputException;

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
		 * 0.5버전과의 차이점 
		 *  - 기존 While 문으로 무한 루프문으로 숫자가 아닐 경우 숫자를 입력 할 때 까지
		 *    계속해서 사용자에게 질문을 받는 형태였고
		 *  - 이번 버전에서는 try catch 구조로 예외처리.
		 */

		while (true) {
			main.mainMenuList();
			
			//리팩토링 포인트
			
			try {
				select = sc.nextInt();
				if (!(select>=MenuInterface.UserAddNum && select<=MenuInterface.ExitMenuNum)) {
					OutOfMenuInputException e = new OutOfMenuInputException("메뉴 선택 범위 초과 or 문자열 입력");
					throw e;
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하지 않으셨습니다. \n 메뉴를 확인 하시고 숫자를 입력해주세요.");
				continue;
			} catch (OutOfMenuInputException e) {
				System.out.println("메뉴범위를 벗어난 숫자를 입력하였습니다. \n" + 
						MenuInterface.UserAddNum + " ~ " + MenuInterface.ExitMenuNum +
						" 의 범위 내에서 입력해주십시요.");
				continue;
			} catch (Exception e) {
				System.out.println("잘못 된 입력입니다. \n 다시 입력해주세요.");
				continue;
			}finally {
				//입력 한 기존 값을 남기지 않기 위함.
				sc.nextLine();
			}
			
			switch (select) {
				case MenuInterface.UserAddNum:
					main.subMenuList();
					
					//리팩토링 포인트
					
					try {
						depthSelect = sc.nextInt();
						
						if (!(depthSelect>=AddInterface.Work && depthSelect<=AddInterface.Base)) {
							OutOfMenuInputException e = new OutOfMenuInputException("메뉴 선택 범위 초과 or 문자열 입력");
							throw e;
							}
						} catch (InputMismatchException e) {
							System.out.println("숫자를 입력하지 않으셨습니다. \n 메뉴를 확인 하시고 숫자를 입력해주세요.");
							continue;
						} catch (OutOfMenuInputException e) {
							System.out.println("메뉴범위를 벗어난 숫자를 입력하였습니다. \n" + 
									AddInterface.Work + " ~ " + AddInterface.Base +
									" 의 범위 내에서 입력해주십시요.");
							continue;
						} catch (Exception e) {
							System.out.println("잘못 된 입력입니다. \n 다시 입력해주세요.");
							continue;
						}finally {
							//입력 한 기존 값을 남기지 않기 위함.
							sc.nextLine();
						}
	
					
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
						}
						break;
			
				case MenuInterface.UserListViewNum:
					main.viewMenuList();				
					
					//리팩토링 포인트
					depthSelect = sc.nextInt();
				
					switch (depthSelect) {
					case 1:
						ci.showList(depthSelect);
						break;
					case 2:
						ci.showList(depthSelect);
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
