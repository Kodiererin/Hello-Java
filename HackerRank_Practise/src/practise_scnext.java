import java.util.*;
public class practise_scnext 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x=1;
		boolean m = true;
		while(m)
		{
			try
			{
				System.out.println(x+" "+sc.nextLine());
			}
			catch(Exception e)
			{
				m = false;
			}
		}
	}
}
	
