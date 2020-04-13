package flow_control;

public class Switch_Case {
	public static void main(String[] args) {
		int menuNum = 1;

		switch (menuNum) {
		case 1:
			System.out.println("1. Simple Java");
		case 2:
			System.out.println("2. Funny Java");
		case 3:
			System.out.println("3. Fanstic Java");
		default: 
			// 생략이 가능함, 위의 case 문의 조건을 만족하지 못한 값, 3이상이 들어오면 기본으로 출력.
			System.out.println("d. The best programming language");			
		}
		
		System.out.println("Do you like coffee?");
		
		
	}
}
