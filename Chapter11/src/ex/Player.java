package ex;

/*
 *  클래스 이름 앞에 abstract가 있을경우 이 클래스는 추상클래스임을 의미한다.
 *  추상 클래스는 미완성 된 클래스다.
 *  클래스 멤버 중, 추상 메소드를 하나라도 포함 하고 있는 경우 -> 추상 클래스
 *  
 *  추상 메소드 : 미완성 된 메소드 
 */
public abstract class Player {
	int currentPos;
	
	Player(){
		
	}
	
	// 추상 메소드 선언 구조 - abstract 반환형  메소드이름 (매개변수);
	abstract void play(int pos);
	
	// 추상 메소드
	abstract void stop();
	
	void play() {
		play(currentPos);
	}
}
