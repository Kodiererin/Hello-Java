package i_Sorting;

import java.util.Arrays;

public class z_ChocolateDistributionProblem
{
/*	We are given an Array of chocolates, we have to select m Packet of chocolates/array such that the Distribution of chocolates is
 * 	Fair . The Minimum chocolates that a child gets and the maximum chocolates that another child gets has the minimum difference.
 */
	public static void chocolateProblem(int[] chocolates , int children)
	{
		if(children>chocolates.length)
			System.out.println("No of Children is Greater than No of Chocolates");
		else
		{
			Arrays.sort(chocolates);
			int res = chocolates[children-1]-chocolates[0];
			for(int i=1 ; (i+children-1)<chocolates.length; i++)
			{
				res = Math.min(res, chocolates[i+children-1]-chocolates[i]);
			}
			System.out.println(res);
		}

	}
//	Write a problemm that takes an array and m(no of children) as input and returns the minimum and Maximun difference m picked Items
//	from the array.
	public static void main(String[] args)
	{
//		Taking A Random Example
		int[] arr = {3,4,1,9,56,7,9,12};
		int m = 3;
		chocolateProblem(arr,m);
	}
}
