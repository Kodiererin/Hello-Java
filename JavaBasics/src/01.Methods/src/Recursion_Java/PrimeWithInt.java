package Recursion_Java;
import java.util.*;
public class PrimeWithInt 
{
	static int checkPrime(int x , int y)
	{
		if(x==0)
		{
			return 0;
		}
		if(y>=x)
		{
			return 1;
		}
		if(y<x)
		{
			if(x%y==0)
			{
				return 0;
			}
		}
		return checkPrime(x,y+1);
	}
	static void showTwinPrime(int x , int y , int z)
	{
		if(z<x)
		{
			return;
		}
		if(checkPrime(x,y)==checkPrime(x+2,y))
		{
			System.out.println(x+" "+(x+2));
			showTwinPrime(x+1,y,z);
		}
		else
		{
			showTwinPrime(x+1,y,z);
		}
	}
	public static void main(String[] args)
	{
		showTwinPrime(1,2 , 10);
	}
}
