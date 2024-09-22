package DiscreteMathematics;
import java.util.*;
public class LCMnGCD 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers that you want to find GCD and LCM");
		int x = sc.nextInt();
		int y = sc.nextInt();
		long z = x*y;
		int a = GCD.findGCD(x, y);
		System.out.println("GCD ="+a);
		System.out.println("------------------------");
		System.out.println("LCM = "+z/a);
	}
}
