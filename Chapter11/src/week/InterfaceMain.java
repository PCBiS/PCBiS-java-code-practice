package week;

import java.util.Scanner;

public class InterfaceMain {
	public static void main(String[] args) {
		System.out.println("요일을 선택 해주세요");
		System.out.println("1. 월요일");
		System.out.println("2. 화요일");
		System.out.println("3. 수요일");
		System.out.println("4. 목요일");
		System.out.println("5. 금요일");    
		System.out.println("6. 토요일");
		System.out.println("7. 일요일");
		Scanner sc = new Scanner(System.in);
		switch (sc.nextInt()) {
		case Week.MON:
			System.out.println("월요일입니다.");
			break;
		case Week.TUE:
			System.out.println("화요일입니다.");
			break;
		case Week.WED:
			System.out.println("수요일입니다.");
			break;
		case Week.THU:
			System.out.println("목요일입니다.");
			break;
		case Week.FRI:
			System.out.println("금요일입니다.");
			break;
		case Week.SAT:
			System.out.println("토요일입니다.");
			break;
		case Week.SUN:
			System.out.println("일요일입니다.");
		}
	}
}
