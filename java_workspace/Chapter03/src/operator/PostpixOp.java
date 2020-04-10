package operator;

public class PostpixOp {
	//집에가기 전에 이유 스스로 풀어 써놓기
	//후위 단항 연산자 특성 - 값을 대입 한 후 연산함.
	public static void main(String[] args) {
		int num1= 7;		// 초기 값은 num = 7
		int num2 = num1++;	// num2에 num1의 값, 7을 대입 한 후 num1에 값을 증가시킴. - num2 : 7, num1 : 8
		int num3 = num1--;	// num3에 num1의 값, 초기 값에서 1이 증가 된 값 8을 num3에 대입 후 num1의 값을 감소시킴 
		System.out.println("Debug!!! num1:" + num1 + " num2:" + num2 + " num3:" + num3 );
		//출력 직전 최종 값. num1 : 7, num2 : 7, num3 : 8
		
		
		System.out.println("num1 :" + num1++); // 출력 : 7, 이유는 후위연산자이기 떄문에 출력 직전 최종 값이 7인상대로 출력 한 뒤 그 다음 1을 증가했기 때문.
		System.out.println("num1 :" + num1); // 출력 : 8, num1의 후위 연산이 된 결과물.
		System.out.println("num2 :" + num2--); // 출력 : 7, 이유는 후위연산자이기 떄문에 출력 직전 최종 값이 7인상대로 출력 한 뒤 그 다음 1을 감소했기 때문.
		System.out.println("num2 :" + num2);	// 출력 : 6, num2의 후위 연산이 된 결과물
		System.out.println("num3 :" + num3);	// 출력 : 8, num1의 증가 된 값을 대입 받은 값.
		
	}
}
