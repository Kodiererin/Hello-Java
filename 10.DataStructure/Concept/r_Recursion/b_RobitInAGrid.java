package r_Recursion;

public class b_RobitInAGrid {
	public static void main(String[] args) {
		int[][] arr = {
				{1,0,0,0},
				{1,1,0,1},
				{0,1,0,0},
				{1,1,1,1}
		};
		
		System.out.println(GetData2(arr, 0, 0));
		
		
	}

//	This is a Naive Solution
	public static boolean GetData1(int[][] arr , int i , int j) {
		if(i==3 && j==3) {
			return true;
		}
		if(i+1<arr.length && arr[i+1][j]!=0) {
			return GetData1(arr, i+1, j);
		}else if(j+1<arr.length && arr[i][j+1]!=0) {
			return GetData1(arr, i, j+1);
		}else {
			return false;
		}
	}
	
//	Optimised Code
	public static boolean GetData2(int[][] arr , int i , int j) {
		return i+1<arr.length? GetData2(arr, i+1, j) : j+1<arr.length? GetData2(arr, i, j+1) : i==arr.length-1 && j==arr.length-1? true : false;
		
	}
}
