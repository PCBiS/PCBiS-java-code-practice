package chapter02;

public class Ex03 {
	public static void main(String[] args) {

		int num1;
		//1. 정수형 타입의 변수 num1을 선언하자
		// 정수형 타입의 데이터 저장을 위한 메모리 공간을 num1이라는 이름으로 할당하겠다 라고 선언하는 선언문.
		// 파이썬은 변수의 자료형이 유동적이지만 자바는 명확하게 변수라는 그릇의 용도를 선언해 주어야 한다.
		// 여기서 변수의 특성을 결정 짓는 키워드를 '자료형' 이라고 한다.
		num1 = 10;
		//2. 선언된 변수인 num1에 10을 저장(대입)하자.
		System.out.println("num1 value : " + num1);
		int num2 = 20;
		//3. 정수형 타입의 변수 num2를 선언 후 20을 저장하자.
		System.out.println("num2 value : " + num2);
		int num3 = num1 + num2; 
		//4. 정수형 타입의 변수 num3을 선언하고 변수 num1, num2의 합을 num3에 저장한다.
		System.out.println("num1: " + num1 + " + num2: " + num2 + " = " + "num3: " + num3);
		//5. num3의 결과를 출력한다.
	}
}
