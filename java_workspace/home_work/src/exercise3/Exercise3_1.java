package exercise3;

public class Exercise3_1 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의문자코드는 65		
		
		System.out.println(y += 10 - x++);
		// 1. x: 2, y: 15, 출력값 13 - 이유는 y=5에 10을 증가한 값을 대입 한 상태 y=15에서 x의 값 2를 뺀 값임. (잘못된 풀이)
		// 1. x: 2, y: 15, 출력값 13 - y = y + (10 - x++) 이 됨으로 결과적으로 8+5 = 13 이 된다. 위 풀이와 출력값은 같으나 과정이 다름.
		System.out.println(x += 2);
		// 2. x: 5, y: 15, 출력값 5 - 직전연산(x=2)에서 후위연산으로 1이 증가(x=3)한 값에 2를 다시 증가(x=5)시키고 그 값을 출력했기 때문.
		System.out.println(!('A' <= c && c <= 'Z')); 
		// 3. 'A' 의 Ascii 코드로서의 숫자는 65인데 'c' 의 Ascii코드 값은 99이기 때문에 65 <= 99 = false 이기 때문에 false 가 나와서 추가 연산 없이 종료.(오답)
		// 3. 'A' <= c 는 두 아스키 코드 숫자 값이 같으니 true, c <= 'Z' 는 65 <= 99 임으로 true 이지만 최종연산과정에서 논리부정이 들어가서 false 로 종료. 
		System.out.println('C' - c);
		// 4. 'C' 의 Ascii Dec 값은 67, 변수 c의 Ascii Dec값은 65(A) 이기 때문에 67 - 65 = 2
		System.out.println('5' - '0');
		// 5. '5' 의 Ascii 숫자형 문자의 값은 53, '0' 의 Ascii 숫자형 문자의 값은 48임으로 53 - 48 = 5
		System.out.println(c + 1);
		// 6. char 'c' 의 int형 값은 65, + 1은 int 값임으로 char + int => int + int = int 임으로 66
		System.out.println(++c);
		// 7. char 'A' 의 Ascii Dec 값은 65에 전위연산을 하였음으로 66으로 증가한 값의 Ascii Char 값은 'B'
		System.out.println(c++);
		// 8. 직전에 전위연산으로 Ascii Dec 값이 1 증가하여 Char값이 'B'로 변하였음으로 B를 출력 한 후 후위연산으로 Ascii Dec 값을 증가.
		System.out.println(c);
		// 9. 직전에 후위연산으로 Ascii Dec 값이 1 추가로 증가하여 Ascii Char 값은 'C'
	}
}
