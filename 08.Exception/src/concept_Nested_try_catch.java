import java.util.Scanner;

public class concept_Nested_try_catch 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int[] marks = new int[3];
		marks[0] = 7;
		marks[1] = 12;
		marks[2] = 21;
		boolean flag = true;
		while(flag)
		{
			System.out.println("Enter the value of Index ");
			int ind = sc.nextInt();
			try
			{
				System.out.println("Welcome Ujjwal , to Nested Try");
				try
				{
					System.out.println(marks[ind]);
					flag = false;
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println(e);
					System.out.println("Sorry This index does not exist");
					System.out.println("Exception in level 2");
				}
				catch(Exception e)
				{
					System.out.println("Exception in level 1");
				}
			}
			catch(Exception e)
			{
				System.out.println("Kem cho Ujjwal");
				System.out.println("Mojame Ki Nhi?");
			}
		}
		System.out.println("Thank You Ujjwal Writing this code");
	}
}


//SYNTAX OF MULTIPLE IF
//
//	try
//	{
//		try
//		{
//			<your code here>		
//		}
//		catch(exception1 e1)
//		{
//			<your code here>
//		}
//		catch(exception2 e2)
//		{
//			<your code here>
//		}
//	}
//catch(exception e)
//	{
//		<your code here>
//	}