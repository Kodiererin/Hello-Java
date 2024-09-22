package ArrayQuestion;

import java.util.Scanner;

public class Question1_Barchart 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number of Rows");
		int rows = sc.nextInt();
		System.out.println("Enter the number of coloumns ");
		int columns = sc.nextInt();
		char [][] graph = new char[columns][rows];
		for(int i=0 ; i<columns ; i++)
		{
			System.out.println("Enter the Data ");
			int data = sc.nextInt();
			for(int j=data ; j<graph[i].length ; j++)
			{
				graph[i][j] = '*';
			}
		}
		for(int loop=0 ; loop<graph.length ; loop++)
		{
			for(int loop1 =0 ; loop1<graph[0].length ; loop1++)
			{
				System.out.print(graph[loop][loop1]);
			}
			System.out.println("");
		}
	}
}
