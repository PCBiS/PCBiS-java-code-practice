package friend;

import java.util.Scanner;

public class FriendMain {
	public static void main(String[] args) {
		FriendInfoHandler fih = new FriendInfoHandler(20);
		Scanner sc = new Scanner(System.in);
		int select;
		
		while (true) {
			System.out.println("*** 메뉴 선택 ***");
			System.out.println("1. 고교 친구 저장");
			System.out.println("2. 대학 친구 저장");
			System.out.println("3. 전체 정보 출력");
			System.out.println("4. 기본 정보 출력");
			System.out.println("5.  프로그램 종료");
			System.out.println("*****************");
			System.out.print("선택 >> ");
			
			select = fih.sc.nextInt();
					 fih.sc.nextLine();
			
			switch (select) {
			case 1: case 2:
				fih.addFriend(select);
				break;
			case 3:
				fih.showAllSimpleData();
				break;
			case 4:
				fih.showAllData();
				break;
			case 5:
				System.out.println("프로그램을 종료 합니다.");
				sc.close();
				System.exit(0);				
			}			
		}
	}
}
