package overriding;

public class Speaker {
	private int volRate;
	
	void showCurrentState() {
		System.out.println("볼륨 크기 : " + volRate);		
	}
	
	void setVol(int vol) {
		this.volRate = vol;		
	}
	
}
