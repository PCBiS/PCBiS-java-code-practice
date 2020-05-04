package ex;

public class VariablePosition { 	// 클래스 영역
	int iv;							// 인스턴스 변수
	static int cv;					// 클래스 변수 (static변수, 공유변수)
	
	void method() { 				// 메소드 영역 (인스턴스 메소드)
		iv = 1;						// 인스턴스 메소드 영역에서는 클래스영역의 변수에 접근이 가능하다.
		int lv = 0;					// 선언 한 지역변수 - 이건 곧 소멸예정.
	}
	
	static void memoryLoadAfter() {
		iv = 0;						// 인스턴스 영역에서 선언 된 변수와
		lv = 2;						// 지역변수는 밖으로 나올 수 없다.	
		cv = 3;						// 사용을 하려면 위 처럼 변수에 static 을 선언하거나
		VariablePosition vp = new VariablePosition(); // 생성자 : 인스턴스가 생성 될 때 마다 호출되는 '인스턴스 초기화 메소드'
		vp.iv = 5;					// 인스턴스 변수를 생성하여 참조변수명(vp).인스턴스변수명(iv)으로 접근해야 한다. 
		System.out.println(lv);     // method 클래스에서 생성했던 lv라는 지역변수는 해당 블력 밖에선 소멸한다.(호출안됨)
	}
	
}
