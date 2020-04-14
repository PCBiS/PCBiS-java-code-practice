package fruit;

/*
 * 작성자	: 안정민
 * 작성일	: 2020-04-14
 * 작성목적	: 사과구매자 입장에서의 거래 기능을 구현
 *   
 * 사과구매자에게 필요한 기능 
 * 속성(Variable) - 보유한 사과의 개수(int), 지갑(int)
 * 기능(Method) - 1. 판매자를 찾는다.
 * 				  2. 쓸 수있는 돈을 확인 한다.
 * 				  3. 판매자에게 돈을 주고 판매요청을 한다. -> 돌아오는 사과의 개수(int) 
 * 				  4. 사과를 샀으면 내가 산 사과의 개수만큼 증가시킨다.
 * 				  5. 지출한 돈 만큼 내 지갑에서 차감한다.
 */


public class FruitBuyer {	
	int numOfApple = 0; 			// 사과의 개수
	int myMoney = 10000; 				// 수입	
	
	// 참조변수 : 객체의 주소값을 저장하는 변수
	void buyApple(FruitSeller seller, int money) {		
		numOfApple += seller.SaleApple(money);		
		myMoney-=money;		
	}
	
	void myMoney() {
		System.out.println("구매정보 출력");
		System.out.println("현재 사과의 개수 : " + numOfApple);
		System.out.println("남은금액 : " + myMoney);
	}
}
