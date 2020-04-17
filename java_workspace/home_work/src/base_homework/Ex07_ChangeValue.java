package base_homework;

public class Ex07_ChangeValue {
	public static void main(String[] args) {
		int a = 10, b = 3, c;

		// 방법 1 : 임시변수를 이용하는 방법
		System.out.println("a : " + a + " b : " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("1. a : " + a + " b : " + b);

		// 방법 2 : xor 연산을 이용하는 방법;
		a = a ^ b; // 1 : 1010(10) ^ 0011(3) = 1001(9)	xor 연산은 이진수 레벨에서 1+1 = 0이 되고 1+0 = 1 이된다.
		b = a ^ b; // 2 : 1001( 9) ^ 0011(3) = 1010(10)	올림이 없이 나머지는 소멸하기 때문에 비트 연산단위로 보면
		a = a ^ b; // 3 : 1010(10) ^ 1001(9) = 0011(3)	옆과 같은 연산과정이 일어난다.
		System.out.println("2. a : " + a + " b : " + b); // 결과적으로 10진수 단에서는 동일한 값이 리턴된다.
		// 감상평 : 남들과 같이 검증해야 하는 코드에선 쓸 방법이 못되는 것 같다.
	}
}
