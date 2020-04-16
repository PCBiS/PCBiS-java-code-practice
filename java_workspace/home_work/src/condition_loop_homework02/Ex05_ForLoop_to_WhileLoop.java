package condition_loop_homework02;

public class Ex05_ForLoop_to_WhileLoop {
	public static void main(String[] args) {
		int i=0, j=0;
		while (i<=10) {
			i++;
			while (j<=i) {
				System.out.print("*");
				j++;
			}
		}
	}
}
