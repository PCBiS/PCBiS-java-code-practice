package condition_loop_homework;

public class Ex11_5and7_For {
	public static void main(String[] args) {
		int count = 0;
		@SuppressWarnings("unused")
		int num = 0;
		
		
		for (int i = 1; i < 101; i++) { // 1 to 100까지 if문에 대입. 
			if (i % 5 != 0 || i % 7 != 0) { 
				// i값을 5로 나눴을 때 나머지가 0이 아니면서,  7로 나눴을 때 0이 아닌 공배수 
				continue;
			}
			count++; // 공통배수의 총 개수
			System.out.println(i);
		}		
		
		/*
		while((num++)<100){
			if(num%5!=0 || num%7!=0) {continue;}			
			count++;
			System.out.println(num);
		}
		*/
		
		System.out.println(count);
	}
}
