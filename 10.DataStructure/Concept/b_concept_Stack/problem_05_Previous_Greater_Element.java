package b_concept_Stack;
/*	Given an Array of distinct Integer, find the closest(Position-wise) greater on left of every element. If there is no greater element on left then print -1.
 */
//		i/p : arr[] = {15 , 10 , 18 , 12 , 4 , 6 , 2 , 8}
//		o/p : 			-1, 15 , -1 , 18 , 12 , 6 , 12
public class problem_05_Previous_Greater_Element
{
//	This is a Naive Solution
	public static void naiveSolution(int[] arr , int n)
	{
		for(int i=0 ; i<n ; i++)
		{
			int j;
			for(j = i-1 ; j>=0 ; j--)
			{
				if(arr[j]>arr[i])
				{
					System.out.println(arr[j]);
					break;
				}
			}
			if(j==-1)
			{
				System.out.println(-1);
			}
		}
	}

	//	This is a Efficient Solution -> O(n)
	public static void efficientSolution(int[] arr , int n)
	{
		java.util.Stack<Integer> s = new java.util.Stack<>();
		s.add(arr[0]);
		for(int i=0  ;i<n ; i++)
		{
			while(!s.isEmpty() && s.peek()<=arr[i])
			{
				s.pop();
			}
			int pg = (s.isEmpty())?-1:s.peek();
			System.out.println(pg);
			s.add(arr[i]);
		}
	}

	public static void main(String[] args)
	{
		int[] arr = {15,10,18,12,4,6,2,8};
//		naiveSolution(arr,arr.length);
		efficientSolution(arr,arr.length);
	}
}
