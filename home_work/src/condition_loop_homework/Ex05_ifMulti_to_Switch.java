package condition_loop_homework;

public class Ex05_ifMulti_to_Switch {
	public static void main(String[] args) {
		int num = 99;
		switch (num/100) {
		case 3:
			System.out.println("300 이상");
			break;
		case 2:
			System.out.println("200 이상 300미만");
			break;
		case 1:
			System.out.println("100 이상 200미만");
			break;
		case 0:
			System.out.println((num<0)?"0 미만":"0 이상 100미만");
			break;		
		}
	}
}
