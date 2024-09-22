//	public static int maxArea1(int[] height) {
//		if(height.length==0) {
//			return 0;
//		}
//		else {
//			int most = Integer.MIN_VALUE;
//			for(int i=0 ; i<height.length ; i++) {
//				for(int j=i+1 ; j<height.length ; j++) {
//					most = Math.max(most, Math.min(height[i], height[j])*(j-i));
//					System.out.println(most);
//				}
//			}
//			return most;
//		}
//	}
package Coding;

import java.util.ArrayList;

public class Solution {

//	Generate all the Permutation
	public static void generateAll(int[] arr, int start, int end) {
	    if (start == end) {
	        printArray(arr);
	    } else {
	        for (int i = start; i <= end; i++) {
	            swap(arr, start, i);
	            generateAll(arr, start + 1, end);
	            swap(arr, start, i); // Backtrack
	        }
	    }
	}

	public static void printArray(int[] arr) {
	    for (int num : arr) {
	        System.out.print(num + " ");
	    }
	    System.out.println();
	}

	public static void swap(int[] arr, int i, int j) {
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	
	
	
	
	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		generateAll(height , 0 , height.length-1);
	}
}
