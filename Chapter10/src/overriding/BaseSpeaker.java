package overriding;

public class BaseSpeaker extends Speaker {
	private int bRate;
	
	void setBRate(int base) {		
		this.bRate = base;
	}

	@Override
	void showCurrentState() {
		super.showCurrentState();
		System.out.println("베이스의 크기 : " + bRate);
	}

	@Override
	public String toString() {
		return "베이스 스피커";
	}	
}
