package operator;

public class AssignmentOperators {
	public static void main(String[] args) {
		int a, b, result;
		a = 10;
		b = 3;
		
		
		
		result = a+=b;
		System.out.println("a = a + b " + result);
		result = a-=b;		
		System.out.println("a = a - b " + result);
		result = a*=b;
		System.out.println("a = a * b " + result);
		result = a/=b;
		System.out.println("a = a / b " + result);
		result = a%=b;
		System.out.println("a = a % b " + result);
		
	}
}
