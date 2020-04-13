package condition_loop_homework;

public class Ex06_1to99Summary_While {	
	public static void main(String[] args) {
		int i=1, sum = 0;
		
		while (i<100) {
			sum +=i;
			i++;
		}
		System.out.println(sum);		
	}
}
