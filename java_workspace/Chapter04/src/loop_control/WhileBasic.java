package loop_control;

public class WhileBasic {
	public static void main(String[] args) {
		int num = 0; // 반복조건을 체크하는 변수.
		//int num = 5; // 만약 num이 5라면 while문은 조건이 시작부터 성립하지 않아서 작동하지 않는다.
		
		while (num < 5) { // 비교를 반복하여 num이 5가 되면 조건을 만족하지 않으니 Loop Break
			System.out.println("i Like JAVA" + num); // 출력
			num++; // num 증가, 만약 증가 혹은 증감 조건이 없으면 무한루프에 빠짐.
		}		    
	}
}
