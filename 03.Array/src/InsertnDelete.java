// ye class insert aur delete krega arrays ko
import java.util.*;
public class InsertnDelete 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Elements in the array ");
			int x = sc.nextInt();
//		System.out.println("Enter the Number that you want to deletr");
//			int del = sc.nextInt();
		int ujjwarr[] = new int[x];
		System.out.println("Enter the Numbers ");
		for(int i=0 ; i<ujjwarr.length ; i++)
		{
			ujjwarr[i] = sc.nextInt();
		}
//		insert the element
		System.out.println("Enter the element index that you want to insert");
			int index = sc.nextInt();
		System.out.println("Enter the Numbe that you want to Insert ");
			int ins = sc.nextInt();
		System.out.println(ujjwarr.length);
		for(int i=0 ; i<=ujjwarr.length ; i++)
		{
			if(i==index)
			{
				int temp = ujjwarr[i];
				ujjwarr[i+1] = ujjwarr[i]; 
				ujjwarr[i] = ins;
			}
		}
		for(int j=0 ; j<=ujjwarr.length ; j++)
		{
			System.out.println(ujjwarr[j]);
		}
	}
}
