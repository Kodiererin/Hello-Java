//	We are given a string with possible characters we need to find out the leftmost character that
//	Repeat.

//	I/P : "geeksforgeeks"						o/p : 0
//	I/P :  "abbcc"								o/p : 1		(index of b)
//	I/P : "abcd	"								O/P : -1

package s_1_String;

import java.util.Arrays;

public class problem4_LeftMostRepeatingCharacter
{

	public static void main(String[] args)
	{
		String str = "abbcc";

		System.out.println(CHAR);					// CHAR means 256 characters.


		System.out.println(leftMost(str));			// naive solution
		System.out.println(leftMost2(str));			// better function

		System.out.println(leftMost3(str));			// Efficient Function
		System.out.println(leftMost3_1(str));			// Efficient Function
	}



//	write downn a function that takes a String as an argument and returns index of left most occuring
//	character, if there are all distinct -1


//	Naive Solution
//	We traverse every character and we check if it repeats
	public static int leftMost(String str)					// time complexity - O(n^2)
	{
		for(int i=0 ; i<str.length() ; i++)
		{
			for(int j=i+1 ; j<str.length() ; j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					return i;
				}
			}
		}

		return -1;
	}

//	Better Approach : Based on String as An Array
//	Solution Works in Linear time but require two Loops.
//	1st loop for finding frequency.
//	Second Loop for finding the first character.
	static final int CHAR = 256;
	public static int leftMost2(String str)
	{
		int[] count = new int[CHAR];				// we are creating array of size 256
		for(int i=0 ; i<str.length() ; i++)
		{
			count[str.charAt(i)]++;
		}
		for(int i=0 ; i<str.length() ; i++)
		{
			if(count[str.charAt(i)]>1)
				return i;
		}
		return -1;
	}

//	Efficient Solution : Requires one loop,
//	Idea : Idea of this efficient implementation is traverse from left to right and keep track of
//	index of every character.
//	We use Characters as indexes.
	static final int CHAR2 = 256;
	public static int leftMost3(String str)
	{
		int[] fIndex = new int[CHAR2];
		Arrays.fill(fIndex, -1);
		int res = Integer.MAX_VALUE;
		for(int i=0 ; i<str.length() ; i++)
		{
			int fi = fIndex[str.charAt(i)];
			if(fi==-1)
				fIndex[str.charAt(i)]=i;
			else
				res = Math.min(res, fi);
		}
		return (res==Integer.MAX_VALUE)?-1:res;
	}
//	Time Complexity : Linear time Solution 			O(n+CHAR) ie : O(n+256)
//	Auxillary Space : O(CHAR) ie : O(256)

//	Effieicnt Solution -2 We can traverse from the right - left.
//	we dont  need to compare previous res with current value and dont need to assign -1 to every index.

//	static final int CHAR = 256;				// variable has already been declared.
	public static int leftMost3_1(String str)
	{
		boolean[] visited = new boolean[CHAR];													// yha pe 256 length ka array ban rha h. Ar fir jaise jaise usme characters aaa rhe h woh badhta jaaa rha h
		int res = -1;																			// characters ko ASCII ke values me laya jaa rha h ar repetative arrays ko +1 se badha rha h
		for(int i=str.length()-1 ; i>=0 ; i--)													// jis array ka zaada h number usi ko liya jaaa rha h. ar bs ho gya.
		{
			if(visited[str.charAt(i)])
				res = i;
			else
				visited[str.charAt(i)]=true;
		}
		return res;
	}

//	Same Time complexity and Auxillary Space as the Previous Function.

}
