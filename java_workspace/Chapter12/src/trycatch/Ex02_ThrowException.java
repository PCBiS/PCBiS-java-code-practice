package trycatch;

import java.util.Scanner;

public class Ex02_ThrowException {
	public static void main(String[] args) {
			
			try {
				int age = readAge();
			} catch (AgeInputExeception e) {				
				e.printStackTrace();
			}
		
		/*
		 * try { Exception e = new Exception("의도적으로 발생 시킴"); //AgeInputExeception e =
		 * new AgeInputExeception(); throw e; // 강제 발생 지점 } catch (Exception e) {
		 * System.err.println(e.getMessage()); } System.out.println("프로그램이 정상 종료 됨");
		 */
	}

	static int readAge() throws AgeInputExeception {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		int age = sc.nextInt();
		if (age<0){ AgeInputExeception e = new AgeInputExeception(); throw e; }		
		return age;		
	}

}
