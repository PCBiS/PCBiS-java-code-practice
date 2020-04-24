package product;

public class Audio extends Product{
	public Audio(int price) {
		super(price);
	}
	
	@Override
	public String toString() {		
		return "Audio";
	}
	
	void music() {
		System.out.println("음악을 듣습니다.");
	}
	
}
