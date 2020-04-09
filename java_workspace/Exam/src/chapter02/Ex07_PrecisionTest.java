package chapter02;

public class Ex07_PrecisionTest {
	public static void main(String[] args) {
		float f = 1.2345678901234567890f; // 실제로 float이 표시 가능한 자리수는 1.23456789 까지이기 때문에 뒷 값이 짤림.
		double d = 1.2345678901234567890; // double은 문제 없음.
		float f2 = 0.100000001f; // 0.1
		double d2 = 0.100000001; // 접미사 생략되었음.
		double d3 = 0.1000000000000001;
		
		System.out.println(f);
		System.out.println(d);
		System.out.println(f2);
		System.out.println(d2);
		System.out.println(d3);
	}
}
