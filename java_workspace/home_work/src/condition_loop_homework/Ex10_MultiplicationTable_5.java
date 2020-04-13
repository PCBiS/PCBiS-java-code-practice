package condition_loop_homework;

public class Ex10_MultiplicationTable_5 {
	public static void main(String[] args) {
		for (int i = 4; i < 5; i++) { 
		// 한번 수행 될 수 있도록 초기값은 4를 설정하고 i값이 1 증가한 값을 j에서 곱하게 한 뒤 외곽루프를 종료한다
			System.out.println("-----------");
			System.out.println("----5단----");
			System.out.println("-----------");
			i++;
			for (int j = 1; j < 10; j++) {
			// i는 5로 증가되어서 값이 내부루프로 넘어옴으로 1~9까지 곱연산을 출력한 뒤 내부루프를 종료한다.
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
	}
}
