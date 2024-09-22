//	5[a6[bc]]

package practise_LeetCode;
public class leetCode_DecodeString01 
{
	static void compute(String s) throws Exception
	{
		String x = "";
		String y = "";
		String z = "";
		int a;
		int b;
		int c;
//		for(int i=s.length()-1 ; i>=0 ; i--)
//		for(int i=0 ; i<s.length() ; i++)
//		{
//			if(s.charAt(i)>=48 && s.charAt(i)<=57)
//			{
//				i+=2;
//				
//			}
//		}
		try
		{
			for(int i=s.length()-1 ; i>=0 ; i--)
			{
				if(s.charAt(i)==']')
				{
					i-=2;
					while(i!='[')
					{
						z = z+s.charAt(i);
						i--;
					}
				}
				i=-1;
				c = s.charAt(i);
				for(int j=0 ; j<c-48 ; j++)
				{
					y = y+z;
				}
			}
			System.out.println(y);
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured"+e);
		}
	}
	public static void main(String[] args)throws Exception
	{
		compute("5[a6[b]]");
	}
}