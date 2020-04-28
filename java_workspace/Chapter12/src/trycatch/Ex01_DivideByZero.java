package trycatch;

public class Ex01_DivideByZero {
	public static void main(String[] args) {
		int num1 = 10, num2 = 0;
		int div = 0;
		try {
			div = num1 / num2;	
			System.out.println(div);					
		} catch (ArithmeticException ae) {
			System.err.println("Divide by Zero Error!");
			System.err.println(ae.getMessage());
			ae.printStackTrace();
			return;
		} finally {
			System.out.println("Finally 블럭 실행 확인용!");
		}
		
		System.out.println("프로그램 종료");
	}
}
