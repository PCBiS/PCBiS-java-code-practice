package operator;

public class PrefixOP_PostfixOP {
	public static void main(String[] args) {
		PrefixOP();
		PostfixOP();
		System.out.println("1"+1.1f); // 자바스크립트도 이 지랄이라니 슬프다...
		
		
	}

	public static void PrefixOP() {
		int num1 = 7;		
		int num2, num3;
		
		num2 = ++num1; // 전위형 증가연산을 했기 때문에 num2에 num1에서 1을 증가한 값을 대입시킨다.
		num3 = --num1; // 전위형 감소연산을 했기 때문에 num2에 num1에서 1을 감소시킨 값을 대입한다.
		System.out.println("PrefixOP");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}

	public static void PostfixOP() {
		int num1 = 7;
		int num2, num3;
		
		num2 = num1++; //후위형 증가연산을 했기 때문에 num2에 먼저 값을 대입하고 num1에 1을 증가시킨다.
		num3 = num1--; //후위형 감소연산을 했기 때문에 먼저 한 연산의 영향에 의하여
					   //num1에 num1의 증가 된 값을 대입되어있고 대입 이후 num1에 1을 감소시킨 값을 출력한다.
		System.out.println("PostfixOP");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}
}
