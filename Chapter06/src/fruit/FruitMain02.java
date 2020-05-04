package fruit;

public class FruitMain02 {
	public static void main(String[] args) {
		FruitSeller seller01 = new FruitSeller();
		FruitSeller seller02 = new FruitSeller(50,0,1000);
		
		seller01.myMoney();
		seller02.myMoney();
		
		FruitBuyer buyer01 = new FruitBuyer(0, 20000);
		FruitBuyer buyer02 = new FruitBuyer();
		FruitBuyer buyer03 = new FruitBuyer();
		
		buyer01.myMoney();
		buyer02.myMoney();
		buyer03.myMoney();
		
		buyer01.buyApple(seller01, 10000);
		buyer02.buyApple(seller01, 5000);
		buyer03.buyApple(seller02, 10000);
		
		seller01.myMoney();
		seller02.myMoney();
	}
}
