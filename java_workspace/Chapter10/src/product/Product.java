package product;

/*
 *  상품 객체들의 조상 클래스.
 *  	- 상품들이 가지는 정보의 원형.
 */

public class Product {
	final int price;			// 제품의 가격
	final int bonusPoint;		// 제품을 살 때 주는 포인트.
	
	public Product(int price) {
		this.price = price;
		this.bonusPoint = price/10;
	}	
	
}
