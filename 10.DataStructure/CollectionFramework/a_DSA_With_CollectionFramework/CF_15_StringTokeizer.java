package a_DSA_With_CollectionFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.StringTokenizer;

public class CF_15_StringTokeizer
{
	public static void main(String[] args) throws IOException
	{
//		String tokenizer : String Tokenizer seperates the Tokens(String) and the Delimenetrs(like (space),=,+,\n)etc
		String data = "Name=Ujjwal;Aim=Software Engineer; Age=20";
		java.util.StringTokenizer st  = new java.util.StringTokenizer(data,"=;");
		String s;
//		while(st.hasMoreElements())
		while(st.hasMoreTokens())			// any two while conditons are allowed.
		{
			s = st.nextToken();
//			System.out.println(s);
		}
		FileInputStream fis = new FileInputStream("C:/Users/Ujjwal/Desktop/data.txt");
		byte[] b = new byte[fis.available()];
		fis.read(b);
		String data2 = new String(b);
		String t;
		StringTokenizer st2 = new StringTokenizer(data2,":,");
		while(st2.hasMoreElements())
		{
			t = st2.nextToken();
			System.out.println(t);
		}

//		Lets put the data in the ArrayList
//		will work when a file is made of Numbers.
		java.util.ArrayList<String> al = new java.util.ArrayList<>();
		while(st2.hasMoreElements())
		{
			String m = st2.nextToken();
			al.add(String.valueOf(m));
		}
//		printing the elements
		System.out.println(al);




	}

}
