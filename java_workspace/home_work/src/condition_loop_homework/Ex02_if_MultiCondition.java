package condition_loop_homework;

public class Ex02_if_MultiCondition {
	public static void main(String[] args) {
		int num = -30;
		
		if (num >= 300) {  // 300 ~ infinity 인 경우
			System.out.println("300 이상인 수");
		}else if(num >= 200 && num < 300) { // 200 ~ 299 까지
			System.out.println("200이상 300 미만");
		}else if(num >= 100 && num < 200) { // 100 ~ 199 까지
			System.out.println("100이상 200 미만");
		}else if(num >= 0 && num < 100) { // 0 ~ 99 까지
			System.out.println("0이상 100 미만");
		}else { // 모든 조건에 부합하지 않으면 음수임으로
			System.out.println("0 미만");
		}
	}
}
