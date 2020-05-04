package exercise3;

public class Exercise3_2 {
	public static void main(String[] args) {
		int numOfApples = 123;	// 사과의 개수
		int sizeOfBucket = 10;	// 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = (numOfApples / sizeOfBucket > 0 ) ? numOfApples / sizeOfBucket + 1 : 1;	// 모든 사과를담는데 필요한 바구니의 수
		// 삼항연산자로 쓴 위 코드의 해석
		// (numOfApples(사과 개수) / sizeOfBucket(바구니크기) > 0) ? = 123/10 = 12 임으로 0보다 크다. 그럼으로 true.
		// true임으로 사과개수 / 바구니크기 = 12 이고 나머지 남은 사과 3개도 담아야 하니 1개가 추가로 더 필요하여 총 13개.
		// 만약 false가 나온다면(사과가 10개 이하) 인경우는 1을 리턴한다. 
		// 단 로직의 약점은 사과의 개수가 10개일 경우 2를 리턴하기 때문에 로직으로는 맞지만, 현실적으로는 안맞는다.					

		System.out.println("필요한바구니의 수 :" + numOfBucket); // 결과는 13개가 필요하다.
	}
}
