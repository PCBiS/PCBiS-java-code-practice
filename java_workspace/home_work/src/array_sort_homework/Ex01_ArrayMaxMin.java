package array_sort_homework;

public class Ex01_ArrayMaxMin {
	public static void main(String[] args) {
		int test01[] = {8,6,7,4,10,3};
		int test02[] = {11,8,6,7,4,10,3,17,21,14,13};
		
		System.out.println(minValue(test01));
		System.out.println(maxValue(test02));
				
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
