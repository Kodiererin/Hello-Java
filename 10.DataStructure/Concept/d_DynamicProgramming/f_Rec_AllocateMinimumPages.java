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

public class f_Rec_AllocateMinimumPages {
//	This is a Recursive Solution
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
	
	public static int minPages(int[] pages , int books , int students) {
		if(students==1) {
			return sum(pages,0,books-1);
		}
		if(books==1) {
			return pages[0];
		}
		int res = Integer.MAX_VALUE;
		for(int i=1 ; i<books ; i++) {
			res = Math.min(res , Math.max(minPages(pages, i, students-1), sum(pages , i , books-1)));
		}
		return res;
	}
	
	
	public static int sum(int[]pages , int start , int end) {
		int sum = 0;
		for(int i=start ; i<=end  ; i++) {
			sum = sum+pages[i];
		}
		return sum;
	}
}
