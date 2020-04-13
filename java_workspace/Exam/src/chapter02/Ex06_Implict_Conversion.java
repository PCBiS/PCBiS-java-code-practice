package chapter02;

public class Ex06_Implict_Conversion {
	public static void main(String[] args) {
		double db = 3.5f + 12; // 3.5f float값을 12 double 값에 더한 상황.		
		System.out.println(db);
		
		long num01 = 21474383648L;
		int num02 = (int)num01; // 자동으로 형변환하게 하는 지점을 표기하기 위하여 - Case01
								// 자동형 변환 규칙에 위배함에도 변환이 필요 한 경우. - Case02
		
	}	
}
