package s_1_String;
//	Anagram means Weather two strings are permutations or not.
//	Which means every character which appears in the first string should also appear in the second string and the frequency of
//	every character must also be same. However the order of appearance may differ.
import java.util.Arrays;

//	s1 : "listen"		s2: "silent"				o/p : Yes
//	s1 : "aaacb"		s2: "cabaa"					o/p : Yes
//	s1 : "aab"			s2: "bab"					o/p : No
public class problem3_checkANAGRAM
{
	public static void main(String[] args)
	{
		System.out.println(isAnagram("listen" , "silent"));
		System.out.println(isAmagram2EFFICIENT("listen","silent"));
	}
//	Write a functions that two strings as functions and returns yes/no if the functions are Anagrams or not.
//	Efficient  Method :
//	This method travels one time in the loop and return true/false if the Strings are Amagram
//	The idea is Standard Character Counting Technique.
//	We use characters as Index count array.

//	We Initialise a count array, for every array in String1 we increment the count and for every character
//	in String 2 we decrease the count and if the two strings are amagram then finally the count array should be zero.

//	Its like Counting frequency of character in String 1 and Counting frequency of character in String 2.
//	And the comparing both of them.

//	So Instead of using two count array we are using One count array.

//	Time complexity : O(n + CHAR) 		n = length of the String
//	Auxillary Space : O(CHAR)			CHAR represents : Character Array that we are creating.

	static final int CHAR = 256;			// we can increase more for Upper case Characters
	public static boolean isAmagram2EFFICIENT(String str1, String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}
		int count[] = new int[CHAR];
		for(int i=0 ; i<str1.length() ; i++)
		{
			count[str1.charAt(i)]++;
			count[str2.charAt(i)]--;
		}
		for(int i=0 ; i<CHAR ; i++)
		{
			if(count[i]!=0)
				return false;
		}
		return true;
	}

//	Naive Method : i_Sorting Method.
//	We first Sort the Strings.
//	If both the Characters are amagrams then both the string must appear same.
//	This function requires nLog(n) time because Sort function takes nLog(n) time.
	public static boolean isAnagram(String s1 , String s2)
	{
		if(s1.length()!= s2.length())
		{
			return false;
		}
		char a1[] = s1.toCharArray();
		Arrays.sort(a1);						// this is Important!
		s1 = new String(a1);

		char a2[] = s2.toCharArray();
		Arrays.sort(a2);						// Arrays Dhyan se Dekho.
		s2 = new String(a2);

		return s1.equals(s2);
	}

}
