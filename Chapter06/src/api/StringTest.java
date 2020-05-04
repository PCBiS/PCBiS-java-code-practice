package api;

public class StringTest {
	public static void main(String[] args) {
		java.lang.String str = "My name is JAVA.";
		int strLen = str.length();
		System.out.println("str의 문자열 길이는 : " + strLen);
		/* str = "abcd"; 
		 * String 인스턴스의 변수 값은 변경 할 수 없다.
		 * 겉으로 보기엔 str = "My name is java"
		 * 						▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼
		 * 				 str = "abcd" 로 대입하는 것 처럼 보이지만
		 * 실제로는 인스턴스 변수를 새로 선언해버림. 
		 * 기존 str의 값을 대입하는게 아닌 str 을 새로 선언함. 
		 */
		
		
		int strLen2 = "한글의 문자열 길이는?".length();
		// 이게 되는 이유는 "" 안에 문자열을 선언하면 인스턴스 변수를 생성하기 때문.
		// 단 이 인스턴스 안의 내용은 변경 할 수 없음.
		System.out.println("한글(strLen2)의 문자열 길이는 : " + strLen2);
				
		/*
		 * String 인스턴스는 상수 형태의 인스턴스이다.
		 * String str1 = "My String!";
		 * String str2 = "My String!";
		 * 
		 * 위와 같이 선언하면 실제로 메모리 구조상에서는 참조하는 주소가 같다.
		 * 단 이렇게 하면 별도의 메모리 주소를 가지게 할 수 있다.
		 * 
		 * String str1 = "My String!";			이 둘의 메모리주소는
		 * String str2 = new String(str1); 		별개의 주소를 지니고 있게 된다.
		 */
		
		String str01 = "My String!";
		String str02 = "My String!";
		String str03 = "Your String!";
		String str04 = new String(str01);
		
		System.out.println(str01==str02?true:false); 
		// 삼항연산자 if문으로 두 값을 비교하니 true가 리턴됨 - 메모리 주소값이 같음.
		System.out.println(str01==str03?true:false);
		// 삼항연산자 if문으로 확인 해보니 false가 리턴됨 - 메모리 주소 값도, 실제 값도 다름(물론 이 삼항연산자로 물어본 것은 주소값일뿐임.)
		System.out.println(str01==str04?true:false);
		// 삼항연산자 if문으로 두 값을 비교하니 false가 리턴됨 - 메모리 주소 값이 다름.
	}
}
