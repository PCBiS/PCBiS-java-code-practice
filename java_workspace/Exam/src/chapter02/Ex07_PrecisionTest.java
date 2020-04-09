package chapter02;

public class Ex07_PrecisionTest {
	public static void main(String[] args) {
		float f = 1.2345678901234567890f; // float이 정밀하게 표시 가능한 소수점 자리수는 6자리
		double d = 1.2345678901234567890; // double은 문제 없음.
		float f2 = 0.100000001f; // 0.1
		double d2 = 0.100000001; // 접미사 생략되었음.
		double d3 = 0.1000000000000001;
		
		System.out.println(f); // 그 결과 1.2345678 이 아닌 1.2345679 즉 7 밑의 7번째 자리부터는 반올림 처리되었다.
		System.out.println(d); // double은 12번째 소수점자리까진 연산이 가능하지만 
							   // 그 이하는 이진수 특성 상 표현 불가한 소수가 있어서 계산결과에는 한계가 있다.
		System.out.println(f2);
		System.out.println(d2);
		System.out.println(d3);
	}
}
