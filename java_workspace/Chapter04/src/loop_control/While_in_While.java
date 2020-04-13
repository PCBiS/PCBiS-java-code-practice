package loop_control;

public class While_in_While {
	public static void main(String[] args) {
		int i =2;		
		
		while (i<9) {			
			System.out.println("----------");
			System.out.println("---" + i + " 단---");
			System.out.println("----------");
			++i;
			int j =1;			
			while (j<10) {				
				System.out.println(i + " * " + j + " = " + i * j);
				j++;
			}
		}
	}
}
