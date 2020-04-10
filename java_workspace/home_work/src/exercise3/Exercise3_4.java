package exercise3;

public class Exercise3_4 {
	public static void main(String[] args) {
		int num = 456;
		System.out.println(num%100 > 0 ? num/100*100 : num);
		// num을 100으로 인수분해 하여 나머지가 0보다 크면
		// 뒷자리를 버리기 위하여 num / 100 * 100 을 수행하여
		// ex) 456 / 100 = 값 4, 나머지 56 -> 값 4 * 100 = 400 을 출력하게 한다.
		// 로직 약점은 100 이하일경우 0이 리턴된다.
	}
}
