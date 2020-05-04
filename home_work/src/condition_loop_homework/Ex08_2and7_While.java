package condition_loop_homework;

public class Ex08_2and7_While {
	public static void main(String[] args) {
		int i = 0, sum = 0;
		while (i < 1001) { // i가 1000이하 일 때 까지
			if (i % 2 == 0 && i % 7 == 0) {	sum = i;} // 2와 7의 배수에 해당하면 해당 i를 sum에 대입
			i++; // i값 증가 후 반복
		}
		System.out.println(sum); // 반복문이 끝나면 sum 값 출력
	}
}
