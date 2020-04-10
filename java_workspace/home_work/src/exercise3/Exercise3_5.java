package exercise3;

public class Exercise3_5 {
	public static void main(String[] args) {
		int num = 333;
		System.out.println(num%10 > 0 ? ((num/10)*10)+1 : num);
		// num을 10으로 인수분해 하여 나머지가 0보다 크면
		// 뒷자리를 버리기 위하여 num / 10 * 10 을 수행하여
		// ex) 333 / 10 = 값 33, 나머지 3 -> 값 33 * 10 = 330 을 출력하게 한다.
		// 출력하게 한 값에서 끝의 자리는 무조건 1로 끝나야 함으로 +1 을 하여 결과값을 출력한다,
		// 로직 약점은 10 이하일경우 0이 리턴된다.
	}
}
