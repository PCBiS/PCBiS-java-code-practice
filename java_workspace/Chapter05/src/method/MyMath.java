package method;

public class MyMath { // 메소드의 위치 : class 블럭에 있다고 정의함.
	// 더하기 기능 Method를 가지는 Class
	// 정수형 데이터 두개를 전달받아 두 수의 합을 연산하고 그 결과를 반환하는 Method
	long add(long a, long b) {
		long result = a + b;
		return result;
	}
	// void add(int a, int b) {} // int a,b를 입력받지만 아무것도 돌려주는게 없다고 선언 한 것.
	// int add(int a, int b) {} // int a,b를 입력받아 int타입의 자료를 리턴하겠다고 선언 한 것.
}
