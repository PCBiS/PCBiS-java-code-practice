package overriding;

public class Overriding_Test {
	public static void main(String[] args) {		
		// 다형성 : 상위클래스 타입의 참조변수에 하위클래스의 인스턴스를 참조 하는 것.
		Speaker sp = new BaseSpeaker();
		// 참조변수 sp는 BaseSpeaker가 가지던 인스턴스 멤버 중 공통된 부분만을 사용 할 수 있다.
		sp.showCurrentState();
		sp.setBRate(100); // <- setBRate는 BaseSpeaker가 고유하게 가지는 기능이기 때문에 다르다.
		
		
		System.out.println("----------------------------------------------");
		
		BaseSpeaker bSpeaker = new BaseSpeaker();
		
		bSpeaker.setVol(10);			// 상속 받은 스피커 볼륨 기능 (볼륨설정)
		bSpeaker.setBRate(20);			// 재정의한 기능 (베이스 볼륨 설정)
		bSpeaker.showCurrentState();	// 볼륨 출력하기.
		
		System.out.println(bSpeaker);	// .toString 을 호출 하는 것 과 동일한 행위.
	}
}
