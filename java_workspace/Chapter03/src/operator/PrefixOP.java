package operator;

public class PrefixOP {
	//집에가기 전에 이유 스스로 풀어 써놓기
	//전위 단항 연산자 특성 - 대입하기 전에 연산 된 값을 대입함.  
	public static void main(String[] args) {
		int num1 = 7;		// 초기 값은 num = 7
		int num2 = ++num1;	// num2에 num1의 값을 대입하기 전에 1을 증가시키고 대입하였기 때문에 num1: 7, num2: 8 
		int num3 = --num1;	// num3에 num1의 값을 대입하기 전에 직전에 증가 된 값을 다시 감소시키고 대입하였기 때문에 num1: 7, num3: 7
		System.out.println("Debug!!! num1:" + num1 + " num2:" + num2 + " num3:" + num3 );
		//중간에 확인 결과 7,8,7로서 전위 단항 연산자가 작동했음을 알 수 있다.
		
		
		System.out.println(++num1); // 출력 : 8, num1을 출력하기 전 전위 연산으로 1을 증가시킨 값을 출력하였기 때문.		
		System.out.println(num2);	// 출력 : 8, num2의 현재 값.
		System.out.println(--num2); // 출력 : 7, num2를 출력 하기 전 전위연산으로 1을 감소하였기 때문.
		System.out.println(num3);	// 출력 : 7, num1이 초기 값에서 1증가된 값을 다시 감소시키고 대입한 값에서 변동이 더이상 없기 때문.		
	}
}
