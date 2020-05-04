package condition_loop_homework;

public class Ex16_1to99Sum {
	public static void main(String[] args) {
		runWhile();
		runFor();
		runDoWhile();
	}
	
	private static void runWhile() {
		int i=1, sum=0;
		while (i<100) {
			sum+=i;
			i++;
		}
		System.out.println("While 문 으로 계산 한 1 to 99 합 : "+sum);
	}
	
	private static void runFor() {
		int sum=0;		
		for (int i = 1; i < 100; i++) {			
			sum+=i;			
		}
		System.out.println("For 문 으로 계산 한 1 to 99 합 : "+sum);
	}
	
	private static void runDoWhile() {
		int i=1, sum=0;
		do {
			sum+=i;
			i++;
		} while (i<100);
		System.out.println("do While 문 으로 계산 한 1 to 99 합 : "+ sum);
	}
}
