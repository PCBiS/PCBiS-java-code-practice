package operator_homework;

public class Answer04_ABC_TrueFalse {
	public static void main(String[] args) {
		int a,b,c;
		a = (((25+5)+(36/4))-72)*5;
		b = (((25*5)+(36-4))-71)/4;
		c = (128/4)*2;
		
		System.out.println("DEBUG!!!  a:" + a + " b:" + b + " c:" + c ); 
		// a : 165, b : 21, c : 64 임으로 a는 b보다 작고 b는 c보다 작다.
		// 결과적으로 a > b > c = false 임으로
		
		if(a > b && b > c && a > c == true ) {
		//if(a < b && b < c && a < c == true ) { // 만약 a<b<c 조건으로 if문을 수행하면 a<b<c = true임으로 true를 출력한다.
			/*
			 * a가 b보다 크고 = false (여기가 false이기 때문에 해당 절 이하는 계산을 생략함)
			 * b가 c보다 크고 = false (사실 여기도 계산이 안됨, 왜냐하면 a>b>c 가 모두 성립해야 true가 나오기 때문)
			 * a가 c보다 크고 = false (결과적으로 여기도 필요는 없는 부분) 
			 */
			System.out.println(true); // false임으로 해당 절은 출력 할 수 없다.
		}else {
			System.out.println(false); // false임으로 return 되는 값은 false 이다.
		}
		
	}	
}
