package array_sort_homework;

import java.util.Scanner;

public class Ex01_ArrayMaxMin {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		int test[] = new int[10];		
		
		for (int i = 0; i < test.length; i++) {
			System.out.println("배열에 넣을 숫자를 입력하세요.");
			test[i] = sc.nextInt();
		}
		System.out.println("배열 안에 입력 된 숫자");
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + " ");
		}
		System.out.println("");	
		System.out.println(minValue(test));
		System.out.println(maxValue(test));
				
	}
	
	
	/* 
	 * 최소값 구하는 로직
	 * 		기준점을 정한다 - arr[0]
	 * 		만약 arr[0]이 arr[1]보다 크면(>) arr[1] 과 arr[0] 의 값을 교환한다.
	 * 		만약 arr[0]이 arr[1]보다 작으면(<) arr[0]을 유지한다.
	 */
				
	public static int minValue(int[] arr) {
		int min = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[0]>arr[i]) {
				min = arr[i];
				arr[i] = arr[0];
				arr[0] = min;
			}			
			//System.out.println("min : " + min);
		}
		return min;
	}
	
	
	/* 
	 * 최대값 구하는 로직
	 * 		기준점을 정한다 - arr[0]
	 * 		만약 arr[0]이 arr[1]보다 작으면(<) arr[1] 과 arr[0] 의 값을 교환한다.
	 *		만약 arr[0]이 arr[1]보다 크면(>) arr[0]을 유지한다.
	 */
	
	public static int maxValue(int[] arr) {
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
			
			if (arr[0]<arr[i]) {
				max = arr[i];
				arr[i] = arr[0];
				arr[0] = max;
			}
			//System.out.println("max : " + max);
		}
		return max;
	}
}
