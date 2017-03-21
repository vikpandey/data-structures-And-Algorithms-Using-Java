package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = new int[] {4,7,3,5,2};
		
		sort(arr);
		int[] sortedArray = sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(sortedArray[i] + " ");
		}
	}
	
	public static int[] sort(int[] arr) {
		int length = arr.length;
		int temp;
		for(int i = length; i > 0; i--) {
			for(int j = 0; j < length-1; j++) {
			if(arr[j] > arr[j+1]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
			}
		}
		return arr;
	}
}
