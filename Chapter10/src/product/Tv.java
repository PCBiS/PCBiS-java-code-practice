package product;

public class Tv extends Product{
		
	public Tv(int price) {
		super(price);		
	}
	
	@Override
	public String toString() {		
		return "TV";
	}
	
	void display() { // 고유한 기능		
		System.out.println("TV를 시청합니다.");
	}
	
}
