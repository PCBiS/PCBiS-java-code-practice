package product;

public class Buyer {
	int money; 		// 구매자의 보유금액
	int bonusPoint; // 구매자의 보유 포인트.
	int count;
	Product[] item; // 구매자가 구매하여 보유 한 제품

	Buyer() {
		this.money = 1000;
		this.bonusPoint = 0;
		this.item = new Product[10];
		this.count = 0;
	}

	void buy(Product product) {
		// 구매 금액과 구매하고자 하는 나의 보유금액을 비교해서 구매 여부를 확인
		if (this.money < product.price) {
			System.out.println("보유 한 금액이 부족하여 물건을 살 수 없습니다.");
		} else {
			// 구매금액이 충족된다면 물건을 구매한다.
			if (this.count > item.length-1) {
				System.out.println("더 이상 물건을 살 수 없습니다.");				
			}else {
				item[count] = product;
				this.money -= product.price;
				this.bonusPoint += product.bonusPoint;
				this.count++;
				System.out.println(product.toString() + " 을 구매하였습니다.");
			}
		}
	}		
}
