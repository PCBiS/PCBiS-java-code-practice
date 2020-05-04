package flow_control;

public class CondOp {
	public static void main(String[] args) {
		int num1 = 100, num2 = 50; // 숫자 두개를 받는다
		int bigNum, diffNum; // 큰 수와 차이의 값을 저장하는 변수

		bigNum = (num1 > num2) ? num1 : num2;
		// num1이 2보다 크면 bigNum에 num1을, 아니면 num2를 대입
		diffNum = (num1 > num2) ? num1 - num2 : num2 - num1;
		// num1이 2보다 크면 diffNum에 num1에서 2를 뺀 값을, 아니면 2에서 1을 뺀 값을 대입
		// diffNum에서 음수가 안나오게 하기 위한 로직은 Math.abs로 절대값 나오게 처리 가능.

		System.out.println("큰 수: " + bigNum + " 숫자간 차이: " + Math.abs(diffNum));

	}
}
