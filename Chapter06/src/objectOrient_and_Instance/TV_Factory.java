package objectOrient_and_Instance;

public class TV_Factory {
	public static void main(String[] args) {
		//TV인스턴스 생성
		Tv_Function tv1 = new Tv_Function();		
		
		//-------TV의 속성 값(입력 전의 기본 상태)-------------
		
		System.out.println("TV의 색상 : " + tv1.color);
		System.out.println("TV의 전원 : " + tv1.power);
		System.out.println("TV의 채널 : " + tv1.channel);
		System.out.println("------------------------");
		
		//-------TV의 속성 값-------------
		tv1.color = "red";
		tv1.power = true;
		tv1.channel = 11;
		//tv1.channelDown();
		System.out.println("TV의 채널 : " + tv1.channel);
		tv1.channelUP();
		System.out.println("TV의 채널 : " + tv1.channel);
		tv1.channelChange(16);
		System.out.println("TV의 채널 : " + tv1.channel);
		tv1.channelDown();
		System.out.println("TV의 채널 : " + tv1.channel);
	}	
}
