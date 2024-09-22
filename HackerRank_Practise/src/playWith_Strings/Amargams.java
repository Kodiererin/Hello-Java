package playWith_Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Amargams 
{
	public static boolean check(String a , String b)
	{
 		a = a.toLowerCase();
		b = b.toLowerCase();
		if(a.length()!=b.length())
		{
			return false;
		}
		int i=0;
		int j=0;
		while(i<a.length() && j<b.length())
		{
			if(a.charAt(i)==b.charAt(j))
			{
				i+=1;
			}
			if(a.charAt(i)!=b.charAt(j))
			{
				j+=1;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) throws IOException 
	{
		InputStreamReader obj = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(obj);
		System.out.println("Enter Two Words That You want to check");
		boolean y = check(br.readLine(),br.readLine());
		if(y==true)System.out.println("Anagrams");
		if(y==false)System.out.println("Not Anagrams");
	}
}
