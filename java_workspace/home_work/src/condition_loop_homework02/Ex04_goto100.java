package condition_loop_homework02;

public class Ex04_goto100 {
	public static void main(String[] args) {
		int last = 0;
		int i = 1;
		while (last<100) {
			last = i%2==0?last+i:last-i;
			i++;
		}
		System.out.println("last가 100에 도달하기 전 마지막으로 더한 값 : " + i);
		System.out.println("last의 현재 값 : " + last);
	}
}
