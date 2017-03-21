package sorting;

/**
 * Program to do MergeSort 
 */

import java.util.Scanner;
import java.util.Arrays;

public class MergeSort {

	public static int[] a = new int[50];
	
	public static void main(String args[]) {
		new MergeSort();
	}
	
	public MergeSort() {
		
		int num, i;
		System.out.println("  MergeSort Program  ");
		System.out.println();
		System.out.println();
		System.out.println("Enter the number of elements you want to sort");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println();
		System.out.println("Please enter " + num + " elements");
		for(i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		merge_sort(1, num);
		System.out.println();
		System.out.println("so the sorted list using merge sort is: ");
		System.out.println();
		System.out.println();
		for(i = 0; i <= num; i++) {
			System.out.println(a[i] + " ");
		}
	}
	
	public static void merge_sort(int low, int high) {
		int mid;
		if(low < high) {
			mid = (low + high)/2;
			merge_sort(low, mid);
			merge_sort(mid+1, high);
			merge(low, mid, high);
		}
	}
	public static void merge(int low, int mid, int high) {
		int h,i,j,k;
		int[] b = new int[50];
		h = low;
		i = low;
		j = mid+1;
		
		while((h <= mid) && (j <= high)) {
			if(a[h] <= a[j]) {
				b[i] = a[h];
				h++;
			}
			else {
				b[i] = a[j];
				j++;
			}
			i++;
		}
		if(h > mid) {
			for(k = j; k <= high; k++) {
				b[i] = a[k];
				i++;
			}
		}
		else {
			for(k = h; k <= mid; k++) {
				b[i] = a[k];
				i++;
			}
		}
		for(k = low; k <= high; k++) {
			a[k] = b[k];
		}
	}
}
