package objectOrient_and_Instance;

public class Tv_Function {
	//Tv의 속성(Variable) -> 멤버변수, 인스턴스 변수
	String color; //TV의 색상
	boolean power; // TV의 전원
	int channel; // TV의 채널 값
	
	//TV의 기능 -> 메소드, 클래스의 멤버
	void power() { // TV의 전원을 키고 끄는 기능
		power = !power;
		System.out.println(power == true ? power = false : power != false);
	}

	void channelUP() {
		if (power != true) { // TV의 채널을 올리는 기능
			System.out.println("전원이 꺼져있습니다. 전원을 켜주세요.");
		} else {
			channel++;
			System.out.println("채널을 올립니다.");
		}
		//만약 이 안에 변수를 선언하면 지역변수가 된다. 이 밖을 나갈 수는 없음.
	}

	void channelDown() {
		if (power != true) {
			System.out.println("전원이 꺼져있습니다. 전원을 켜주세요.");
		} else {
			channel--;
			System.out.println("채널을 내립니다.");
		}
	}
	
	void channelChange(int num) {
		System.out.println("입력 받은 채널 " + num + " 번 으로 채널을 변경 합니다.");
		channel = num;
	}
}
