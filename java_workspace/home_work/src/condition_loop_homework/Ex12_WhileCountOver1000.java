package condition_loop_homework;

public class Ex12_WhileCountOver1000 {
	public static void main(String[] args) {
		int totalSum = 0, i = 0;		
		
		while (true) {
			if(i%2!=0||i%3==0) { //짝수가 아니거나 3의 배수인 경우
				// System.out.println("홀수이거나 3의 배수입니다 " + i); Debug용 코드
				totalSum+=i; // 해당하는 i 값을 totalSum에 대입하고
			}
			if (totalSum>1000) { // 총 합이 1000을 넘기게 되면
				System.out.println("1000을 넘기게 되는 값 : " + i); // 1000을 넘기게 되는 값을 출력하고				
				break; //루프문을 빠져나온다.
			}			
			i++;
		}
	System.out.println(i + " 까지의 홀수와 3의 배수의 합 : " + totalSum); // 그걸 더해서 나오는 최종 값을 출력한다 
	}
}
