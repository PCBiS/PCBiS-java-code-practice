package home_work;

public class Variable_test {
	public static void main(String[] args) {
		double regNo = 870801.1012912;
		System.out.println(regNo);
		
		System.out.println("1" + "2");
		System.out.println(true + "");
		System.out.println('A' + 'B');
		System.out.println('1' + 2);
		System.out.println('1' + '2');
		System.out.println('J' + "ava");
		//System.out.println(true + null);
		System.out.println("---------------------------");
		
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;		 
		
		b = (byte)i; // 형변환 되어도 유지
		ch = (char)b; // 안됨
		short s =(short)ch; //안됨
		float f =(float)l; //유지 됨
		i = (int)ch;
		
		System.out.println("이하 형변환한 값");
		System.out.println(b);
		System.out.println(ch);
		System.out.println(s);
		System.out.println(f);
		System.out.println(i);
		
		//byte b = 256;
		//char c = '';
		//char answer ='no';
		//float f = 3.14;
		double d = 1.4e3f;
		
		//System.out.println(b);
		//System.out.println(c);
		//System.out.println(answer);
		//System.out.println(f);
		System.out.println(d);		
	}
}
