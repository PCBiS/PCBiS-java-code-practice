package method_homework;

public class Ex03_RoundPi {
	public static void main(String[] args) {
		circleLen(10);
		circleSq(10);
	}
	
	static void circleLen(int radius) {
		System.out.println("원의 넓이 : " + (2*Math.PI*radius));
	}
	
	static void circleSq(int radius) {
		System.out.println("원의 지름 : " + (radius*radius*Math.PI));
	}
	
}
