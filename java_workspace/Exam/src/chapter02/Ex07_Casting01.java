package chapter02;

public class Ex07_Casting01 {
	public static void main(String[] args) {
		double d = 100.0; // 형변화 해도 피연산자엔 변화가 없다.
		int i = 100;
		int result = i + (int)d;
		System.out.println("d=" + d);
		System.out.println("i=" + i);
		System.out.println("result=" + result);
	}
}
