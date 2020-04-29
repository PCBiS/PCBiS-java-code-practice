package ex;

import java.util.StringTokenizer;

public class Ex04_Tokenizer {
	public static void main(String[] args) {
		String phoneNum = "Tel 82-10-9932-9063 test";
		StringTokenizer st1 = new StringTokenizer(phoneNum);
		
		while (st1.hasMoreTokens()) {						
			System.out.println(st1.nextToken()); // 특별히 아무 설정 안하면 '공백' 을 기준으로 자른다.
		
		}
		// 구분단위를 "-" 으로 설정했다
		StringTokenizer st2 = new StringTokenizer(phoneNum, " -");
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken()); 
			/*
			 *  결과("-")     구분자 단위는			   ->     결과2 (" -")
			 *  Tel 82		  첨자 하나하나 단위				Tel
			 *	10			  로 나누어 출력하기				82
			 *	9932		  때문에							10
			 *	9063 test 										9932
			 *													9063
			 *													test
			 */
		}
		
	}
}
