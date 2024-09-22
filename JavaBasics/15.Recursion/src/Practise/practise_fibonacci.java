//Fibonacci Series : 0 1 1 2 3 5 8 13 21 
package Practise;

import java.math.BigInteger;

public class practise_fibonacci 
{
	public static void fibonacci(int x , int y , int times)
	{
		if(times==0) {
			System.out.println(x);
			return;
		}
		fibonacci(y , x+y ,times-1);
		
	}
	public static void sumFibonacci(int x , int y , int times , int sum)
	{
		if(times==0) {
			System.out.println(sum);
			return;
		}
		sumFibonacci(y , x+y ,times-1 , sum+=y);
	}
	
//	for Very big Integer a testing is going to happen
	
	public static void sumFibonacci_BigInteger(BigInteger x , BigInteger y , BigInteger times , BigInteger sum)
	{
		if(times==BigInteger.ZERO) {
			System.out.println(sum);
			return;
		}
		sumFibonacci_BigInteger(y , x.add(y) ,times.subtract(BigInteger.ONE) , sum.add(y));
	}
	public static void main(String[] args) 
	{
		int max = 50;
		for(int i=0 ; i<max ; i++)
		{
			fibonacci(0 , 1 , i);
		}
		System.out.print("\nThe Sum of the Fibonacci Series is ");
		sumFibonacci(0 , 1 , max-1 , 0);
		System.out.println("\n\nBigInteger Sum");
		BigInteger bgi = new BigInteger("50");
		sumFibonacci_BigInteger(BigInteger.ZERO , BigInteger.ONE , bgi.subtract(BigInteger.ONE) , BigInteger.ZERO);
	}
}
