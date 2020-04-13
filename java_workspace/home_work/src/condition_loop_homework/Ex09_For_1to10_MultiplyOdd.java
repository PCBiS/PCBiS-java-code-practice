package condition_loop_homework;

public class Ex09_For_1to10_MultiplyOdd {
	public static void main(String[] args) {
		int sum = 1; // 초기값이 0이면 뭘 곱해도 0으로 리턴되기에 초기 1 * 1의 값은 사용자가 입력해준다.
		for (int i = 2; i < 11; i++) { // 1*1의 값은 구했기 때문에 2 to 10까지를 곱한다.
			sum *= i; // i 값을 sum에 곱연산 대입 한다.
		}
		System.out.println(sum); // 결과값을 출력한다.
				
	}
}
