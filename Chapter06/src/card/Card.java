package card;

public class Card {
	static int card_width=100;
	static int card_height=250;
	
	String kind;
	int number;
	
	Card(){ // 명시적으로 만든 default 생성자
		
	}
		
	Card(String type, int num){
		kind=type;
		number=num;
	}	
}
