package Multidimensional_Array;

import java.util.Scanner;

public class MD_1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows and Columns of Matrix ");
			int rows = sc.nextInt();
			int columns = sc.nextInt();
		
		System.out.println("Enter The data os the matrix");
		System.out.println("Matrix 1");
		int matrix1 [][] = new int[columns][rows]; 
		for(int i=0 ; i<columns ; i++)
		{
			for(int j=0 ; j<rows ; j++)
			{
				matrix1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix 2");
		int matrix2 [][] = new int[columns][rows];
		for(int i=0 ; i<columns ; i++)
		{
			for(int j=0 ; j<rows ; j++)
			{
				matrix2[i][j] = sc.nextInt();
			}
		}
		int matrixSum[][] = new int[columns][rows];
		for(int a=0 ; a<columns ; a++)
		{
			for(int b=0 ; b<rows ; b++)
			{
				matrixSum[a][b] = matrix1[a][b] + matrix2[a][b];
			}
			System.out.println();
		}
		System.out.println("Matrix Sum Result ");
		for(int c = 0 ; c<columns ; c++)
		{
			for(int d=0 ; d<rows ; d++)
			{
				System.out.print(matrixSum[c][d]+"	");
			}
			System.out.println();
		}
	}
}
