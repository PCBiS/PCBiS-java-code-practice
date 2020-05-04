package product;

public class Computer extends Product {
	public Computer(int price) {
		super(price);
	}
	
	@Override
	public String toString() {		
		return "Computer";
	}
	
	void programming() { // 고유한 기능		
		System.out.println("프로그래밍을 수행합니다.");
	}
}
