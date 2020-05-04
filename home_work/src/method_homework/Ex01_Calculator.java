package method_homework;
public class Ex01_Calculator {
	public static void main(String[] args) {
		plus(3, 7);
		minus(15, 8);
		times(3, 7);
		divided(21, 8);
	}
	
	static void plus(int num01, int num02) {
		System.out.println(num01 + " + " + num02 + " = " + (num01+num02));		
	}	
	static void minus(int num01, int num02) {
		System.out.println(num01 + " - " + num02 + " = " + (num01-num02));
	}
	static void times(int num01, int num02) {
		System.out.println(num01 + " * " + num02 + " = " + (num01*num02));
	}
	static void divided(int num01, int num02) {
		System.out.println(num01 + " / " + num02 + " = " + (num01/num02) + " 나머지 : " + (num01%num02));	
	}	
}
