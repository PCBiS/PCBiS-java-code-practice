package method;

public class MethodDefAdd { 
// 클래스 이름은 대문자로 시작해야 함. 딱히 소문자로 한다고 클래스를 못만들진 않으나 규칙임. 
	
	public static void main(String[] args) {
		
		int addYourMoney; // 소문자로 시작, 단어가 두개 이상으로 구성된다면 새 단어(두번째 키워드)는 대문자로 시작.
		final double PI = 3.14; //상수는 변수명을 대문자로 선언
		
		
		System.out.println("프로그램 시작");
		/*
		System.out.println("안녕하세요!");
		System.out.println("제 나이는 24 세 입니다.");
		System.out.println("안녕하세요!");
		System.out.println("제 나이는 33 세 입니다.");
		*/
		
		hiEveryone(17,171.4); // hiEveryone 의 int age와, double height 에 17, 171.4를 대입해준다는 선언.
		hiEveryone(25,183.2);
		hiEveryone(33,166.4);
		hiEveryone(41,175.3);
		hiEveryone(55,155); // int형을 넣어도 double의 자료형이 더 크기 때문에 자동 형변환
		
		System.out.println("프로그램 종료");
		
	}
	
	// 기본 인사말 출력 후, 입력받은 나이 값을 출력해주는 메소드
	static void hiEveryone(int age, double height) {
	// static 은 처음 코드가 실행이 될 때 전역메모리 영역에 올리겠다라는 선언.
		int asdf = 10; // 지역변수는 선언된 지역을 벗어나면 소멸한다.
		/*지역변수의 종류
		 *  1. 메소드
		 *  2. for, if, while, do while 등등의 정의부 선언 {}
		 */
		System.out.println("안녕하세요!");
		System.out.println("제 나이는 " + age + "세 이고 키는 "+ height + " cm 입니다.");
	}
}
