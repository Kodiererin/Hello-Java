import java.util.*;
class b_PrintWithDatatype
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The No of times");
			int x = sc.nextInt();
		for(int i=1 ; i<=x ; i++)
		{
			System.out.println("Enter the Number ");
			String num = sc.nextLine();
			if(Byte.parseByte(num)>=Byte.MIN_VALUE && Byte.parseByte(num)<=Byte.MAX_VALUE)
			{
				System.out.println("* Byte");
			}
			if(Short.parseShort(num)>=Short.MIN_VALUE && Short.parseShort(num)<=Short.MAX_VALUE)
			{
				System.out.println("* Short");
			}
			if(Integer.parseInt(num)>=Integer.MIN_VALUE && Integer.parseInt(num)<=Integer.MAX_VALUE)
			{
				System.out.println("* Int");
			}
			if(Long.parseLong(num)>=Long.MIN_VALUE && Long.parseLong(num)<=Long.MAX_VALUE)
			{
				System.out.println("* Long");
			}
			else
			{
				System.out.println(num+" n can't be fitted anywhere.");
			}
		}
	}
}