package MethodnArray;
import java.util.*;
class sortMyarray
{
	public static int[] sort(int...is)
	{
		int temp = 0;
		for(int i=0 ; i<is.length ; i++)
		{
			for(int j=1 ; j<is.length ; j++)
			{
				if(is[j]<=is[i])
				{
					temp = is[j];
					is[j] = is[i];
					is[i] = temp; 
				}
			}
		}
		return is;
	}
}
public class SortMyArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Numbers ");
			int x = sc.nextInt();
		int [] ujj = new int[x];
		System.out.println("Enter Numbers to get the sorted result");
		for(int i=0 ; i<=ujj.length ; i++)
		{
			ujj[i] = sc.nextInt();
		}
	}
}
