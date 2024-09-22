//	Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//	You may assume that each input would have exactly one solution, and you may not use the same element twice.
//	You can return the answer in any order.

package Questions;
public class a1_Question1 
{
	public static int[] twoSum(int[] nums, int target)
	{
		int[] sum = new int[2];
		for(int i=0 ; i<nums.length-1 ; i++)
		{
			for(int j=i+1 ; j<nums.length ; j++)
			{
				if(nums[i]+nums[j]==target)
				{
					sum[0] = i;
					sum[1] = j;
					return sum;
				}
			}
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		int[] abcd = {3,2,4,6};
		int target = 10;
		twoSum(abcd , target);
	}
}
