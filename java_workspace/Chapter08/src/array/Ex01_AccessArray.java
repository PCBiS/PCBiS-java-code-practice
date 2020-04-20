package array;
// 1. int 타입의 정수 데이터 3개를 저장 할 수 있는 배열을 생성
// 2. 배열의 이름은 arr
public class Ex01_AccessArray {
	public static void main(String[] args) {
		int[] arr; // 배열의 선언 단계
		arr = new int[3]; // 배열 인스턴스 생성 (요소의 저장공간 생성)
		
		// 배열 요소의 참조 및 접근
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		try {
			arr[3] = 4; // OutofBoundExeception 발생
			//(배열 범위 밖을 넘어서는 곳에 엑세스 시도 했기 때문.)
		} catch (Exception e) {
			System.err.println("에러 발생! : 다시 확인해보세요");
		}
		
		int sum = arr[0] + arr[1] + arr[2];
		System.out.println("arr 배열내의 합 : " + sum);
		 

		
	}
}
