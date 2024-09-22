package Practise;
import java.util.*;
public class Practise1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		String y = sc.next();
		System.out.println(x.length()+y.length());
		if(x.compareToIgnoreCase(y)>1)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("NO");
		}
		x = x.replace(x.charAt(0), x.toUpperCase().charAt(0));
	    y = y.replace(y.charAt(0), y.toUpperCase().charAt(0));
	    System.out.println(x+" "+y);
	}
}
