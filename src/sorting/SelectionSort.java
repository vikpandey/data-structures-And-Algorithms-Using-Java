package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr = new int[] {4,7,3,5,2};
		
		sort(arr);
		int[] sortedArr = sort(arr);
		for(int i = 0; i < sortedArr.length; i++) {
			System.out.print(sortedArr[i]+" ");
		}
	}
	
	public static int[] sort(int[] arr) {
		int currentMinimum, temp;
		for(int i = 0; i < arr.length -1; i++) {
			currentMinimum = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[currentMinimum]) {
					currentMinimum = j;
					if(currentMinimum != i) {
						temp = arr[currentMinimum];
						arr[currentMinimum] = arr[i];
						arr[i] = temp;
					}
				}
			}
		}
		return arr;
	}

}
