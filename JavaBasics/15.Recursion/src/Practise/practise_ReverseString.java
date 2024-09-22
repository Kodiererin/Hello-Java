package Practise;
import java.io.*;

// Program to reverse the String....
public class practise_ReverseString 
{
	public static void reverseData(String data , int index)
	{
		if(index == 0) 
		{
			System.out.print(data.charAt(0)+"");
			return;
		}
		System.out.print(data.charAt(index)+"");
		reverseData(data , index-1);
	}
	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter The String that you want to reverse");
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String data = br.readLine();
		reverseData(data,data.length()-1);
	}
}
