package fruit;

//사과 판매 시뮬레이션 프로그램

public class FruitMainMethod {
	public static void main(String[] args) {
		
		// 인스턴스 화
		// new FruitSeller(); : 메모리에 FruitSeller.class 가 메모리에 올라간다. (Create Object)
		FruitSeller seller = new FruitSeller(); 
		// new FruitBuyer(); : 메모리에 FruitBuyer.class 가 메모리에 올라간다. (Create Object)
		FruitBuyer buyer = new FruitBuyer();
		// 구매자가 사과를 구매
		buyer.buyApple(seller, 5000);
		
		seller.myMoney();
		System.out.println("---------------");
		buyer.myMoney();		
	}
}
