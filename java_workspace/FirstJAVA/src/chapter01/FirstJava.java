package chapter01;

public class FirstJava {
	public static void main(String[] args) {
		System.out.println("Hello, Java!");
		System.out.println(sum(10, -3));
		System.out.println(odd(10, 5));
		System.out.println(multiply(2, 9));
		System.out.println(division(8, 2));
	}
		//접근제어자 순위
		/*
		 * 1. public - 접근제한 X
		 * 2. protected - 동일패키지 내에 존재 or 파생된 클래스에서만
		 * 3. default - 접근제한자 명시가 없으면 default 값이 되며 동일 패키지
		 * 				내부에서만 작동하게 됨.
		 * 4. private - 자기 자신의 클래스 내부에서만 접근가능.
		 */		
	
		protected static int multiply(int a, int b) {
			return a*b;
		}
		
		public static int sum(int a, int b) {		
			return a+b;	
		}
		
		private static int odd(int a, int b) {
			return a-b;
		}
		
		static int division(int a, int b) {
			return a/b;		
		}
}


