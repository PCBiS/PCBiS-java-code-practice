package chapter02;

public class Ex07_ByteOverflow {
	public static void main(String[] args) {
		
		byte b = 0; // byte형 변수 b를 선언하고 0으로 초기화.
		int i = 0;
		
		for (int x = 0; x <= 270; x++) { // 반복문을 이용해서 b의 값을 1씩, 0부터 270까지 증가시킨다.
			System.out.print(b++); //후위연산자(b++ / b의 값을 먼저 출력 후 값을 1 증가한다.) 
								   //전위연산자(++b / b의 값을 먼저 증가 시킨 후 출력한다.)
			// print는 출력 후 줄 바꿈을 하지 않는다.
			System.out.print('\t'); // tab을 출력한다.
			System.out.println(i++);			
		}
	}
}
