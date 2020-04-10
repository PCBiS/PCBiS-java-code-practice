package operator_homework;

public class Answer02_Calc {
	public static void main(String[] args) {
		int result = ((25*5)+(36-4)-72)/5;
		/*
		 * 1. Java에서 수식에 중괄호는 사용 할 수 없음으로 모두 소괄호로 변경 함.
		 * 2. 계산순서는 좌에서 우로
		 * 3. 괄호는 좌에서 우로 이동하며 연산하는 도중 우선되어야 함으로
		 * 4. result = ((25*5)+(36-4)-72)/5
		 * 5. result = (125+32-72)/5  
		 * 6. result = 85/5 
		 * 7. result = 17
		 */
		System.out.println(result); // 최종적으로 출력되는 값은 result = 17 		
	}
}
