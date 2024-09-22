//	Problem 2 : Check if a string is Sequence of Other.
//	Subsequence is obtained by removing 0 or more characters.
//	Whatever characters we pick(which we dont remove) we have to keep the characters in the same order as they appear in the original String.
//	Subsequence of "ABC" are : "",A,B,C,AB,BC,AC,ABC
//	The total subsequence of a string of length n is 2^n.
//	Input : s1  = "ABCD"		s2 : AD 			o/p : True.
//	Input : s1  = "ABCDE"		s2 : AED			o/p : False.

//	Write down a function that takes two string and returns true if s2 is the subsequence of
//	s1 and false if it is not.
package s_1_String;
public class problem2_Subsequence
{
//	Efficient Solution : Iterative Solution
//	Time Complexity : O(m+n)		 [m+n] is m+n
//	Auxillary Space : O(1)
	public static boolean isSubsequence(String str1,String str2 , int n , int m)
	{
		if(n<m)							//		optimization
			return false;
		int j=0;
		for(int i=0 ; i<n && j<m ; i++)
		{
			if(str1.charAt(i)==str2.charAt(j))
				j++;
		}
		return (j==m);			// if j=m return true else return false
	}
//	Efficient Solution 2 : Recursive Solution
//	Time Complexity : O(m+n)
//	Auxillary Space : O(m+n)
	public static boolean isSubsequenceRecursive(String s1 , String s2 , int n , int m)
	{
		if(m==0)
			return true;
		if(n==0)
			return false;
		if(s1.charAt(n-1)==s2.charAt(m-1))
			return isSubsequenceRecursive(s1,s2,n-1,m-1);
		else
			return isSubsequenceRecursive(s1,s2,n-1,m);
	}
	public static void main(String[] args)
	{
		String s1 = "ABC";
		String s2 = "BA";
		System.out.println(isSubsequence(s1,s2,s1.length(), s2.length()));
		System.out.println(isSubsequenceRecursive(s1,s2,s1.length(),s2.length()));

	}
}
