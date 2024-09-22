//Sample Input. Print using printf Statement
//		java 100
//		cpp 65
//		python 50

//Sample Output
//			================================
//			java           100 
//			cpp            065 
//			python         050 
//			================================
import java.util.*;
public class PrintUsingPrintf 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for(int i=1 ; i<=3 ; i++)
		{
			String name = sc.next();
			int marks = sc.nextInt();
			System.out.printf("%-15s%03d",name,marks);
		}
		System.out.println("\n================================");
	}
}
