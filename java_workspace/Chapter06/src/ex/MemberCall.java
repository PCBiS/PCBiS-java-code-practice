package ex;

public class MemberCall {
	//인스턴스 변수
	int iv = 10;
	//클래스 변수, 스태틱 변수
	static int cv=100; 
	
	int iv2 = cv;
	static int cv2 = new MemberCall().iv; 
	
	static void staticMethod() {
		MemberCall mc = new MemberCall();
		// 사용하기 위해서는 위의 cv와 같이 static 변수로 만들거나
		// 호출하여 메모리에 올리고 사용을 하여야 한다.
		
		System.out.println("Static Method");
		//스태틱 멤버 출력
		//System.out.println(iv); 생성시점 문제로 인하여 에러가 남
		System.out.println(mc.iv);
		//instance 멤버 출력
		System.out.println(cv);
		System.out.println("--------------");
	} 
	
	void instanceMethod() {
		System.out.println("Instance Method");
		//스태틱 멤버 출력
		System.out.println(iv);
		//instance 멤버 출력
		System.out.println(cv);
		System.out.println("--------------");
	}
	
}
