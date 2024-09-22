package Project;

import java.util.Scanner;

public class ticTactoe_game
{
	public static void show(char [][]array)
	{
		for(int i=0 ; i<array.length ; i++)
		{
			for(int j=0 ; j<array[i].length ; j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void getData() 
	{
		Scanner sc = new Scanner(System.in);
		int n = 3;
		char[][] game = new char[n][n];
		for(int i=0 ; i<n ; i++)
		{
			for(int j=0 ; j<n ; j++)
			{
				game[i][j] = sc.next().charAt(0);
			}
		}
		show(game);
	}
	public static void getData1()
	{
		Scanner sc = new Scanner(System.in);
		int n = 3;
		char[][] game1 = new char[n][n];
		boolean check = true;
		while(check)
		try
		{
			System.out.println("Enter The Coordinates at which you want to enter");
			game1[sc.nextInt()-1][sc.nextInt()-1] = 'o';
			boolean check2 = true;
			while(check2)
				{
					if(game1[((int)Math.random()*(5))+1][((int)Math.random()*(5))+1] == ' ')
						{
							game1[((int)Math.random()*(2))][((int)Math.random()*(2))] = 'x';
							check2 = false;
						}
					else
					{
						check2 = true;
					}
				}
		}
		catch(Exception e)
		{
			show(game1);
			check = false;
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome to Tic Toc Game ");
//		getData();
		getData1();
	}
	
}