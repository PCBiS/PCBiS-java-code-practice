package chapter01;

public class FirstJava {
	public static void main(String[] args) {
		System.out.println("Hello, Java!");
		System.out.println(sum(10, -3));
		System.out.println(odd(10, 5));
	}	
	
	public static int sum(int a, int b) {		
		return a+b;	
	}
	
	private static int odd(int a, int b) {
		return a-b;
	}
}


