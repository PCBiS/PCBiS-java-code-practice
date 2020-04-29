package ex;

public class Ex02_Auto_BoxingUnboxing {
	public static void main(String[] args) {
		Integer iVal = 10; // <- Integer ival = new Integer(10); : Auto Boxing 이 수행되었다는 증거.
		Double dVal = 3.14; // Double dVal = new Double(3.14); : 자동으로 인스턴스 생성.
		
		System.out.println(iVal + "  " + dVal);
		System.out.println(iVal.toString());
		System.out.println(dVal.toString());
		
		// 참조변수 int와 기본형 4byte 값을 가지는 Integer는 다른 값이지만 자동으로 변환이 된다.

		int num1 = iVal; // Auto Unboxing		
		double num2 = dVal;
		
		System.out.println(num1 + " " + num2);
		
		
		
	}
}
