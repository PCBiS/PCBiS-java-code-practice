package condition_loop_homework02;

public class Ex06_DiceSum6 {
	public static void main(String[] args) {
		int sixNum = 0;
		for (int i = 1; i < 7; i++) {
			for (int j = 6; j >= 1; j--) {
				System.out.println("i: " + i + " j: " + j);
				if (i+j==6) {sixNum++;}
			}
		}
		System.out.println("주사위 두개의 눈 합이 6인 경우의 수 : " + sixNum);
	}
}
