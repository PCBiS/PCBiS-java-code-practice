package operator;

public class PostpixOp {
	//집에가기 전에 이유 스스로 풀어 써놓기
	//후위 단항 연산자 특성 - 값을 대입 한 후 연산함.
	public static void main(String[] args) {
		int num1= 7;		// 초기 값은 num = 7
		int num2 = num1++;	// 
		int num3 = num1--;	// 
		
		System.out.println(num1++); // 출력 : 7,
		System.out.println(num2);	// 출력 : 7, 
		System.out.println(num2--); // 출력 : 7,
		System.out.println(num3);	// 출력 : 8,
		
	}
}
