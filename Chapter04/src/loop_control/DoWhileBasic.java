package loop_control;

public class DoWhileBasic {
	public static void main(String[] args) {
		int num = 0; // 반복조건을 체크하는 변수.
		//int num = 6; // Do While 문은 조건이 안맞이도
		
		do { // 무조건 1회 실행
			System.out.println("i Like JAVA" + num); // 출력
			num++; // num 증가, 만약 증가 혹은 증감 조건이 없으면 무한루프에 빠짐.
		} while (num < 6); // 비교를 반복하여 num이 6이 되면 조건을 만족하지 않으니 Loop Break		    
	}
}
