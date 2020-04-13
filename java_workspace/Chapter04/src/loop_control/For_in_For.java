package loop_control;

public class For_in_For {
	public static void main(String[] args) {

		for (int i = 2; i < 10; i++) {
			System.out.println("----------");
			System.out.println("---" + i + " 단---");
			System.out.println("----------");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println("----------");
		}

		/*
		 * for (int i = 1, j = 0; i < 10 && i * j < 220; i++, j += 2) { // 같은 행에 있으면 동시
		 * 증가함. System.out.println(i + " * " + j + " = " + i * j); }
		 */
	}
}
