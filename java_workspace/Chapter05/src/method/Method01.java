package method;

public class Method01 {
	/*
	 * 메소드 : 특정 기능을 수행하기 위한 코드를 묶어 놓은 것.
	 * 	ㄴ데이터가 필요 할 때 매개변수를 선언하고 데이터를 받는다.
	 *  ㄴ특정기능 : Data를 Manipulate 하기 위한 것 - 도구들 : 연산자, 반복문, 제어문 등등...
	 *  ㄴ메소드의 핵심은 규칙대로 무언가를 넣으면 과정은 모르지만 결과값을 출력하는 것.
	 *  
	 * Method를 사용하기 위해선 클래스를 메모리에 로드 해야 한다.
	 */ 
	public static void main(String[] args) { // 반환타입(void) 메소드이름(MyMath) 매개변수(10, 100)
		MyMath math = new MyMath();			 // 반환하는 것이 없다면 void를 선언한다. 그 이외에는 자료형을 선언.
		long result = math.add(10, 100); // 메소드 호출이 끝나면 종료하고 다음 행으로 내려간다.	
		
		System.out.println(result);
		System.out.println(math.add(33, 67));
		
	}
}
