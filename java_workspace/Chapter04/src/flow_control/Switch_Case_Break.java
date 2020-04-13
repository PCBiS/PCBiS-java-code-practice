package flow_control;

public class Switch_Case_Break {
		
	public static void main(String[] args) {
		int menuNum = 1;

		switch (menuNum) {
		case 1:
			System.out.println("Simple Java");
			break;
		case 2:
			System.out.println("Funny Java");
			break;
		case 3:
			System.out.println("Fanstic Java");
			break;
		default:
			/* 
			 * 생략이 가능함, 위의 case 문의 조건을 만족하지 못한 값, 
			 * 하지만 이 경우는 1,2,3에 해당하는 경우는 해당 행만을 실행하고
			 * break({} 블럭을 나감)하기 때문에 현 조건에서 default 문을 출력하는 경우는
			 * menuNum 의 값이 3 이상인 경우에만 가능하다. 
			 */
			System.out.println("The best programming language");			
		}
		System.out.println("Do you like coffee?");
	}
	
	public void level() {
		int levelNum = 3;
		
		switch(levelNum) { 
				// 순차구성을 적절하게 하면 이런식으로 일괄적으로 적용해야 할 사항을 적용 가능하다.
			case 3:
				//grantDelete(); - 삭제 권한을 준다
			case 2:
				//grantWrite(); - 쓰기 권한을 준다
			case 1:
				//grantRead(); - 읽기 권한을 준다
		}
	}
}
