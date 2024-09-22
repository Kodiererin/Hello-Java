package d_DynamicProgramming;

//	Dynamic Programming Uses the Concept of Memoization which is Necessary for Dynamic Programming.
//	Memoization takes up the space but it saves a Lot of Time.

public class a_Intro {
	public static void main(String[] args) {
		int n = 100;
		System.out.println(findFibo_DynamicProgramming(n));;
		System.out.println(findFibo_Recursion(n));;			// for larger value of n it will not work
	}

//	This is Dynamic Programming in which we use the concept of Memoization.
	private static int findFibo_DynamicProgramming(int n) {
		int[] arr = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		int sum = 1;
		for(int i=2 ; i<=n ; i++) {
			arr[i] = arr[i-1]+arr[i-2];
			sum+=arr[i];
		}
		return arr[n];
	}
//	Take any Larger value of N and it will not work.
	private static int findFibo_Recursion(int n) {
		if(n<=0) {		
			return 0;
		}
		else if(n==1) {
			return 1;
		}else {
			return findFibo_Recursion(n-1)+findFibo_Recursion(n-2);
		}
		
	}
}
