package d_DynamicProgramming;

public class e_SumSubsetProblem {
	public static void main(String[] args) {
		int[] arr = {10,5,2,3,6};
		int sum = 8;
		System.out.println(countSubSets(arr, arr.length, sum));
		System.out.println(countSubSetsDP(arr, sum));
		
	}
	
//	This is a DP Solution.
	static int countSubSetsDP(int[] arr , int sum) {
		int n = arr.length-1;
		int[][] dp = new int[n+1][sum+1];
		
//		Initializing the first column as 1 and first row as 0 because of the sum is 0 then automatically the answer is 1
		for(int i=1 ; i<=n ; i++) {
			dp[i][0] = 1;
		}
		for(int j=1 ; j<=sum ; j++) {
			dp[0][j] = 0;
		}
		
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=sum ; j++) {
				if(j<arr[i-1]) {
					dp[i][j]= dp[i-1][j];
				}else {
					dp[i][j] = dp[i-1][j] + dp[i][j-arr[i-1]];
				}
			}
		}
		
		return dp[n][sum];
	}
	
	static int countSubSets(int[] arr , int n , int sum) {
		for(int i=0 ; i<n ; i++) {
//			System.out.print(arr[i]+" ");
		}
//		System.out.println();
		if(n==0) {
			return sum==0?1:0;
		}else {
			return countSubSets(arr, n-1, sum)+countSubSets(arr, n-1, sum-arr[n-1]);
		}
	}
	
	
}
