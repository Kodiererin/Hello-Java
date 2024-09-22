import java.util.*;
	class Array_1
	{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Marks");
			int [] marks = new int[sc.nextInt()];
			int len = marks.length;			
			for(int i = 0 ; i<len ; i++)
			{
				marks[i] = sc.nextInt();
			}
			System.out.println("--------------------------------");
			int j=0;
			while(j<len)
			{
				System.out.print(marks[j]+" , ");
			j++;
			}
			System.out.println("--------------------------------");
		System.out.println("Do While Loop");
		int m =-1 ;
		do 
		{
			m++;
			System.out.print(marks[m]+" , ");			
		}
		while(m<len);
		}		
	}
