package chapter02;

public class Ex07_Casting02 {
	public static void main(String[] args) {
		byte b = 10;
		int i = (int)b;
		System.out.println("i=" + i);
		System.out.println("b=" + b);
		
		int i2 = 300;
		byte b2 = (byte)i2;
		System.out.println("i2=" + i2);
		System.out.println("b2=" + b2);
	}
}