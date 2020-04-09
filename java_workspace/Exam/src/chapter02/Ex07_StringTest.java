package chapter02;

public class Ex07_StringTest {
	public static void main(String[] args) {
		
		String a = 7 + " "; 
		String b = " " + 7;
		String c = 7 + "";
		String d = "" + 7;
		String e = "" + "";
		String f = 7 + 7 + "";
		String g = "" + 7 + 7;
		
		
		System.out.println(a); // a의 출력결과 : 숫자7 -> 문자 7로 치환 -> 문자 7 + 문자 " 공백 " = 출력결과 : "7 "
		System.out.println(b); // b의 출력결과 : 문자 "공백" + 숫자 7 -> 문자 "공백" + 문자 7 = 출력결과 : " 7"
		System.out.println(c); // c의 출력결과 : 숫자 7 -> 문자 7 + 문자 "empty" = 출력결과 : "7"
		System.out.println(d); // d의 출력결과 : 문자 "empty" + 숫자7 -> 문자 "empty" + 문자7 = 출력결과 : "7"
		System.out.println(e); // e의 출력결과 : 문자 "empty + 문자 "empty" = 출력결과 : "empty" (문자가 비어있음)
		System.out.println(f); // f의 출력결과 : 숫자7 + 숫자 7 = 14 -> 숫자14 + 문자 "empty" = 출력결과 : "14"
		System.out.println(g); // g의 출력결과 : 문자 "empty" + 숫자 7 -> 문자 7 + 숫자7 -> 문자7 + 문자7 = 출력결과 : "77"
	}
}
