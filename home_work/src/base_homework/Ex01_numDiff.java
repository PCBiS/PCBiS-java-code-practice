package base_homework;

public class Ex01_numDiff {
	public static void main(String[] args) {
		// 1. 인스턴스 변수 diff 선언(diffNum 메소드를 사용하기 위해)
		Ex01_numDiff diff = new Ex01_numDiff();	
		// 3. 결과값을 받아서 출력한다.
		System.out.println(diff.diffNum(150, 101)); 
	}

	int diffNum(int a, int b) {
		//2. a가 b보다 크면 a-b의 결과를 돌려주고, 아니면 b-a의 결과를 돌려준다.
		return a>b?a-b:b-a; 
	}
}
