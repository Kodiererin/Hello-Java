package Practise_Exception;
import java.util.*;
class TestMethodException
{
	Scanner sc = new Scanner(System.in);
	public void show()throws Exception
	{
		System.out.println("Enter The Name ");
			String name = sc.next();
			try
			{
				if(name == "Ujjwal");
				{
					throw new Exception();
				}
			}
			catch(Exception e)
			{
				System.out.println("Dhut burbak E Ka h! Aisa Exception fhrk ke marunga na");				
			}
			finally
			{
				System.out.println("Sb theek Ho jayega re Baba");
			}
			System.out.println("Kem Cho Mota Bhai");
	}
}
public class Method_Exceptiopn 
{
	public static void main(String[] args) throws Exception 
	{
		TestMethodException t1 = new TestMethodException();
		t1.show();
	}
	
}
