package Strings;

public class Amagrams 
{
	public static void amagram(String s)
	{
		
	}
	public static void main(String[] args) 
	{
		java.util.ArrayList<String > word = new java.util.ArrayList<>();
		System.out.println("Enter The Word ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String wor = sc.nextLine();
		String x = " ";
		
		{
			int i=0;
			int j=0;
			while(i!=wor.length())
			{
				if(wor.charAt(i)!=32)
				{
					x = x+wor.charAt(i);
				}
				else
				{
					word.add(j, x);
					x = null;
				}
				i++;
			}
		}
		
		{
			for(int i=0 ; i<=word.size() ; i++)
			{
				System.out.println(word.get(i));
			}
		}
	}
}
