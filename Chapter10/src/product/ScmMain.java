package product;

public class ScmMain {
	public static void main(String[] args) {
		/*
		 * 상속관계에서 다형성
		 * 	- 상위클래스 타입의 참조변수 = 하위클래스의 인스턴스.  
		 */
		
		/*
		Product p1 = new Tv(1000);
		System.out.println(p1);
		
		Tv tv = new Tv(100);
		Computer com = new Computer(80);
		Audio av = new Audio(50);
		
		int sum = tv.price + com.price + av.price;
		System.out.println(sum);
		
		Product p01 = (Product)tv;
		Product p02 = com;
		Product p03 = av;
		*/
		
		//==================================================
		
		Product[] products = new Product[3];
		products[0] = new Tv(200);
		products[1] = new Computer(350);
		products[2] = new Audio(150);
		
		int sumPrice = 0;
		int sumPoint = 0;
		
		for (int i = 0; i < products.length; i++) {
			if (products[i] instanceof Computer) {				
				((Computer)products[i]).programming();
			}
			System.out.println(products[i]);
			sumPrice += products[i].price;
			sumPoint += products[i].bonusPoint;
		}
		
		System.out.println("전체 제품의 가격의 합 : " + sumPrice);
		System.out.println("전체 제품의 포인트의 합 : " + sumPoint);
		
		/*
		 *  instanceOf : 참조 변수가 참조하는 instance를 특정 클래스 타입으로
		 *  			 변환이 가능한지 확인을 하는 연산자.
		 */
		
		


		//==================================================
		
		/*
		Buyer buyer = new Buyer();
		
		Tv product1 = new Tv(100);
		Computer product2 = new Computer(150) ; 
		Audio product3 = new Audio(50);
		
		//TV를 구매
		buyer.buy(product1);
		//컴퓨터를 구매
		buyer.buy(product2);
		//오디오를 구매
		buyer.buy(product3);		
		
		
		
		System.out.println("buyer의 잔여 금액 : " + buyer.money);
		System.out.println(" buyer의 보유 포인트 : " + buyer.bonusPoint);
		System.out.println(" buyer가 산 물건 목록 : " + buyer.item);
		*/
	}	
}
