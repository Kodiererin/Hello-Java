package playWith_Strings;

public class userName 
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter User Name");
		String name = sc.nextLine();
		if(name.length()<8)
		{
			System.out.println("INVALID; Username length < 8 characters");
		}
		else
		{
			int ctr=0;
			if(name.charAt(0)>='a' && name.charAt(0)<='z' || name.charAt(0)>'A'&& name.charAt(0)<='Z')
			{
				for(int i=1 ; i<name.length() ; i++)
				{
					if(name.charAt(i)>='a' && name.charAt(i)<='z' || name.charAt(i)>'A'&& name.charAt(i)<='Z' || name.charAt(i)=='_')
					{
						ctr++;
					}
					else
					{
						System.out.println("Invalid INVALID;"+name.charAt(i)+" character not allowed ");
						break;
					}
				}
				if(ctr==name.length()-1)
				{
					System.out.println("VALID");
				}
			}
			else
			{
				System.out.println("INVALID; Username begins with non-alphabetic character");
			}
		}
	}
}
