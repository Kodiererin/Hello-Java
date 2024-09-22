package Questions;

public class a2_Palindrome 
{
	public static void panlindrome(int x)
	{
		String a = x+"";
		String b = "";
		for(int i=a.length()-1 ; i>=0 ; i--)
		{
			b+=a.charAt(i);
		}
		System.out.println(a+"   "+b);
		System.out.println(a.compareTo(b));
	}
	public static void main(String[] args) 
	{
		panlindrome(123);
	}
}
