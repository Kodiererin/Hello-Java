package Concept;

// We are given the Matrix Dimension's in the form of an array. 
/* For Example we have an Arrays of dimensions like : [3 , 4] [4 , 5 ] , [3 , 5]
 * These are the Array Dimensions and we want to pass the array to the Function and the Function will tell us 
 * What is the Minimum no of multiplication required to multiply the Matrices
 * As there is a rule that, Suppose there are two matrices with MXN and AXB dimensiton then M must be equal to A, then only you can multiply the matrices
 * So, here you have to keep in the mind.
 * The Array passed the array will be : There are 3 matrices with respective dimensions : [2,3],[3,5],[5,6]
 * Then the Array passed in the function is [2,3,5,6]
 * So lets get started.
 * 
 */

public class concept_MatrixMultiplication1 {
	public static void main(String[] args) {
		int[] arr = {2,1,3,4};
		System.out.println(matrixChainMultiplication(arr, 0, arr.length-1));
	}
	
	public static int matrixChainMultiplication(int[] arr , int i , int j) {
		if(i+1==j) {
			return 0;
		}else {
			int res = Integer.MAX_VALUE;
			for(int k=i+1 ; k<j ; k++) {
				res = Math.min(res, matrixChainMultiplication(arr, i, k) + matrixChainMultiplication(arr, k, j) + arr[i]*arr[j]*arr[k]);
			}
			return res;
		}
	}
}
