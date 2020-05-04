package loop_control;

public class Loop_Test {
	public static void main(String[] args) {
		// 기존방식으로 출력을 5번 하는 방법
		System.out.println('1');
		System.out.println('2');
		System.out.println('3');
		System.out.println('4');
		System.out.println('5');
		System.out.println("--------syso-------");

		// 반복문으로 출력 5번 하는 방법
		for (int i = 1; i < 6; i++) {
			System.out.println(i);
		}
		System.out.println("--------for-------");
		
		// while로 반복을 5번 하는 방법 - 1
		int i = 0;
		
		while (true) {			
			System.out.println(++i);
			if(i==5) {
				break;
			}
		}
		System.out.println("-----while01------");
		// while로 반복을 5번 하는 방법 - 2
		i = 0;
		while (i<5) {
			System.out.println(++i);			
		}
		System.out.println("-----while02------");
		
		i = 0;
		do {
			System.out.println(++i);
		} while (i<5);
		
		System.out.println("------dowhile-----");
		
		//모든 반복문 타입에서 중요한 사항 : 반복을 종료할 조건을 위해 i값을 증가시키는게 공통점인데
		//이 증가식을 정확하게 쓰지 않으면 원하지 않는 오류가 발생한다.
		
	}
}
