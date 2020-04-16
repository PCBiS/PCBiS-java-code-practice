package condition_loop_homework02;

public class Ex02_1to20 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 21; i++) {
			count = (i%2==0&&i%3==0?count+1:count+0);
		}
		System.out.println(count);
	}
}
