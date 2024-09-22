package Practise;

import java.util.Scanner;

public class practise_powerOf_n 
{
	public static int powerofN(int x , int power)
	{	
		if(power==1)
			return x;
		return x*powerofN(x,power-1);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int power = sc.nextInt();
		sc.close();
		System.out.println(powerofN(number , power));
	}
}