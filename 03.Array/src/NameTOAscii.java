import java.util.*;
public class NameTOAscii {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Your Name will be Printed In ASCII Value");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Full name Name ");
			String name = sc.nextLine();
		int x = name.length();
		char [] words = new char[x];
		int [] ascii = new int[x]; 
		for(int i=0 ; i<x ; i++)
		{
			words [i] = name.charAt(i);
			System.out.print(words[i]+" ");
		}
		for(int j=1 ; j< x ; j++)
		{
			int a = words[j];
			System.out.print(a+" ");
		}
	}

}
