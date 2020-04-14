package objectOrient_and_Instance;

public class Tv_Function {
	String color;
	boolean power;
	int channel;	
	
	void power() {
		power = !power;
		System.out.println(power==true?power=false:power!=false);
	}

	void channelUP() {
		if (power!=true) {
			System.out.println("전원이 꺼져있습니다. 전원을 켜주세요.");
		}else {
			channel++;
			System.out.println("채널을 올립니다.");
		}
		
	}

	void channelDown() {
		if (power!=true) {
			System.out.println("전원이 꺼져있습니다. 전원을 켜주세요.");
		}else {
			channel--;
			System.out.println("채널을 내립니다.");
		}
	}
}
