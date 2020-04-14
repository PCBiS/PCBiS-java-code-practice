package fruit;

/*
 * 작성자	: 안정민
 * 작성일	: 2020-04-14
 * 작성목적	: 사과장수 입장에서의 거래 기능을 구현
 *   
 * 사과장수에게 필요한 기능 
 * 속성(Variable) - 사과의 개수(int), 수입(int), 사과의 가격(int, 상수)
 * 기능(Method) - 1. 돈을 받는다. -> 매개변수 : money(int)
 * 				  2. 받은 돈에 해당하는 사과의 개수를 구한다.
 * 				  3. 나의 사과 개수에서 반환 해야 하는 사과의 개수를 빼준다.
 * 				  4. 받은 금액은 나의(사과장수의 myMoney)수입으로 더해준다
 * 				  5. 사과의 개수를 반환한다. -> 매개변수 : apple(int)
 */

public class FruitSeller {
	int numOfApple = 20; 			// 사과의 개수
	int myMoney = 0; 				// 수입
	final int PRICEOFAPPLE = 1000; 	// 사과의 가격

	int SaleApple(int money) {
		int apple = money / PRICEOFAPPLE; // 돌려줄 사과 개수 = 금액 / 사과가격
		numOfApple -= apple; // 보유한 사과 개수 = 보유한 사과 개수 - 팔 사과 개수 
		myMoney += money; // 내 돈 = 내돈 + 들어온 돈
		System.out.println("구매자가 " + money + " 원을 지불하여 사과 " + apple + " 개를 구매하였습니다." );
		return apple; // 판 사과를 준다.
	}
	
	void myMoney() {
		System.out.println("판매정보 출력");
		System.out.println("현재 사과의 개수 : " + numOfApple);
		System.out.println("판매금액 : " + myMoney);
	}
}
