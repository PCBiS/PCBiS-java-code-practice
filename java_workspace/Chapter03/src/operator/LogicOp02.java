package operator;

public class LogicOp02 {
	public static void main(String[] args) {
		int num1, num2;
		num1 = 10;
		num2 = 20;
		
		boolean check1 = num1 > num2;
		System.out.println("DEBUG!!!! check1's Value : " + check1);
		boolean check2 = num1 == num2;
		System.out.println("DEBUG!!!! check2's Value : " + check2);
		
		System.out.println("------------------------------------");
		if(check1) {
			System.out.println("num1의 값이 num2의 값보다 큽니다.");
		}else {
			System.out.println("num1의 값이 num2의 값보다 작습니다.");
		}
		
		System.out.println("------------------------------------");
		if(check2) {
			System.out.println("num1의 값과 num2의 값은 같습니다.");
		} else {
			System.out.println("num1의 값과 num2의 값은 같지 않습니다.");
		}
		System.out.println("------------------------------------");
		
		//성인		- 조건01
		//여성중	- 조건02
		//기혼자	- 조건03
		//       에게만 메세지를 출력합니다. - 모두 true 일 때만 조건을 실행한다.
		
		int age = 20;
		char gender = 'w';
		//char gender = 'm';
		boolean mCheck = true;
		boolean result = age>19 && gender == 'w' && mCheck == true; 
		// 나이가 19세 이상인가, 성별이 여성(이라는 기호문자의 유니코드 값이 일치하는가)인가, 기혼자여부(mCheck)가 true인가
		// 위 3가지 조건을 모두 &&(and) 식으로 모두 true 일 때만
		if (result) {
			System.out.println("메세지를 발송합니다."); // 모두 true 일 때만 메세지를 발송한다.
		}else {
			System.out.println("메세지 발송 대상이 아닙니다."); // 만약 한조건이라도 false 라면 발송 대상이 아니라고 출력한다.
		}
		
		
		
		
	}	
}
