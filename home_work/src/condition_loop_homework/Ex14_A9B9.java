package condition_loop_homework;


// i,j + j+i가 99인 합의 개수
public class Ex14_A9B9 {
	public static void main(String[] args) {
		int count = 0;
		
		for (int i = 1; i < 10; i++) { // 1에서 9까지 증가하는 외부루프
			for (int j = 9; j >= 1; j--) { // 9에서 1까지 감소하는 내부루프
				if(i*10+j + j*10+i==99) {
				
				
					System.out.println("AB : " + (i*10+j));
					//앞자리수 10의 자리수를 구현하기 위해서 IJ의 앞자리인 I값에 10을 곱한다.
					System.out.println("BA : " + (j*10+i));
					//반대로 JI도 앞지리인 j값에 10을 곱한다.
					System.out.println("---------------");
					System.out.println("result : " + ((i*10+j)+(j*10+i)));
					System.out.println("---------------");
					count++; // 조건식을 만족하는 개수를 세기 위해 count를 1 증가시킨다.
				}
			}
		}
		System.out.println("조건식을 만족하는 개수 : " + count);
	}	
}
