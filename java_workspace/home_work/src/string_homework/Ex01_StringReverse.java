package string_homework;

public class Ex01_StringReverse {
	public static void main(String[] args) {
		String str = "ABCDEFGHIJKLMN";
		StringBuilder sb = new StringBuilder();
				
		//System.out.println(str.length()); 문자열의 길이 확인용 : 14
		
		/* 방법 1. for문을 이용하여 변수 'str'의 길이 만큼의 for문을 돌리고
		 * String 클래스의 charAt(i) 메소드로 뽑아낸 값을 이용하여 
		 * 인스턴스 변수인 sb에 StringBuffer 클래스의 .append 메소드를 이용하여
		 * 한 글자씩 역순으로 입력한 후 최종 출력은 .toString 메소드로 일괄로 
		 * 그동안 sb변수에 역순으로 쌓인 문자열을 출력하는 방법.     
		 */
		for (int i = str.length(); i < 0; i--) {
			//System.out.println("Debug!!! : " + str.charAt(i));
			sb.append(str.charAt(i));
		}
		System.out.println("Str 원본 값 : " + str);
		System.out.println("Str값을 뒤집은 결과 : " + sb.toString()); // StringBuilder의 toString 메소드로 
		
		// 방법 2. StringBuilder클래스의 문자열을 뒤집는 메소드(.reverse())를 이용하여 글자열을 뒤집는 방법.  
		StringBuilder sb2 = new StringBuilder(str);
		System.out.println(sb2.reverse());
		
		
	}
}
