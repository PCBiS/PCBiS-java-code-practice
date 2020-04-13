package condition_loop_homework;

public class Ex07_1to100to1_WhileAndDoWhile {
	public static void main(String[] args) {
		int i = 1;
		while (i<100) {	// i가 100이 될 때 까지
			System.out.println(i); // 출력하고
			i++; // i값을 증가 (후위증가연산)
		}
		
		do { // 일단 한번은 실행하고
			System.out.println(i); // 출력하고
			i--; // i값을 감소 (후위감소연산)
		} while (i>=1); // i가 1보다 작거나 같을때 까지
	}
}
