//	An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
//	
//	Given an integer n, return true if n is an ugly number.

package DailyQuestion;

public class Nov18 
{
	 public static boolean isUgly(int n) 
	 {
		if(n>=0)
		{
			 if(n<=1)
				 return true;
			if(n%2==0)
				return isUgly(n/2);
			else if(n%3==0)
				return isUgly(n/3);
			else if(n%5==0)
				return isUgly(n/5);
			else
			 return false;
		}
		return false;
	 }
	 public static void main(String[] args) 
	 {
		 System.out.println(isUgly(6));
		 System.out.println(isUgly(1));
		 System.out.println(isUgly(14));
		 System.out.println(isUgly(-123466));
	}
}
