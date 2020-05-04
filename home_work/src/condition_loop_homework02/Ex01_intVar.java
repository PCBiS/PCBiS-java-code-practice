package condition_loop_homework02;

public class Ex01_intVar {
	public static void main(String[] args) {
		int x=15;		
		System.out.println(x>10&&x<20?true:false);
		char ch = 'a';
		System.out.println(ch!=' '&&ch!='	'?true:false);
		char ch2 = 'x';
		System.out.println(ch2=='x'||ch2=='X'?true:false);
		char ch3 = '7';
		System.out.println(ch3>'0'&&ch3<'9'?true:false);
		char ch4 = 'T';
		System.out.println(ch4>'a'&&ch4<'z'||ch4>'A'&&ch4<'Z'?true:false);
		int year=2020;
		System.out.println(year%400==0||year%4==0&&year%100!=0?true:false);
		boolean powerOn=false;
		System.out.println(powerOn==false?!powerOn:powerOn);
		String str = "yes";
		System.out.println(str=="yes"?true:false);
	}
}
