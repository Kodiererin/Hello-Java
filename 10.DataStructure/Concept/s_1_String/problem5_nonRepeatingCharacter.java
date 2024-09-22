//		Interview Based Question.

package s_1_String;
//	We have to find the Non Repeating Character in a String.
//	I/P : "GEEKSFORGEEKS"					o/p : 5				<-index
//	I/P : "abcabc"							o/p : -1			<-index
//	O/P : "apple"							o/p : 0				<-index
public class problem5_nonRepeatingCharacter
{
	public static void main(String[] args)
	{
		String str  ="geeksforgeeks";
		System.out.println(nonRepeating(str));
	}
//	Naive Solution :
//	Idea : We begin from the first Character , we compare with all the other characters and if any of the character then we set the flag as true.
//	which means it is repeating character.
//	Time Complexity : O(n^2) and Auxillary Space : O(1)
	public static int nonRepeating(String str)
	{
		for(int i=0 ; i<str.length() ; i++)
		{
			boolean flag = false;
			for(int j=0 ; j<str.length() ; j++)
			{
				if(i!=j && str.charAt(i)==str.charAt(j))
				{
					flag = true;
					break;
				}
			}
			if(!flag)
				return i;
		}
		return -1;
	}
//	Approach for Linear Time that require two Traversal
//	Time Complexity : O(n)
//	Auxillary Space : O(1)
	static final int CHAR = 256;
	public static int nonRepeating2(String str)
	{
		int [] count = new int[CHAR];
		for(int i=0 ; i<str.length() ; i++)
		{
			count[str.charAt(i)]++;
		}
		for(int i=0 ; i<str.length() ; i++)
		{
			if(count[str.charAt(i)]==1)
				return i;
		}
		return -1;
	}
//	Approach : Try to Solve using One Traversal
//	static final int CHAR = 256;
	public static int nonRepeating3(String str)
	{

	}
}
