package operator;

/* 
 * (num1 + =10)<0 && (num2 +=10)>0 = && 연산결과는 false, 이유는 &&(and)연산자는 둘 중 하나라도 false 이면 돌아오는 값은 false 이기 때문.
 * 					특이 한 사항은 SCE 특성상 시작부터 false 일 경우 뒤의 연산을 수행하지 않기 때문에 주의해야 함.
 * (num1 + =10)<0 || (num2 +=10)>0 = || 연산결과는 true, 이유는 ||(or)연산자는 둘 중 하나라도 true라면 돌려주는 값이 true이기 때문.
 * 					동일하게 특이한 사항으로서 시작부터 true면 뒤의 연산을 수행하지 않음으로 이 점을 주의해야 함.
*/
public class ShortCircuitEvaluation {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		boolean result;
		result = (num1 += 10) < 0 && (num2 += 10) > 0;
		System.out.println("result=" + result);
		System.out.println("num1=" + num1 + ", num2=" + num2);
		result = (num1 += 10) > 0 || (num2 += 10) > 0;
		System.out.println("result=" + result);
		System.out.println("num1=" + num1 + ", num2=" + num2);
	}

}
