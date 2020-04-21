package twoDimensional;

public class Ex01_twoDimenArray {
	public static void main(String[] args) {
		// 1차원 배열 선언, 생성
		int[][] array = new int[5][4];
		
		/*
		 * array[행의 위치][1차원 배열의 index(열의 위치)]
		 * array[0~2][0~3]
		 */ 
		/*
		System.out.println("2차원 배열의 크기 : " + array.length);
		System.out.println("1차원 배열(array[0])의 크기 : " + array[0].length);
		System.out.println("1차원 배열(array[1])의 크기 : " + array[1].length);
		System.out.println("1차원 배열(array[2])의 크기 : " + array[2].length);
		*/
		
		for (int i = 0; i < array.length; i++) { // 2차원 배열(행)의 반복			
			for (int j = 0; j < array[i].length; j++) { // 1차원 배열의 요소 참조
				array[i][j] = i+j;
			}
		}
		
		for (int i = 0; i < array.length; i++) { // 2차원 배열(행)의 반복
			System.out.println();
			for (int j = 0; j < array[i].length; j++) { // 1차원 배열의 요소 참조
				System.out.print(array[i][j]+"\t");
			}
		}				
	}
}
