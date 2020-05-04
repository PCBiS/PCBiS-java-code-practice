package home_project03;

import java.io.IOException;
import java.util.Scanner;

public class Phone {
	public static void main(String[] args) throws InterruptedException {
		boolean flag = true;
		String sel = new String();
		Scanner sc = new Scanner(System.in);
		PhoneBookManager book = new PhoneBookManager();
		
		while (flag) {
			System.out.println("안녕하세요! 휴대전화입니다.");
			System.out.println("원하시는 메뉴를 선택하세요!");
			System.out.println("============================");
			System.out.println("1. 전화번호부 명부 등록");
			System.out.println("2. 전화번호부 명부 검색");
			System.out.println("3. 전화번호부 명부 삭제");
			System.out.println("4. 전화번호부 전체 확인");			
			System.out.println("============================");
			System.out.println(" 종료는 'X' 키를 입력하세요. ");
			sel = sc.nextLine();
			switch (sel) {
				case "1":					
					for (int i = 0; i < 20; ++i) {System.out.println();}				
					book.userAdd();
					System.out.println("사용자 입력이 종료 되어 처음 메뉴로 돌아갑니다.");
					Thread.sleep(1000);
					for (int i = 0; i < 20; ++i) {System.out.println();}
					break;
					
				case "2":
					System.out.println("검색할 사용자 이름을 입력하세요.");			
					book.userSearch(sc.nextLine());
					try { System.out.println("처음 메뉴로 돌아가려면 아무 키나 입력하세요.");; System.in.read(); } 
					catch (IOException e) { e.printStackTrace(); }
					for (int i = 0; i < 20; ++i) {System.out.println();}				
					break;
					
				case "3":
					System.out.println("삭제할 사용자 이름을 입력하세요.");
					book.userDelete(sc.nextLine());					
					try { System.out.println("처음 메뉴로 돌아가려면 아무 키나 입력하세요.");; System.in.read(); } 
					catch (IOException e) { e.printStackTrace(); }
					for (int i = 0; i < 20; ++i) {System.out.println();}				
					break;
					
				case "4":
					System.out.println("보유한 사용자 명단을 전부 출력합니다.");
					book.userAllShow();
					try { System.out.println("처음 메뉴로 돌아가려면 아무 키나 입력하세요.");; System.in.read(); } 
					catch (IOException e) { e.printStackTrace(); }
					for (int i = 0; i < 20; ++i) {System.out.println();}
					break;
					
				case "x":				
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
					break;
			}			
			System.exit(0);
		}
	}
}