package home_project01;

public class Phone {
	public static void main(String[] args) {
		Phoneinfor in1 = new Phoneinfor();
		Phoneinfor in2 = new Phoneinfor();
		Phoneinfor in3 = new Phoneinfor();		
		
		in1.numberAdd("김철수", "010-1234-5778");
		in2.numberAdd("박영희", "010-3332-7682", "19900926");
		in3.numberAdd("이영호", "010-5144-6771");
		System.out.println("");
		
		in1.showPbook();
		in2.showPbook();
		in3.showPbook();
	}
}
