package friend;

import java.util.Scanner;

public class FriendMain implements FriendInterface {
	public static void main(String[] args) {
		FriendInfoHandler fih = FriendInfoHandler.getInstance();
		Scanner sc = new Scanner(System.in);
		int select;
		
		while (true) {
			System.out.println("*** 메뉴 선택 ***");
			System.out.println(" " + INSERT_HIGH + ". 고교 친구 저장");
			System.out.println(" " + INSERT_UNIV + ". 대학 친구 저장");
			System.out.println(" " + PRINT_ALL + ". 전체 정보 출력");
			System.out.println(" " + PRINT_DEF + ". 기본 정보 출력");
			System.out.println(" " + EXIT +".  프로그램 종료");
			System.out.println("*****************");
			System.out.print("선택 >> ");
			
			select = fih.sc.nextInt();
					 fih.sc.nextLine();
			
			switch (select) {
			case INSERT_HIGH: case INSERT_UNIV:
				fih.addFriend(select);
				break;
			case PRINT_ALL:
				fih.showAllSimpleData();
				break;
			case PRINT_DEF:
				fih.showAllData();
				break;
			case EXIT:
				System.out.println("프로그램을 종료 합니다.");
				sc.close();
				System.exit(0);				
			}			
		}
	}
}
