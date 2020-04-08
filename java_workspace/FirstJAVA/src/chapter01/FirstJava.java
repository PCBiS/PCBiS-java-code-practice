package chapter01;

/* public(접근제어자) class(키워드) FirstJava(클래스이름) */
public class FirstJava {
	/* public(접근제어자) static void(값을 돌려주지 않음) 
	 * main(메소드 이름, main 으로 된 이름의 메소드는 메인메소드이며
	 * 프로그램의 시작을 알리는 메소드이기 때문에 절대 중복되지 않아야 함.
	 * )(String[] <- 스트링 타입의 배열 args <- 변수 이름)
	 * 
	 * { 이 안에 코딩하는 코드가 한 단위의 코드이며 }
	 * 모든 명령어는 ;(세미콜론)으로 끝나야 한다.
	 * 
	 * 자바프로그램의 구성요소
	 * 
	 * 단어 : 키워드(keyword), 식별자(identifier),상수(Constant)를 표현하는 단어
	 * 여러 기호 : 대괄호[], 중괄호{}, 소괄호(), 마침표(,), 세미콜론(;) 
	 * 키워드 : public, static, void, class 등등..
	 * 			자바에서 정한 사용목적 이외로는 쓸 수 없으며 
	 * 			변수, 클래스명으로의 사용을 지양해야 한다.
	 * 			특징으로는 키워드는 전부 소문자(lowercase)로 되어있다.
	 * 			
	 * 			키워드를 사용하는 경우는
	 * 			- 프로그램의 제어 흐름
	 * 			- 선언
	 * 			- 클래스 식별자
	 * 			- 식(expression)
	 * 			같은 위의 경우들이 있다.
	 * 
	 * 식별자 : System, out, println, String, main, FirstJava 등등...
	 *			자바에서 식별자는 Class, Interface, Variable, Method,
	 *			Array, String 구분 할 수 있는 이름이다.
	 *			이름은 다른 것과 구분되어야 하기에 중복되지 않는(Unique) 이름
	 *			을 사용하여야 하며 한글도 사용은 가능하며, 대소문자 구분을 하여 사용하고
	 *			몇가지 관례를 따르면 된다.
	 *
	 *			작성규칙
	 *			- 특수문자(%,*,$,&,^ 등등), 공백(Tab, Space 등등...) 은 식별자 사용 불가
	 *			- 한글은 사용 가능, 유니코드 문자라면.
	 *			- 키워드는 사용 불가함
	 *			- 식별자의 시작어로 숫자는 쓸 수 없음.
	 *			- true, false, null은 키워드여서 쓸 수 없음.
	 *			- 유니코드 문자만 변수로 사용 가능.
	 *			- 공백이 없는 한개의 단어 (ex : className, class_Number)로 구성되야 함.
	 *			- 문자, 숫자, '_','$'를 사용할수 있습니다.
	 *			- 길이제한이 없으며, 대소문자(Upper, Lower case)를 구분함.
	 * 
	 * 데이터 : 컴퓨터에게 자료 유형을 알려주기 위한 일종의 약속
	 * 			- 기본 데이터형
	 * 				- 숫자형
	 * 					- 정수형 : byte, short, int, long
	 * 					- 실수형 : float, double(실수형은 아무것도 선언하지 않으면 dobule 타입으로 인식함)
	 * 				- 논리형
	 * 					- boolean (true / false), null
	 * 				- 문자형
	 * 					- char (문자만 사용 할 수 있는 데이터형.)
	 * 						사용예시 : char a = '밥' (char 형은 단어에 ' ' 을 씌워줘야 함)
	 * 				- 문자열 : 문자가 여러가지 있는 것, 문자열과 숫자형을 혼동하여 사용하면 문자열로 일괄처리됨	 
	 *   				- 문자열 숫자 ( 대입이 들어가지 않은 숫자의 집합)
	 *   					ㄴex : 010-9932-0000
	 *   				- 숫자형은 대입(=) 이 필요함.
	 * 			-참조 데이터형
	 * 				클래스(class), 배열(Array), 인터페이스(Interface)
	 * 						
	 * 
	 * 변수 : 데이터를 담는 일종의 그릇, Python과 다르게 자바에서는 변수를 선언 할 때
	 * 		필히 데이터 형(Type) 을 지정해야만 함. 데이터의 형은 위의 데이터를 참조.
	 * 
	 * 대입문 : 변수에 데이터를 담는 명령문 
	 * 			변수 -> num = (10 + 20) <- 10+20 대입문
	 * 						ㄴnum에 10+20의 결과를 대입한다.
	 * 
	 * 조건문 : 조건에 따라 주어진 일을 하는 명령문
	 * 			ex: if(a != 10){
	 * 					System.out.println("a는 10이 아닙니다.");
	 * 				}
	 * 
	 * 반복문 : 조건에 따라 주어진 일을 반복하는 명령문
	 * 			(for, do while, while)
	 * 			for (i = 0, i <= 100, i++){
	 * 				System.out.println(i);
	 * 			}
	 *			실행 결과 : 1,2,3,4,5.......98,99,100   			
	 */
	public static void main(String[] args) {
		System.out.println("Hello, Java!");
		System.out.println(sum(10, -3));
		System.out.println(odd(10, 5));
		System.out.println(multiply(2, 9));
		System.out.println(division(8, 2));
	}
		//접근제어자 순위
		/*
		 * 1. public - 접근제한 X
		 * 2. protected - 동일패키지 내에 존재 or 파생된 클래스에서만
		 * 3. default - 접근제한자 명시가 없으면 default 값이 되며 동일 패키지
		 * 				내부에서만 작동하게 됨.
		 * 4. private - 자기 자신의 클래스 내부에서만 접근가능.
		 */		
	
		public static int multiply(int a, int b) {
			return a*b;
		}
		
		protected static int sum(int a, int b) {		
			return a+b;	
		}
		
		static int odd(int a, int b) {
			return a-b;
		}
		
		private static int division(int a, int b) {
			return a/b;		
		}
}


