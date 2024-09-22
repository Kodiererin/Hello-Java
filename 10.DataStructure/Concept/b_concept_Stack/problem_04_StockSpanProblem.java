package b_concept_Stack;
//	This is the popular interview Question
//	i/p : arr[] = {13,15,12,14,16,8,6,4,10,30}
//	o/p : 			1,2,1,2,6,1,1,1,5,10

//	Problem : We are given an array of integers these integers represent the prices of a stock on n consecutive days our task is to find out the
//	span of stack on everyday.

//	Span : no of consecutive days when the price of the days is equal or saller.
//	Current Item is always included som minimum calue of day >=1.
//	This is the popular interview question so Lets crack it!.

public class problem_04_StockSpanProblem
{
//	Lets start with naive solution
//	This Solution might be wrong.
	public static void naive_Solution(int[] arr , int n)
	{
		for(int i=0 ; i<n ; i++)
		{
			int span =1;
			for(int j=i-1 ; j>0 && arr[j] <=arr[i] ; j--)
			{
				 span++;
				 System.out.println(span);
			}

		}
	}
	public static void efficient_Solution(int[] arr , int n)
	{
		java.util.Stack<Integer> s = new java.util.Stack<>();
		s.add(0);
		System.out.println(1);
		for(int i=1 ; i<n ; i++)
		{
			while(!s.isEmpty() && arr[s.peek()]<=arr[i])
			{
				s.pop();
			}
			int Span = s.isEmpty()? i+1 : i-s.peek();
			System.out.println(Span);
			s.push(i)	;
		}
	}
	public static void main(String[] args)
	{
		int arr[] = {13,15,12,14,16,8,6,4,10,30};
		naive_Solution(arr,arr.length);
		efficient_Solution(arr,arr.length);
	}
}
