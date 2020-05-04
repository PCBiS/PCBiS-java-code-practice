package chapter02;

public class Ex07_Casting02 {
	public static void main(String[] args) {
		byte b = 10; // 10이라는 값을 b(byte)형에 대입
		int i = (int)b; // 대입한 b(byte) 10 을 int로 형변환 하여 i(int)에 대입.
		System.out.println("b=" + b); // b = 10(byte)
		System.out.println("i=" + i); // i = 10(int)
		
		int i2 = 300; //300이라는 값을 i2(int)형에 대입
		byte b2 = (byte)i2; // i2(int)를 byte형으로 치환하여 b2(byte)에 대입
		System.out.println("i2=" + i2); // int 타입으로는 문제가 없으나
		System.out.println("b2=" + b2); // byte 타입으로는 음수 -128 to 양수 +127 까지 저장 가능하기 때문에 
										// byte타입으로 담을 수 없는 overflow 된 값은 짤림.
		
	}
}

// int타입의 10진수 to 2진수 1 0010 1100 치환 결과
// byte 타입은 1바이트 = 8bit
// 1비트는 양수/음수 값을 판별.
// byte 타입으로 2진수값을 변환 시 1010 1100 이 됨 맨 앞의 1은 양/음수 패리티코드.
// byte 타입의 양수 최대치의 2진수 값은 1111 1111