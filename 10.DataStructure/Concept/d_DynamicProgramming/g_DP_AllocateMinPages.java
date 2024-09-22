package d_DynamicProgramming;

/*	Problem : You are given an
 * 	1. An array of n books where the each element in the array says the no of pages in the book
 * 	2. No of Students. 
 * 	Your task is to assign the books to the students where each student gets allocated the minimum no of pages.
 * 	Condition : The student must read the consecutive books. He/She must not read the books which are in inordered manner.
 * 
 * 
 * Input : pages[] = {10,20,30,40} 				No of students : 2			|  		Output : 60
 * Input : pages[] = {10,20,30}					No of students : 1			|  		Output : 60
 * Input : pages[] = {10,5,30,1,2,5,10,10} 		No of students : 3			|  		Output : 30
 */

//	This is a DP Based Solution

public class g_DP_AllocateMinPages {
	public static void main(String[] args) {
		System.out.println("Computing Minimum Pages");
		int[] pages = {10,20,30,40};
		int books = pages.length;
		int student = 2;
		
		System.out.println(minPages(pages, books, student));
		int[] pages2 = {10,5,30,1,2,5,10,10};
		books = pages.length;
		student = 3;
		System.out.println(minPages(pages2, books, student));
	}
	
	// Remember books = pages.length
	
	
	public static int minPages(int pages[] , int books , int student) {
		int dp[][] = new int[student+1][books+1];
		for(int i=1 ; i<=books ; i++) {
			dp[1][i] = sum(pages, 0 , i-1);
		}
		
		for(int i=1 ; i<=student ; i++) {
			dp[i][1] = pages[0];
		}
		
		for(int i=2 ; i<=student ; i++) {
			for(int j=2 ;j<=books ; j++) {
				int res = Integer.MAX_VALUE;
				for(int p=1 ; p<j ; p++) {
					res = Math.min(res,Math.max(dp[i-1][p], sum(pages,p,j-1)));
				}
				dp[i][j] = res;
//				System.out.println(i+" "+j+" "+res);
			}
		}
		return dp[student][books];
	}
	
	public static int sum(int[]pages , int start , int end) {
		int sum = 0;
		for(int i=start ; i<=end  ; i++) {
			sum = sum+pages[i];
		}
		return sum;
	}

}
