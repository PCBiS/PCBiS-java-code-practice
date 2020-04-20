package array;

public class Ex03_ArrayAndMethod {
	public static void main(String[] args) {
		// 원본배열 선언
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

		// 결과 저장할 배열 선언
		int[] ref;
		// 메소드 호출 후 결과를 ref에 저장
		ref = addAllArray(arr, 10);
		System.out.println("동일 배열 참조여부 확인 : " + (arr == ref));

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] addAllArray(int[] arr, int addVal) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + addVal;
		}
		return arr;
	}
}
