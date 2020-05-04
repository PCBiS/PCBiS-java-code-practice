package condition_loop_homework;

public class Ex03_ConfOp_ifelse {
	public static void main(String[] args) {
		int num1= 50, num2 = 100, big, diff;
		
		if(num1 > num2) {
			big = num1;
		}else {
			big = num2;
		}
		System.out.println("더 큰수 "+big);
		
		if (num1 > num2) {
			diff = num1 - num2;
		}else {
			diff = num2 - num1;
		}
		System.out.println("두 수의 차이 "+diff);		
	}
}
