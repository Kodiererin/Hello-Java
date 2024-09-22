package playWith_Strings;

public class lexoGraphicalOrder 
{
	public static String getSmallestAndLargest(String s, int k)
	{
		String smallest = "";
	    String largest = "";
//		s = s.toLowerCase();
		String temp = "";
		String[] obj = new String[s.length()];
		for(int i=0;i<=s.length()- k; i++)
		{
			for(int j=0  ; j<k ; j++)
			{
				temp = temp+s.charAt(i);
				i++;
			}
			i-=k;
			obj[i] = temp;
			temp="";
		}
//		for(int l=0;l<=s.length()-k ; l++)
//		{
//			System.out.println(obj[l]);
//		}
		System.out.println("______________________");
//		sorting begins
		for(int m=0 ;	m<=s.length()-k ; m++)
		{
			for(int n=0 ; n<s.length()-k ; n++)
			{
				if(obj[m].charAt(0)<=obj[n].charAt(0))
				{
					String ujj = obj[m];
					obj[m] = obj[n];
					obj[n] = ujj;
				}
			}
		}
		smallest = obj[0];
		largest =  obj[s.length()-k];
		return smallest + "\n" + largest;
//		for(int k=0;k<=s.length()-x ; k++)
//		{
//			System.out.println(obj[k]);
//		}
	}
	public static void main(String[] args) 
	{
		System.out.println(getSmallestAndLargest("fsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH" , 100)) ;
//		check();
	}
}
