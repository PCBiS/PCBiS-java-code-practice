package flow_control;

public class IfElse {
	@SuppressWarnings("unused")
	// 이게 있으면 경고를 끄는데 그 중에서도 Dead Code(unused)에 대한 경고를 끔. 사용상 주의요망.
	
	public static void main(String[] args) {
		if (true) {
			System.out.println("true 일 때 출력.");
		}

		if (false) { 
			System.out.println("false 일 때 출력.");
		}
					
		/*
		 * 이클립스에서 노란줄 나오는 코드는 Dead Code로서 실행 안되는 코드임.
		 * 문법적으로는 문제가 없으나 실행이 될 리 없는 코드(의미없는 코드)임.
		 */
		//if (true) {
		if (false) {
			System.out.println("true 일 때 출력.");
		} else {
			System.out.println("false 일 때 출력.");
		}
		
		//if (10 == 5) {
		if (10 > 5) {		
			System.out.println("10은 5보다 큽니다");
		}
		
		int num = 10;
		
		if (num == 5) {		
			System.out.println("num은 5와 같습니다");
		}
		
	}
}
