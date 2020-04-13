package condition_loop_homework;

public class Ex13_Mutiplication248 {
	public static void main(String[] args) {
		for (int i = 2; i < 9; i += 2) {
			if (i == 2 || i == 4 || i == 8) {
				System.out.println("----" + i + "단----");
				for (int j = 1; j <= i; j++) {
					System.out.println(i + " * " + j + " = " + i * j);
				}
			}
		}
	}
}
