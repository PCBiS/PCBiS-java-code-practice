package chapter02;

public class Ex07_Casting01 {
	public static void main(String[] args) {
		double d = 100.0; // 형변화 해도 피연산자엔 변화가 없다.
		int i = 100; // i의 값은 100, int형 자료.
		int result = i + (int)d; /*
									int형 i 값 + double 100.0을 int형으로 형변화 한 값을 더한 결과물을 i에 넣는다.
		 						  */
		
		System.out.println("d=" + d); 
		System.out.println("i=" + i);
		System.out.println("result=" + result); 
		//형변화는 대입과정에서만 임시적으로 일어난 일이기 때문에 원본 값인 double d / int i 에는 아무일이 없다.
	}
}
