package array_sort_homework;

public class addAllArray {
	int[] addAllArray(int[] ar, int add) {
		for (int i = 0; i < ar.length; i++) {
			ar[i] += add;
		}		
		return ar;
	}
	
	
	public static void main(String[] args) {
		addAllArray allSum = new addAllArray();		
		int[] arr = {1,2,3,4,5};
		int[] ref = new int[5];		
		ref = allSum.addAllArray(arr, 7);		
		System.out.println(arr!=ref?"다른배열":"같은배열");
		for (int i = 0; i < ref.length; i++) {
			System.out.print(arr[i] + " ");
			System.out.print(ref[i] + " ");
		}		
		
	}
	
}
