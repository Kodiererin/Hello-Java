import java.util.Scanner;

public class concept_finallyBlock_Santosh_Sir 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number ");
		int num = sc.nextInt();
		try
		{
			int k = 5/num;
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the Code");
		finally
		{
			System.out.println("Thank You");
		}
	}
}
