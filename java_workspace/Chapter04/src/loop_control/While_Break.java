package loop_control;

public class While_Break {
	public static void main(String[] args) {
		int i = 0, sum = 0;

		while (true) {
			if (sum > 100) {
				System.out.println("마지막 값 = " + i);
				System.out.println("값 = " + sum);
				break;
			}
			i++;
			sum += i;			
		}
	}
}