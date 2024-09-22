package s_1_String;
//	We are given a String and we have to check if the String is Palindrome or not.
//	A string is called Palindrome if left-Right == right-left


public class problem1_Palindrome
{
//	---------------- Naive Method -------------------
//	Time Complexity : Theta(n) time and Auxillary Space Theta(n)
	public static boolean isPalindrome(String str)
	{
		StringBuilder rev = new StringBuilder(str);
		rev.reverse();
		return str.equals(rev.toString());
	}
//	Efficient Method : O(n) time.
//	and O(1) at the best time. It requires constant extra space.
//	Idea : First Compare First and Last CHaracter.
//	Then Compare the second and second last character and so on.

//	Case 1 : If the Length of the String is Even. -> if Begin and end cross then they are palindrome
//	Case 2 : Stop when You reach @ the middle of the String.
	public static boolean isPalindromeEfficient(String str)
	{
		int begin = 0;
		int end = str.length()-1;
		while(begin<end)
		{
			if(str.charAt(begin)!=str.charAt(end))
				return false;
			begin++;
			end--;
		}
		return true;
	}
	public static void main(String[] args)
	{
//		checkPalindrome("aaamaaa");
		System.out.println(isPalindrome("aaamaaa"));
		System.out.println(isPalindromeEfficient("racecar"));
	}
}
