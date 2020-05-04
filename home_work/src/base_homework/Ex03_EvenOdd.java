package base_homework;

import java.util.Scanner;

public class Ex03_EvenOdd {
	public static void main(String[] args) {
		System.out.println("판별 할 수를 입력학세요.");
		Scanner sc = new Scanner(System.in); // 텍스트를 스캐너 클래스로 입력받는다.
		int val = sc.nextInt();	// 입력받은 정수를 val에 대입한다.
		System.out.println(val % 2 == 0 ? "짝수입니다" : "홀수입니다"); // val%2의 나머지가 0이면 짝수, 아니면 홀수라고 출력한다.
	}
}
