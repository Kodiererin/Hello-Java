//#CODE WITH HARRY
//Write a program to reverse the array and show it
//#Write a Java program to reverse an array.
import java.util.*;
public class CWH5_Reverse_Array 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Reverse The Array");
		System.out.println("Enter the array size");
			int x = sc.nextInt();
		int [] hello = new int[x];
		System.out.println("Enter the Array Value");
		for(int i= 0 ; i<hello.length ; i++)
		{
			hello[i] = sc.nextInt();
		} 
		// yha se data user se lena ho gya ab aage kro
//		int y= hello.length-1;
//		for(int j= 0 ; j<hello.length ; j++)
//		{
//			
//			
//					hello[j] = hello[j] + hello[y-j];
//					hello[y-j] = hello[j] - hello[y-j];
//					hello[j] = hello[j] - hello[y-j];
//			
//		}
		for(int m=(hello.length-1) ; m>=0 ; m--)
		{
			System.out.println(hello[m]+" ");
		}
	}

}
