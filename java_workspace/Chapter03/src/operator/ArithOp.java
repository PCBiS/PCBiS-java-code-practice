package operator;

public class ArithOp {
	public static void main(String[] args) {
		// 1. 숫자 두개를 받는다 -> 변수 선언을 해서
		int num1,num2,result; //정수 값을 담을 num1, num2와 결과값을 담을 result를 변수선언한다.
		num1 = 10; // num1은 10이라고 선언
		num2 = 3; // num2는 3이라고 선언
		
		// 2. 덧셈연산을 수행한다 -> 그 결과를 출력하자
		result = num1 + num2; // num1 + num2 의 결과를 result에 대입한다.
		System.out.println("num1 + num2 = " + result); // 대입한 결과를 출력한다.
		
		// 3. 뺄셈연산을 수행한다 -> 그 결과를 출력하자.
		result = num1 - num2; 
		System.out.println("num1 - num2 = " + result); // 좌항의 숫자(num1, 10)을 우항의 숫자(num2, 3)을 뺐기 때문에 7이 되었다.
		
		// 4. 곱연산을 수행한다 -> 그 결과를 출력하자.
		result = num1 * num2;
		System.out.println("num1 * num2 = " + result); // 두 숫자를 곱했기 때문에 30이 나온다.
		
		// 5. 나누기 연산을 수행한다 -> 그 결과를 출력하자.
		result = num1 / num2;
		System.out.println("num1 / num2 = " + result); // 좌항의 숫자(num1, 10)을 우항의 숫자(num2, 3)을 나누었기 때문에 3이 되었다.
		
		// 6. 나누어서 몪을 구한다 -> 그 결과를 출력한다.
		result = num1 % num2;
		System.out.println("num1 % num2 = " + result); // 좌항의 숫자(num1, 10)을 우항의 숫자(num2, 3)을 나눈 나머지를 확인한 결과 1이 되었다.
	}
}
