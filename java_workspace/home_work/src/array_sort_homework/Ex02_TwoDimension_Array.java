package array_sort_homework;

public class Ex02_TwoDimension_Array {
	public static void main(String[] args) {
		int[][] line = {{1,2,3,4,5,6,7}, {7,6,5,4,3}, {1,2,3,4,5,6,7}, {6,7}};		
		addTwoDArr(line, 2);
	}
	
	public static void addTwoDArr(int[][] arr, int add) {
		for (int i = 0; i < arr.length; i++) { // 1차원 길이를 계산해야함.
			System.out.println(""); // arr[i] 값은 메모리 주소 값
			for (int j = 0; j < arr[i].length; j++) { // 2차원 길이(arr[i]의 길이를 확인해야함.
				System.out.print(arr[i][j]+add); // 불러온 값에 add를 더함.
			}
		}
	}
}
