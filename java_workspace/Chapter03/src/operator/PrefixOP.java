package operator;

public class PrefixOP {
	//집에가기 전에 이유 스스로 풀어 써놓기
	//전위 단항 연산자 특성 - 대입하기 전에 연산 된 값을 대입함.  
	public static void main(String[] args) {
		int num1= 7;		// 초기 값은 num = 7
		int num2 = ++num1;	// 
		int num3 = --num1;	// 
		
		System.out.println(++num1); // 출력 : 8,
		System.out.println(num2);	// 출력 : 8, 
		System.out.println(--num2); // 출력 : 7,
		System.out.println(num3);	// 출력 : 7,
		
	}
}
