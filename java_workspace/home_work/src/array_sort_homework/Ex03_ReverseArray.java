package array_sort_homework;

public class Ex03_ReverseArray {
	public static void main(String[] args) {
		int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
		revArray(array);
	}	
	
	// 로직 : 배열을 받으면, i행 배열을 역순으로 출력한다.
	public static void revArray(int[][] array) {
		for (int i = array.length-1; i >= 0; i--) { // i는 array의 길이-1 만큼(2) i가 0보다 크거나 같은 동안 i값을 1씩 빼며 루프를 돈다. 
			System.out.println("");	//줄 단위로 엔터 쳐줄 목적
			for (int j = 0; j < array[i].length; j++) {	// j는 0이고, j가 array[i]의 길이보다 클 때 까지 j값을 증가시키며 루프
				System.out.print(array[i][j]); // 결과적으로 역순[i열 역순, j열 정순]으로 배열을 찍는다.
			}
		}
	}
}
