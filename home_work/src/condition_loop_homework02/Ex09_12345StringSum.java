package condition_loop_homework02;

public class Ex09_12345StringSum {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {			
			sum += Integer.parseInt(str.substring(i));
		}
		System.out.println("sum=" + sum);
	}
}
