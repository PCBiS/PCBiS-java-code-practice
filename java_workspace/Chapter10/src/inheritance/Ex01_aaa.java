package inheritance;

public class Ex01_aaa {
	int num1, num2; // private는 상속 불가능.
	
	Ex01_aaa(){	// 생성자블럭
		num1 = 10; // 이 단에서 초기화를 해야
		num2 = 55;	// 불필요한 메모리 낭비를 막을 수 있다.
	}
}
