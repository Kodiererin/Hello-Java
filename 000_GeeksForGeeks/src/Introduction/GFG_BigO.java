package Introduction;

import java.util.Scanner;
//	GFG BigO Video Lecture
public class GFG_BigO 
{
//	checking if the number is prime or not
	static boolean isPrime(int x)
	{
		if(x==1) return false;
		if(x==2 || x==3 ) return true;
		if(x%2==0 || x%3==0 )return false;
		for(int i=5 ; i*i<=x ; i+=6)
			if(x%i==0 || x%(i+2)==0)return false;
		return true;
	}
//	Here the time complexity of the code is BigO(x^2) and the constants are the input when they are given 1,2,3,or even or odd...
//	but the time complexity increases when the input is not the above.
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number That You want to check");
		System.out.println("The Numbber is Prime "+isPrime(sc.nextInt()));
		sc.close();
	}
}
