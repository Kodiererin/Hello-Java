package d_DynamicProgramming;

public class c_MaximumSumWithNoConsecutive {
	public static void main(String[] args) {
		int[] arr = {10,5,15,20,2,30};
		System.out.println(solution1(arr, arr.length));
		System.out.println(solution2(arr));
//		This is the most efficient solution
		System.out.println(solution3(arr));
	}
	
//	Recursive Solution
	public static int solution1(int[] arr , int n) {
		if(n==1) {
			return arr[0];
		}
		else if(n==2) {
			return Math.max(arr[0],arr[1]);
		}else {
			return Math.max(solution1(arr, n-1), solution1(arr, n-2)+arr[n-1]);
		}
	}
	
//	Dynamic Programming Solution
	public static int solution2(int[] arr) {
		int[] dp = new int[arr.length+1];
		dp[1] = arr[0];
		dp[2] = Math.max(arr[0], arr[1]);
		
		for(int i=3 ; i<=arr.length ; i++) {
			dp[i] = Math.max(dp[i-1], dp[i-2]+arr[i-1]);
		}
		
		return dp[dp.length-1];
	}
	
//	Space Optimized Solution
	public static int solution3(int[] arr) {
		if(arr.length==1) {
			return arr[0];
		}
		int prev_prev = arr[0];
		int prev = Math.max(arr[0], arr[1]);
		int res = prev;
		for(int i=3 ; i<=arr.length ; i++) {
			res = Math.max(prev, prev_prev+arr[i-1]);
			prev_prev = prev;
			prev=res;
		}
		return res;
	}
}
