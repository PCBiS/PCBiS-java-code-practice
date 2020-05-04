package card;

public class CardMain {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 13; j++) {
				Card card = new Card();
				card.number += j;				
				if (i==1) {	card.kind="spade";}
				else if (i==2) {card.kind="diamond";}
				else if (i==3) {card.kind="heart";}
				else {card.kind="clover";}
				System.out.println("넓이 "+Card.card_width+ " 높이 "+ Card.card_height + " 크기의 " + card.kind + " " + card.number + " 를 생성하였습니다.");
			}	
		}
	}
}
