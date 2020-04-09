package chapter02;

public class Ex07_CastingOperation {
	public static void main(String[] args) {
		char ch1='A'; // 문자타입의 변수 ch1 선언 후 'A' 라는 문자를 ch1에 대입
		char ch2='Z'; 

		int num1=ch1; // ch1의 값 'A'를 num1에 대입
		int num2=(int)ch2; // 대입 과정은 같으나 ch2 'Z'를 명시적으로 형변환을 선언.
		
		System.out.println("문자 A의 유니코드 값: "+num1); // 10진수 65, 16진수 0041 
		System.out.println("문자 Z의 유니코드 값: "+num2);	// 10진수 90 16진수 005A
	}
}
