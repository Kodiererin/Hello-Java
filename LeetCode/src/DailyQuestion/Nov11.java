//		Dekhne Wala Question h, Dobara Theek se Dekhna!


package DailyQuestion;
import java.math.BigInteger;

//	Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
//	
//	Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
//	
//	Return k after placing the final result in the first k slots of nums.
//	
//	Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

//	Input: nums = [1,1,2]
//	Output: 2, nums = [1,2,_]
//	Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//	It does not matter what you leave beyond the returned k (hence they are underscores).

public class Nov11 
{
	public static int removeDuplicates(int[] nums) 		// copied code.
	{
		BigInteger x = BigInteger.valueOf(System.currentTimeMillis());
	    int i = 0;
	    for (int n : nums)
	        if (i == 0 || n > nums[i-1])
	            nums[i++] = n;
	    BigInteger y = BigInteger.valueOf(System.currentTimeMillis());
	    System.out.println("The Time Taken is = "+y.subtract(x));
	    return i;
	    
	}
	
	public static int checkDuplicate(int[] arr)
	{
		BigInteger x = BigInteger.valueOf(System.currentTimeMillis());
		int ctr=0;
		for(int i=1 ; i<arr.length ; i++)
		{
			if(arr[i]>arr[i-1]) {
			arr[ctr] = arr[i-1];
			ctr++;
			}
			
		}
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
		BigInteger y = BigInteger.valueOf(System.currentTimeMillis());
	    System.out.println("The Time Taken is = "+y.subtract(x));
		return ctr;
	}
	public static void main(String[] args) 
	{
		int [] arr = {1,1,2,3,3,3,4,5,6,6,6};
		System.out.println(checkDuplicate(arr));
		System.out.println(removeDuplicates(arr));
		
	}
}
