package b_concept_Stack;

import java.util.Stack;

public class problem_06_NextGreaterElement
{
	public static void naiveSolution(int[] arr , int size)
	{
		for(int i=0 ; i<size ; i++)
		{
			int j;
			for(j = i+1 ; j<size ; j++)
			{
				if(arr[j]>arr[i])
				{
					System.out.println(arr[j]);
					break;
				}
			}
			if(j==size)
			{
				System.out.println(-1);
			}
		}
	}
//	This is the efficient Solution
	public static void efficientSolution(int[] arr , int size)
	{
//		Time Complexity : O(n)
//		O(n) Auzxillary Space and Stack takes O(1) time for insertion deletion
		Stack<Integer> s = new Stack<>();
		s.add(arr[size-1]);
		System.out.println("-1");
		for(int i= size-2 ; i>=0 ; i--)
		{
			while(!s.isEmpty() && s.peek()<=arr[i])
			{
				s.pop();
			}
			int nextGre = (s.isEmpty())?(-1):(s.peek());
			System.out.println(nextGre);
			s.add(arr[i]);
		}
//		Answer is the reverse!. So, Be careful.
	}
	public static void main(String[] args)
	{
		int[] arr = {5,15,10,8,6,12,9,18};
		naiveSolution(arr,arr.length);
		System.out.println("Efficient Solution is the Reverse of the So Mind it!");
		efficientSolution(arr,arr.length);
	}
}
