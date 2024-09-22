package d_DynamicProgramming;

/*
 * 	I/P : [1 , 2 , 3]  - : Sum 4			Find the Number of Combinations of Coins that could lead to the sum.
 * 	Output : 4
 */	

public class b_CoinChange {
	public static void main(String[] args) {
		int[] arr = {2,5,3};
		int sum = 5;
//		System.out.println(recursiveApproach(arr, sum , arr.length));
		System.out.println(countWays(5));
	}
//	Recursive Approach
	public static int recursiveApproach(int[] arr , int sum , int n) {
		if(sum<0) {
			return 0;
		}
		if(sum==0) {
			return 1;
		}
		if(n==0) {
			return 0;
		}
		return recursiveApproach(arr, sum-arr[n-1], n) + recursiveApproach(arr, sum, n-1);
	}
//	This is a GFG Question
	static int countWays(int n)
    {
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = i+1;
        }
        return countWaysRecursion(arr , n , n-1);
    }
    
    public static int countWaysRecursion(int[] arr , int total , int n){
        if(n==0 || total<0){
            return 0;
        }
        if(total==0){
            return 1;
        }
        return countWaysRecursion(arr,total-arr[n-1] , n) + countWaysRecursion(arr,total,n-1);
    }
}
