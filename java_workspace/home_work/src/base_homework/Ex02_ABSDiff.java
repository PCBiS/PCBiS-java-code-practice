package base_homework;

public class Ex02_ABSDiff {
	public static void main(String[] args) {
		Ex02_ABSDiff diff = new Ex02_ABSDiff(); // 1. 인스턴스 변수 초기화
		System.out.println(diff.diffABS(51, -101)); // 결과값을 출력한다.
	}
	
	int diffABS(int a, int b) {
		// 2. Math 클래스의 .abs 값으로 절대값의 차를 구하여 result에 넣는다.
		int result = Math.abs(a) - Math.abs(b);
		// 결과값을 절대값으로 재변환한다. 변환하지 않으면 a나 b에 음수가 들어오면 
		// -= 와 같은 효과가 나서 a+b의 결과가 리턴된다.
		return Math.abs(result); 
	}	
}
