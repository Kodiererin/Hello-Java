package Test;

import java.util.Arrays;

public class TestingArraysSort {
	public static void main(String[] args) {
		int[][] arr= {{0,1},{2,4},{3,4},{4,5}};
		Arrays.sort(arr,(a,b)->a[1]-b[1]);
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[0].length ; j++) {
				System.out.print(arr[i][j]+" " );
			}
			System.out.println();
		}
	}
}
