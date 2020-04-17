package string_homework;

public class Ex02_Personal_Number {
	public static void main(String[] args) {
		String str = "990929-1010123";
		String result1 = new String();
		String result2 = new String();
		StringBuffer result3 = new StringBuffer();
		//1번방법 : 이미 주민등록번호의 규칙 6-7 을 알고 있으니 그 점을 이용하여 분리하는 방법.
		result1 = str.substring(0, 6) + str.substring(7, 14); // 특이한 점은 0-5인줄 알았는데 0-6을 해야 원하는데로 잘린다.
		System.out.println("방법1 : " + result1);
		//2번방법 : - 를 분리하는 방법.
		result2 = str.replaceAll("-", "");
		System.out.println("방법2 : " + result2);
		//3번방법 : for문을 돌려서 result3에 문자를 append 처리 하는데, '-' 문자가 발견되면 해당 문자는 스킵.
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)!='-') {
				//System.out.println("Debug!!! : " + str.charAt(i));
				result3.append(str.charAt(i));
			}
		}
		System.out.println("방법3 : " + result3.toString());
	}	
}
