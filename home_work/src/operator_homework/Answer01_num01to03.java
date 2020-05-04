package operator_homework;

public class Answer01_num01to03 {
	public static void main(String[] args) {
		int num1, num2, num3; // 변수 num1, num2, num3을 int 자료형을 담을 수 있는 변수로 선언함
		num1 = 10; // num1은 10이라고 대입함.
		num2 = 20; // num2은 20이라고 대입함.
		num3 = 30; // num3은 30이라고 대입함.
		System.out.println("DEBUG!!!!!" + num1 + ", " + num2 + ", " + num3); // 입력한 값이 맞는지 확인 해봄
		
		num1=num2=num3;
		/*
		 * 1. 대입 전의 초기 값			    -> num1 = 10, num2 = 20, num3 = 30
		 * 2. num3 의 값 30을 num2에 대입함 -> num1 = 10, num2 = 30, num3 = 30 
		 * 3. num2 의 값 30을 num1에 대입함 -> num1 = 30, num2 = 30, num3 = 30
		 */
		
		System.out.println(num1); // 결과적으로 num1 = num3의 값을 대입한 것과 동일한 효과가 발생 함.
	}
}
