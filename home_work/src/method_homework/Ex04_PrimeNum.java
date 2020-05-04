package method_homework;

public class Ex04_PrimeNum {
	public static void main(String[] args) {
		int primeCount = 0;
		// 1부터 100까지 사이의 소수(Prime number)를 표시하는 프로그램
		// 소수의 정의: 약수가 1과 자신뿐인 1보다 큰 정수
		for (int i = 2; i < 100; i++) { // 1은 제외해야 하기 때문에 2부터 시작
			int c = 0; // 이 변수(카운터)로 소수인지를 판가름합니다
			for (int j = 1; j <= i; j++) { // j=1부터 i까지(해당 숫자까지) 증가
				if (primeNum(i, j)) { // i를 j로 나누어 0이 남는지 검사
					c += 1;// 카운터를 증가시킴
				} 
			}
			if (c == 2) { // 검사한 카운터가 2일 때(소수인지 확인)
				System.out.print(i + ","); // 출력
				primeCount++;
			}			
		}
		System.out.println("");
		System.out.println("소수의 숫자 : " + primeCount);
	}

	// 소수의 정의 : 1과 자기 자신만이 나눌 수 있는 값.
	static boolean primeNum(int i, int j) {
		return i % j == 0 ? true : false;
	}
}
