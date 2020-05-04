package card;

public class RandomCard {
	public static void main(String[] args) {
		
		Card ranCard = new Card();
		ranCard.number = (int) (Math.random() * 13 + 1);
		int suit = (int) (Math.random() * 4);
		
		if (suit == 0) {
			ranCard.kind = "spade";
		} else if (suit == 1) {
			ranCard.kind = "diamond";
		} else if (suit == 2) {
			ranCard.kind = "heart";
		} else {
			ranCard.kind = "clover";
		}
		
		System.out.println("무작위의 카드인 " + ranCard.kind + " " + ranCard.number + " 를 생성하였습니다.");

	}
}
