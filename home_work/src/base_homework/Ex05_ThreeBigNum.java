package base_homework;

public class Ex05_ThreeBigNum {
	public static void main(String[] args) {
		int a=55,b=66,c=44;
		System.out.println(a>b&&a>c?"A가 제일 큽니다.":a<b&&b>c?"B가 제일 큽니다":"C가 제일 큽니다.");
		/*
		 * 삼항연산자로 a>b가 참이면서 a>c가 참이면 A가 제일 크다고 출력하고
		 * 아니면 a>b가 참이면서 b<c가 참인지 질문하여 참이면 B가 제일 크다고 출력하고
		 * 그 어느것도 해당하지 않으면 C가 제일 크다고 출력한다.
		 */
	}
}
