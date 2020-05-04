package loop_control;

public class While_Continue {
	public static void main(String[] args) {
		// 1~10 까지의 숫자중 3의 배수를 제외하고 출력
		// 1~10 까지의 숫자중 3의 배수만 출력

		for (int i = 1; i < 11; i++) {
			
			if (i % 3 == 0) {continue;} // 3의 배수면 출력에서 제외			
			//if (!(i % 3 == 0)) {continue;} // 3의 배수일때만 출력 (논리부정)
			System.out.println(i);			
		}
	}
}
