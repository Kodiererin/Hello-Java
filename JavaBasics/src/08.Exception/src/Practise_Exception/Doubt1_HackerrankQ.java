package Practise_Exception;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Doubt1_HackerrankQ
{
	public static void main(String[] args) throws InputMismatchException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number ");
		try
		{
			long x = sc.nextLong();
		}
		catch(Exception e)
		{
			System.out.println(sc.next()+"Out of range");
		
		}
	}
}
