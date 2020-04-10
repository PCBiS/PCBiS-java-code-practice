package exercise3;

public class Exercise3_3 {
	public static void main(String[] args) {
		int num = 10;				
		System.out.println(num>0 ? "양수" : num==0 ? "0" : "음수" );
		/*
			동일한 코드를 if문으로 풀었을 경우.
					
			if (num > 0) {
				System.out.println("양수");
			}else if (num == 0) {
				System.out.println("0");
			}else {
				System.out.println("음수");
			}
			
			결과는 동일하다.
		*/
	}
}
