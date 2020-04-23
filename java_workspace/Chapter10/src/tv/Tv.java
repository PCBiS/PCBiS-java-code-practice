package tv;

public class Tv {
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		channel++;
	}

	void channelDn() {
		channel--;
	}
	
	void setChannel(int channelNo) {
		this.channel = channelNo;
	}
	
	void display() {
		System.out.println("화면 영상 출력 테스트중...");		
	}

}
