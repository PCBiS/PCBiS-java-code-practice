package operator;

public class DivOpnd {
	public static void main(String[] args) {
		int num1, num2;
		num1 = 7;
		num2 = 3;
		
		System.out.println("정수형 나눗셈: " + num1 / num2); // int / int를 나누기 때문에 실수 부분은 버려지기 때문에 표현 가능한 부분은 정수까지.
		
		System.out.println("실수형 나눗셈: " + num1 / 3f);	
		System.out.println("실수형 나눗셈: " + 7f / 3f); // float / float 를 나누기 때문에 실수가 표현이 가능해져서 2.333333으로 진행된다,
															 // 다만 자바의 실수연산은 정확하지 않다. (float : 실수 6자리까지, double : 실수 12자리까지)
		System.out.println("형 변환 나눗셈: " + (float)num1 / num2); // num1에 대해 타입을 정수 -> 실수로 변환한다. num2도 동일한 과정을 수행하기 때문에 
																	 // 실수형 나눗셈 결과와 동일한 결과를 얻게 됨.
	}
}
