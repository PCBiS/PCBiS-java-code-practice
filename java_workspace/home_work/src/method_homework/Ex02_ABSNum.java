package method_homework;



public class Ex02_ABSNum {
	public static void main(String[] args) {
		ABSplus(33, -22);
		ABSminus(20, -7);
	}
	
	static void ABSplus(int num01, int num02) {
		System.out.println(num01 + " + " + num02 + " = " + (Math.abs(num01)+Math.abs(num02)));		
	}	
	static void ABSminus(int num01, int num02) {
		System.out.println(num01 + " - " + num02 + " = " + (Math.abs(num01)-Math.abs(num02)));
	}
}
