package array_sort_homework;

public class Ex03_ReverseArray {
	public static void main(String[] args) {
		int[][] array = {{1,2,3,4},{4,5},{7,8,9},{10,11,12,13,14,15},{16,17,18,19,20}};
		revArray(array);
		
		for (int i = 0; i < array.length; i++) {			
			System.out.println("");
			for (int j = 0; j < array[i].length; j++) {				
				System.out.print(array[i][j]);
			}
		}
		
	}	
	
	// 로직 : 배열을 받으면, 마지막 행 배열을 [0] 번 배열로 보낸다.
	public static void revArray(int[][] array) {
		int[] temp;
		for (int i = 0 ; i < array.length; i++) { // 2차원 배열의 길이만큼 loop를 돈다.
			// System.out.println(array.length); 배열 길이는 5
			temp = array[i]; // 임시 배열변수 temp[] 를 선언하고 그 곳에 array[i](array[0])을 대입한다.			
			array[i] = array[array.length-1]; // array[0] 배열에 array의 마지막 배열을 대입한다.
			array[array.length-1] = temp; // 배열의 마지막 array[length-1]에 array[0]을 대입한다.		
		}
		/*
		 * 							temp = array[0]			temp = array[1]			temp = array[2]			temp = array[3]				
		 * 							array[0] = array[4]		array[1] = array[4]		array[2] = array[4]		array[3] = array[4]					
		 * 초기 값 단계				array[4] = temp			array[4] = temp			array[4] = temp			array[4] = temp				출력 단계
		 * 루프 0회차				루프 1회차				루프 2회차				루프 3회차				루프 4회차					루프 종료
		 * 0{1,2,3,4}				0{16,17,18,19,20}		4{16,17,18,19,20}		4{16,17,18,19,20}		4{16,17,18,19,20}			4{16,17,18,19,20}								
		 * 1{4,5}					1{4,5}					0{1,2,3,4}				0{1,2,3,4}				0{1,2,3,4}					0{1,2,3,4}
		 * 2{7,8,9}					2{7,8,9}				2{7,8,9}				1{4,5}					1{4,5}						1{4,5}				
		 * 3{10,11,12,13,14,15}		3{10,11,12,13,14,15}	3{10,11,12,13,14,15}	3{10,11,12,13,14,15}	2{7,8,9}					2{7,8,9}
		 * 4{16,17,18,19,20}		4{1,2,3,4}				1{4,5}					2{7,8,9}				3{10,11,12,13,14,15}		3{10,11,12,13,14,15}
		 * 
		 * 루프 1회차에 array[0] 열과 4열이 교환되고 이후 4,0열 위치 확정.
		 * 루프 2회차에	array[1] 열과 4열이 교환되고 이후 4,0,1열 위치 확정
		 * 루프 3회차에 array[2] 열과 4열이 교환되고 이후 4,0,1,2 열 위치 확정
		 * 루프 4회차(마지막)에 array[3]열과 4열이 교환되고 이후 4,0,1,2,3 열 위치 확정.
		 */ 
	}
}
