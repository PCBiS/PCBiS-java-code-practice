package condition_loop_homework;

public class Ex14_02Ver_A9B9 {
	public static void main(String[] args) {
		int count = 0;
		
		for (int i = 1; i < 9; i++) { // 1에서 9까지 증가하는 외부루프
			for (int j = 9; j >= 1; j--) { // 9에서 1까지 감소하는 내부루프
				if(i+j==9) {
					System.out.println("AB : "+ i+j);
					System.out.println("BA : "+ j+i);
					System.out.println("--------");
					count++;
				}
			}
		}
		System.out.println("조건식을 만족하는 개수 : " + count);
	}
}
