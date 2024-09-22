//	Leetcode Question
//	input -> 5[a]6[2]
//	output-> aaaaa22
// 	This Code should be more modified because You must See that What if the input is5[a6[bc]] then
package practise_LeetCode;

import java.util.Scanner;

public class leetcode_DecodeString
{
	static String decodeit(String s)
	{
//		System.out.println("Decode The String As Soon As Possible");
		System.out.println("The String is "+s);
		String temp = "";
		String temp2 = "";
		for(int i=0 ; i<s.length() ; i++)
		{
			if(s.charAt(i)>=48 && s.charAt(i)<=57)
			{
				int num = s.charAt(i);
				i+=2;
				while(s.charAt(i)!=']')
//				while(s.charAt(i)!='[' || s.charAt(i)!=']')
				{
					temp = temp + s.charAt(i);
					i++;
				}
				System.out.println(temp);
				for(int j=0 ; j<num-48 ; j++)
				{
					temp2 = temp2 + temp;
				}
				temp = "";
			}
		}
		return temp2;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(decodeit(sc.nextLine()));
	}
}