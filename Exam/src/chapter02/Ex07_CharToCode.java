package chapter02;

public class Ex07_CharToCode {

	public static void main(String[] args) {
		char ch = 'A'; // char ch = '\u0041';로 바꿔 써도 같다. 
		int code = (int)ch; // ch에 저장된 값을 int형으로 변환하여 저장한다.
							// 'A'를 ch에 대입 후, code(int)에 다시 재대입한다.
		
		System.out.println(ch);
		System.out.println(code); 
	}

}
