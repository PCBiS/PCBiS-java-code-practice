package operator;

/* 
 * (num1 + =10)<0 && (num2 +=10)>0 = && 연산결과는 false, 이유는 &&(and)연산자는 둘 중 하나라도 false 이면 돌아오는 값은 false 이기 때문.
 * 					특이 한 사항은 시작부터 false 일 경우 결과가 확실하게 이미 예측이 되어버린 상황에서는 뒤의 연산을 수행하지 않기 때문에 주의해야 함.
 * 					이를 Short Circuit Evaluation(단축 평가, 혹은 단락 평가, 최소 평가 등으로 불림)이라고 한다.
 * (num1 + =10)<0 || (num2 +=10)>0 = || 연산결과는 true, 이유는 ||(or)연산자는 둘 중 하나라도 true라면 돌려주는 값이 true이기 때문.
 * 					동일하게 특이한 사항으로서 시작부터 true면 뒤의 연산을 수행하지 않음으로 이 점을 주의해야 함.
 * 
 * 논리 연산자는 이항 연산자(복합 대입 연산자)보다 우선순위가 낮고 괄호는 그 어떤 연산보다 우선순위를 지니기 때문에
 * 괄호 안의 복합 대입 연산자를 우선 연산 하고 논리연산을 수행 한다. 
*/
public class ShortCircuitEvaluation {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0; // num1과 num2를 int 타입의 변수로 선언하고 기본 값을 0으로 초기화 함.
		boolean result; // result라는 boolean 타입 변수를 선언 함.
		
		result = (num1 += 10) < 0 && (num2 += 10) > 0;
		//result = (num1 += 10) > 0 && (num2 += 10) > 0;
		
		/* result = 10 < 0 && 10 > 0 
		 * num1(10)보다 0이 작다 = false && num2(10)은 0보다 크다 == true 
		 * 논리연산자 false && true 는 false 다. 
		 */
		
		System.out.println("result=" + result); // result = false
		System.out.println("num1=" + num1 + ", num2=" + num2); 
		// num2가 0인 이유는 이미 단축평가가 이루어져서 추가적 연산을 수행 할 필요가 없기 때문에 num2 = 0이다.  
		
		result = (num1 += 10) < 0 || (num2 += 10) > 0;
		//result = (num1 += 10) > 0 || (num2 += 10) > 0;
		System.out.println("result=" + result);
		System.out.println("num1=" + num1 + ", num2=" + num2);
		/* 
		 * 반대로 num2가 10인 이유는 ||(or) 연산은 둘 중 하나만 true이면 true 인데 num1이 false 이기 때문에
		 * 후순위 연산을 추가 수행할 필요가 있다.
		 */ 
	}

}
