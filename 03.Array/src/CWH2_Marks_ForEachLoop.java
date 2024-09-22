//@CodeWithHarry
//#For_Each_Loop
//$Q>. Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
import java.util.*;
public class CWH2_Marks_ForEachLoop 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Size =");
			int x = sc.nextInt();
		int [] marks = new int[x];
		System.out.println("Enter the marks ");	
			for(int i=0 ; i<marks.length ; i++)
			{
				marks[i] = sc.nextInt();
			}
		System.out.print("Enter the integer that you want to find =");
			int find = sc.nextInt();
		int ctr = 0;
		for(int element : marks)
		{
			ctr++;
			if(element == find)
			{
				System.out.println("Element Found in array number "+ctr);
			}
		}
	}

}
