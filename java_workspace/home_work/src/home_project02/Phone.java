package home_project02;

public class Phone {
	public static void main(String[] args) {
		Phoneinfor in1 = new Phoneinfor("김철수", "010-1234-5778");
		Phoneinfor in2 = new Phoneinfor("박영희", "010-3332-7682", "19900926");
		Phoneinfor in3 = new Phoneinfor("이영호", "010-5144-6771");
				
		System.out.println("");  
		
		in1.showPbook();
		in2.showPbook();
		in3.showPbook();
		
		
		
	}
}
