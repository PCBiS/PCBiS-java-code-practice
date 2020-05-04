package flow_control;

public class IfElse_Usage {
	public static void main(String[] args) {
		int num = 10;

		// 양수 판별 : 양수 일 때 "양수" 입니다 라고 리턴해주는 if문

		if (num > 0) {
			System.out.println("양수 입니다.");
		}
		System.out.println("--------------------------");
		// 홀수/짝수 판별 : num을 나누어서 나머지가 0이면 true, 아니면 false

		if (num%2==0) {
		//if (num%2==1) {
			System.out.println("num은 짝수입니다.");
		} else {
			System.out.println("num은 홀수입니다.");
		}
	}
}
