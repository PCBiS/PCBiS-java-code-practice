package operator;

public class LogicOp {
	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		boolean result1 = (num1 == 10 && num2 == 20); // 관계연산자 먼저 수행 후 논리연산자 비교 한 값을 boolean result1에 대입.
													  // num1 == 10과 같은가? num2 == 20과 같은가? 를 먼저 비교 한 후 && 둘다 참이면 그 결과를 대입.
		boolean result2 = (num1 <= 12 || num2 >= 30); // num1 <= 12보다 크거나 같은가? = false , num2는 30보다 작거나 같은가? = true 의 결과중 || 둘 중 하나라도 참이면 결과는 참.
		
		System.out.println("num1==10 그리고 num2==20: " + result1); // 결과적으로 num1 = true, num2 = true 논리연산자 &&(and) 판단결과 true
		System.out.println("num1<=12 또는 num2>=30: " + result2); // num1 = false, num2 = true 논리연산자 ||(or) 판단결과 true = 이유는 num2가 true기 때문.
		if (!(num1 == num2)) // num1 과 num2가 같은지 확인을 먼저 한 뒤, 같지 않다라고 논리 부정을 했다 -> 결과적으로 num1 != num2
		//if (num1 != num2)
			System.out.println("num1과 num2는 같지 않다.");
		else
			System.out.println("num1과 num2는 같다.");
	}

}
