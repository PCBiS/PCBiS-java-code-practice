package string_homework;

public class Ex01_StringReverse {
	public static void main(String[] args) {
		String str = "ABCDEFGHIJKLMN";
		StringBuilder sb = new StringBuilder();		
		
		//System.out.println(str.length()); 문자열의 길이 확인용 : 14
		
		for (int i = str.length()-1; i >= 0; i--) {
			//System.out.println("Debug!!! : " + str.charAt(i));
			sb.append(str.charAt(i));
		}
		System.out.println("Str 원본 값 : " + str);
		System.out.println("Str값을 뒤집은 결과 : " + sb.toString());		
	}
}
