package operator;

public class UnaryAddMin {
	public static void main(String[] args) {
		int n1 = 5; //초기 값은 +5
		System.out.println(+n1); // +5인 초기값에 +5를 곱했기 때문에 부호가 -로 반전 
		System.out.println(-n1); // -5인 초기값에 -5를 곱했기 때문에 부호가 +로 반전
		
		short n2 = 7;
		int n3 = +n2; // 위와 동일한 이유로 부호가 -로 반전
		int n4 = -n2; // 부호가 +로 반전.
		
		System.out.println(n3);
		System.out.println(n4);
	}

}
