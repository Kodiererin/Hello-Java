//#findMyArray/Integer @CodeWithHarry Write a program to find out whether a given integer is present in an array or not.
import java.util.*;
public class CWH1_FindInteger {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Array Size ");
			int x = sc.nextInt();
		System.out.println("Enter "+x+" Numbers ");
		System.out.println("Enter the numbers");
			int [] num = new int[x];
		for(int i=0 ; i<x ; i++)
		{
			num[i] = sc.nextInt();
		}
		System.out.println("Enter the INTEGER that you want to find ");
			int find = sc.nextInt();
		for(int j=0 ; j<x ; j++ )
		{
			if(find == num[j])
			{
				System.out.println("Number Found, Number is in array "+j);
				break;
			}
		}
	}

}
