package exercise3;

public class Exercise3_6 {
	public static void main(String[] args) {
		int num = 24;
		System.out.println(num/10 > 0 ? ((((num/10)+1)*10)-num%10)+num%10 : num);
		System.out.println(num/10 > 0 ? num+(10-(num%10)) : num);
		
		/* 
		 * 풀이1 - 처음 풀었던 안
		 * 
		 * 이 문제는 10의 배수 단위로 올림을 하는 계산식이기 때문에
		 * num을 10으로 나누어서 0보다 크면 우선 num/10을 계산하여 
		 * 위의 경우는 24/10=2 의 결과가 나오고 올림을 해야 하기 때문에 +1을 더한 값은 3이다.
		 * 3*10 을 해서 나온 값 30 에서 - num을 10으로 나누고 남은 나머지 4를 빼면 26이고
		 * 26이고 num%10 의 값을 더하면 최종 값은 30으로 올림 된다.
		 * 
		 * 풀이2 - 간결하게 로직을 정리 - 친구 도움을 받은 부분.
		 * 
		 * num%10 = 나머지 4
		 * 10 - 4 = 6 
		 * num = 24 + 6 = 30
		 * 
		 * 로직 약점은 10 일경우 20이, 10 이하일경우 0이 리턴된다.		
		 */ 
	}
}
