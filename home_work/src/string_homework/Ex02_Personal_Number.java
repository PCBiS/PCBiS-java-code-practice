package string_homework;

public class Ex02_Personal_Number {
	public static void main(String[] args) {
		String str = "990929-1010123";
		String result1 = new String();
		String result2 = new String();
		StringBuffer result3 = new StringBuffer();
		
		/*
		 * 1번방법 : 이미 주민등록번호의 규칙 6-7 을 알고 있으니 그 점을 이용하여 분리하는 방법.
		 * 사용한 기능은 String Class의 .substring 메소드로 인덱스 단위로 글자를 끊어내는 방법이다.
		 */ 
		result1 = str.substring(0, 6) + str.substring(7, 14); // 특이한 점은 0-5인줄 알았는데 0-6을 해야 원하는데로 잘린다.
		System.out.println("방법1 : " + result1);
		
		
		/* 
		 * 2번방법 : - 를 분리하는 방법. 동일 클래스의 .replaceAll 메소드를 이용하여
		 * "-" 문자열 을 "" 문자열로 일괄치환한 값을 result2에 대입하여 출력. 
		 */
		result2 = str.replaceAll("-", "");
		System.out.println("방법2 : " + result2);
		
		
		/*
		 *  3번방법 : for문을 돌려서 변수 'str' 의 길이만큼의 for문을 돌리고
		 *  String 클래스의 .charAt(i) 메소드로 뽑아낸 char 단위로 뽑아낸 문자를
		 *  result3 변수에 StringBuffer 클래스의 .append 메소드를 이용하여 한글자씩 입력하되
		 *  if문을 이용하여 '-' 문자와 동일하지 않은 문자만을 .append 하게 하여서 결과를 출력하였다.
		 */
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)!='-') {
				//System.out.println("Debug!!! : " + str.charAt(i));
				result3.append(str.charAt(i));
			}
		}
		System.out.println("방법3 : " + result3.toString());
	}	
}
