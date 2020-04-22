package home_project03;

import java.util.Scanner;

public class PhoneInterface {
	public static void main(String[] args) throws InterruptedException {
		PhoneBookManager book = new PhoneBookManager();
		Scanner sc = new Scanner(System.in);
		String sel = new String();
		boolean flag = true;
		
		while (flag) {
			System.out.println("안녕하세요! 휴대전화입니다.");
			System.out.println("============================");
			System.out.println("원하시는 메뉴를 선택하세요!");
			System.out.println(" 종료는 'X' 키를 입력하세요. ");
			sel = sc.next();
			switch (sel) {
			case "1":
				Thread.sleep(1000);
				for (int i = 0; i < 20; ++i) {System.out.println();}				
				book.UserAdd();
				System.out.println("사용자 입력이 종료 되어 처음 메뉴로 돌아갑니다.");
				Thread.sleep(1000);
				for (int i = 0; i < 20; ++i) {System.out.println();}
				continue;
			case "2":
				book.UserAllShow();
				System.out.println("사용자 입력이 종료 되어 처음 메뉴로 돌아갑니다.");
				Thread.sleep(5000);
				for (int i = 0; i < 20; ++i) {System.out.println();}				
				continue;
			case "3":
				System.out.println("검색할 사용자 이름을 입력하세요.");				
				book.UserSearch(sc.next());
				Thread.sleep(1000);
				for (int i = 0; i < 20; ++i) {System.out.println();}				
				continue;
			case "4":
				
				continue;
			case "x":				
				System.out.println("X 키를 입력받아서 폰 프로그램을 종료합니다.");
				flag = !true;
				Thread.sleep(1000);
				for (int i = 0; i < 20; ++i) {System.out.println();}
				break;
			case "X":
				System.out.println("X 키를 입력받아서 폰 프로그램을 종료합니다.");
				flag = !true;
				Thread.sleep(1000);
				for (int i = 0; i < 20; ++i) {System.out.println();}
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("기능을 다시 선택하시거나, x키를 입력하여 종료해주세요.");
				Thread.sleep(1000);
				for (int i = 0; i < 20; ++i) {System.out.println();}
				continue;
			}		
			
		}
	}
}
