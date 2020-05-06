package ex;

public class Calculator {
	
	// 메소드의 실행 회수.
	int opCnt = 0;
	
	synchronized int add(int n1, int n2) {
		synchronized (this) {
			opCnt++;
		}	
		return n1 + n2;
	}
	synchronized int min(int n1, int n2) {
		synchronized (this) {
			opCnt++;
		}
		return n1 - n2;
	}
	
	public void showOpCnt(){
		System.out.println("메소드에 접근 한 총 회수 : " + opCnt);
	}
	
}
