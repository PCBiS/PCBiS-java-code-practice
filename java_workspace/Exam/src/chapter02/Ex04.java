package chapter02;

public class Ex04 {
	public static void main(String[] args) {
		double num1 = 1.0000001;
		double num2 = 2.0000001;
		System.out.println("num1 :" + num1 + " num2 :" + num2);
		double result1 = num1 + num2;
		System.out.println("num1 + num2 = " + result1);
		System.out.println("----------------------------------");
		double num3 = num1 * 10000000;
		double num4 = num2 * 10000000;
		System.out.println("num3 :" + num3 + " num4 :" + num4);
		double result2 = num3 + num4;
		System.out.println("num3 + num4 = " + result2 / 10000000);

		int a = 10;
		System.out.println(a + 'h');
	}
}
