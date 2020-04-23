package tv;

public class CaptionTV extends Tv{
	String text;
	
	void caption() {
		System.out.println("자막 출력 테스트...");
	}
	
	void display() {
		super.display();
		caption();
	}
	
}
