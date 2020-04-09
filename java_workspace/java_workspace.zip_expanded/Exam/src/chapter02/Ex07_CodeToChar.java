package chapter02;

public class Ex07_CodeToChar {
	public static void main(String[] args) {
		int code = 65; // 또는 int code = 0x0041;
		char ch = (char)code; // code(int) 의 값 65를 ch에 재대입한다.
		
		System.out.println(code);
		System.out.println(ch);	// 대입된 유니코드 값은 'A'
	}
}
