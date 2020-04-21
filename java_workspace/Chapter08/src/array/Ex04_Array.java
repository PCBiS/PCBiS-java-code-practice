package array;

public class Ex04_Array {
	public static void main(String[] args) {
		// 정수 45개를 저장 가능한 배열 생성.
		int[] ball = new int[45];
		int temp, j=0;
		
		// 배열에 1~45까지 숫자를 입력.
		for (int i = 0; i < ball.length; i++) {
			ball[i] += i+1;
		}
		
		/*
		for (int i = 0; i < 5; i++) {
			System.out.println(ball[i]);
		}
		*/		
				
		for (int i = 0; i < 1000; i++) {
			j = (int)(Math.random()*44)+1;
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}
		
		System.out.println();		
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + ", ");
		}				
	}
}
