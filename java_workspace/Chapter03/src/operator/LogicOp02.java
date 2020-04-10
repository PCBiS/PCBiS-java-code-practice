package operator;

public class LogicOp02 {
	public static void main(String[] args) {
		int num1, num2;
		num1 = 10;
		num2 = 20;
		
		boolean check1 = num1 > num2; // num1이 num2보다 큰가? -> 결과값을 check1(boolean)에 대입
		System.out.println("DEBUG!!!! check1's Value : " + check1); // 확인결과 false
		boolean check2 = num1 == num2; // num1이 num2와 값(value)이 같은가? -> 결과를 check2(boolean)에 대입
		System.out.println("DEBUG!!!! check2's Value : " + check2); // 확인결과 false
		
		System.out.println("------------------------------------");
		if(check1) { // 만약 check가 true면
			System.out.println("num1의 값이 num2의 값보다 큽니다.");
		}else { // 만약 check가 false 라면
			System.out.println("num1의 값이 num2의 값보다 작습니다.");
		} // 그 결과 출력 된 값음 false 임으로 else 문의 결과가 출력되어야 함.
		
		System.out.println("------------------------------------");
		if(check2) { //이하 상동
			System.out.println("num1의 값과 num2의 값은 같습니다.");
		} else {
			System.out.println("num1의 값과 num2의 값은 같지 않습니다.");
		} // 의 결과로 false임으로 else문의 결과가 출력 됨.
		System.out.println("------------------------------------");
		
		//성인		- 조건01
		//여성 		- 조건02
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
			System.out.println("메세지 발송 대상이 아닙니다."); // 만약 한 조건이라도 false 라면 발송 대상이 아니라고 출력한다.
		}
		
		
		
		
	}	
}
