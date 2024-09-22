package HackerRankQ;

import java.io.IOException;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

public class solveQ_String_tokens 
{
	static void eleminate(String s)
	{
		String x = "";
		int i=0;
		try
		{
			while(i!=s.length())
			{
				if(s.charAt(i)=='!'|| s.charAt(i)==','||s.charAt(i)=='?'||s.charAt(i)=='.'||s.charAt(i)=='_'||s.charAt(i)=='\'' )
				{
					i = i+1;
				}
				x = x+s.charAt(i);
				i++;
			}
			System.out.println(x);
		}
		catch(Exception e)
		{
			System.out.println(x);
		}
	}
	static void count(String x)
	{
		int i=0;
		int count=0;
		while(i!=x.length())
		{
			if(x.charAt(i)==' ')
			{
				count++;
			}
			i++;
		}
		System.out.println(count+1);
	}
	public static void main(String[] args) throws IOException 
	{
		java.io.InputStreamReader is = new java.io.InputStreamReader(System.in);
		java.io.BufferedReader br = new java.io.BufferedReader(is);
		System.out.println("Enter String ");
		String s = br.readLine();
		System.out.println(s);
		eleminate(s);
		count(s);
	}
}
